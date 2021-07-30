package jp.co.internous.rainbow.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.rainbow.model.domain.MstProduct;

/**
 * index.htmlで商品を表示するインターフェース
 * 検索機能の関数とその処理に使用する変数,データベースに送るsql文を定義
 */
@Mapper
public interface MstProductMapper {
	@Select("SELECT * FROM mst_product")
	List<MstProduct> find();
	
	List<MstProduct> findByProductName(@Param("keywords") String[] keywords);
	
	List<MstProduct> findByCategoryAndProductName(@Param("category") int category, @Param("keywords") String[] keywords);
		
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findById(@Param("id") int id);	
}