package com.example.DrinkMachine.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DrinkMachine.dto.ItemDto;

@Repository
public class ItemDao {
	
	 @Autowired
	 private JdbcTemplate jdbc;
	 
	 // 新規登録
	 public int insert(ItemDto itemDto) throws DataAccessException {

	        //１件登録。登録、更新、削除はupdateを使う。第一引数はSQL、第二はPreparedStatement。
	        int rowNumber = jdbc.update("INSERT INTO ITEM(name,"
	                + " unit_Price,"
	                + " count,"
	                + " Is_Pr,"
	                + " Record_Date)"
	                + " VALUES(?, ?, ?, ?, ?)",
	                itemDto.getName(),
	                itemDto.getUnitPrice(),
	                itemDto.getCount(),
	                itemDto.getIsPr(),
	                itemDto.getRecordDate());

	        return rowNumber; //正常終了なら０を返す。異常は０以外を返す。
	 }
	 
	 // 一覧取得
	 public List<ItemDto> selectAll() throws DataAccessException {

	        // ITEMテーブルのデータを全件取得（queryForList）
	        // map→keyとvalueの組み合わせ。それをListで受け取る。
	        List<Map<String, Object>> getList = jdbc.queryForList("SELECT * FROM ITEM");
	        
	        // 結果返却用の変数
	        List<ItemDto> itemList = new ArrayList<>();

	        // 取得したデータを結果返却用のListに格納していく
	        for (Map<String, Object> map : getList) {

	            //Userインスタンスの生成
	            ItemDto itemDto = new ItemDto();

	            // Userインスタンスに取得したデータをセットする
	            itemDto.setCode((int) map.get("code")); //コード
	            itemDto.setName((String) map.get("name")); //名称
	            itemDto.setUnitPrice((int) map.get("unit_Price")); //価格
	            itemDto.setCount((int) map.get("count")); //値段
	            itemDto.setIsPr((int) map.get("Is_Pr")); //おススメフラグ
	            itemDto.setRecordDate((Date) map.get("Record_Date")); //登録日

	            //結果返却用のListに追加
	            itemList.add(itemDto);
	        }
	        
	        return itemList;
	    }
}
