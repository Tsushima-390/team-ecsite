package jp.co.internous.rainbow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.rainbow.model.domain.MstCategory;
import jp.co.internous.rainbow.model.domain.MstProduct;
import jp.co.internous.rainbow.model.form.SearchForm;
import jp.co.internous.rainbow.model.mapper.MstCategoryMapper;
import jp.co.internous.rainbow.model.mapper.MstProductMapper;
import jp.co.internous.rainbow.model.session.LoginSession;

/**
 * index.htmlで行われる処理を定義するクラス
 * 各Mapper,LoginSessionを定義し、indexの処理を記述する
 */
@Controller
@RequestMapping("/rainbow")
public class IndexController {
	@Autowired
	private MstCategoryMapper categoryMapper;
	@Autowired
	private MstProductMapper productMapper;
	@Autowired
	private LoginSession loginSession;
	
	/**
	 * トップページであるindex.htmlを表示させる関数
	 * ユーザー情報,カテゴリ,商品情報を取得し、登録されているユーザ以外が
	 * 使用している場合は9桁の負の数字からなる仮ユーザ-IDを設定する
	 * @param m 画面に渡す商品とカテゴリのデータ
	 * @return "index"に遷移
	 */
	@RequestMapping("/")
	public String index(Model m) {
		if (!loginSession.getLogined() && loginSession.getTmpUserId() == 0) {
			int tmpUserId = (int)(Math.random() * 1000000000 * -1);
			// 仮ユーザーIDが9桁になるまで10倍する
			while (tmpUserId > -100000000) {
				tmpUserId *= 10;
			}
			loginSession.setTmpUserId(tmpUserId);
		}
		// カテゴリを取得
		List<MstCategory> categories = categoryMapper.find();	
		// 商品情報を取得
		List<MstProduct> products = productMapper.find();
		
		m.addAttribute("categories", categories);
		m.addAttribute("selected", 0);
		m.addAttribute("products", products);
		// page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession",loginSession);
		return "index";
	}
	
	/**
	 * index.htmlで商品を検索した結果を表示させる関数
	 * 入力されたキーワードと指定されたカテゴリを検索機能に送り、
	 * 検索結果をindex.htmlに反映させる
	 * @param f 入力されたキーワードと選択されたカテゴリのデータ
	 * @param m 画面に渡す商品とカテゴリのデータ
	 * @return "index"に遷移
	 */
	@RequestMapping("/searchItem")
	public String index(SearchForm f, Model m) {
		List<MstProduct> products = null;
		
		String keywords = f.getKeywords().replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim();
		if (f.getCategory() == 0) {
			// カテゴリー未選択の状態
			products = productMapper.findByProductName(keywords.split(" "));
		} else {
			products = productMapper.findByCategoryAndProductName(f.getCategory(), keywords.split(" "));
		}
		List<MstCategory> categories = categoryMapper.find();
		
		m.addAttribute("keywords", keywords);
		m.addAttribute("selected", f.getCategory()); 
		m.addAttribute("categories", categories); 
		m.addAttribute("products", products);
		// page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession",loginSession);
		return "index";	
	}	
}