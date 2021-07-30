package jp.co.internous.rainbow.model.form;

import java.io.Serializable;

/**
 * 検索機能で使うキーワード,カテゴリの変数を定義するクラス
 * キーワード,カテゴリのgetter/setterをそれぞれ記述
 */
public class SearchForm implements Serializable{
	private static final long serialVersionUID = 1L;
	private String keywords;
	private int category;
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
}