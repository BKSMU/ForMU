package com.example.DrinkMachine.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ユーザー情報 Entity
 */
@Entity
@Table(name = "Item")

public class Item implements Serializable {
	
	 /**
     * code
     */
    @Id
    @Column(name = "code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;


    /**
     * 名前
     */
    @Column(name = "name")
    private String name;
    
    /**
     * 価格
     */
    @Column(name = "unitPrice")
    private int unitPrice;
    
    /**
     * 数量
     */
    @Column(name = "count")
    private int count;
    
    /**
     * 数量
     */
    @Column(name = "IsPr")
    private int IsPr;
    
    /**
     * 登録日時
     */
    @Column(name = "RecordDate")
    private Date RecordDate;
    
    
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
