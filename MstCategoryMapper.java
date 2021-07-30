package jp.co.internous.rainbow.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.rainbow.model.domain.MstCategory;

/**
 * index.htmlでカテゴリのリストを表示するインターフェース
 * 検索機能の関数とその処理でデータベースに送るsql文を定義
 */
@Mapper
public interface MstCategoryMapper {
	@Select("SELECT * FROM mst_category")
	List<MstCategory> find();
}