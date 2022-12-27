package com.example.DrinkMachine.form;

import java.util.Date;

public class ItemForm {

	//商品名
	private String name;

	//価格
	private int unitPrice;

	//数量
	private int count;

	//おススメフラグ
	private int IsPr;

	//登録日時
	private Date RecordDate;
	
	
	
	
	//getterとsetter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	
	public int getCount() {
		return count;
	}

	
	public void setCount(int count) {
		this.count = count;
	}

	
	public int getIsPr() {
		return IsPr;
	}

	public void setIsPr(int isPr) {
		IsPr = isPr;
	}

	
	public Date getRecordDate() {
		return RecordDate;
	}

	public void setRecordDate(Date recordDate) {
		RecordDate = recordDate;
	}

}
