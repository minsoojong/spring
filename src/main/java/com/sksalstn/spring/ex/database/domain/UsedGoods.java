package com.sksalstn.spring.ex.database.domain;

import java.util.Date;

// used_goods 테이블의 한행의 정보를 저장하기 위한 클래스
// 테이블의 컬럼이름과 일치하는 멤버변수를 가진 클래스
// Domain
// Entity
public class UsedGoods {

	private int id;
	private int sellerId;
	private String title;
	private int price;
	private String description;
	private String imgae;
	private Date createAt;
	private Date updatedAt;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgae() {
		return imgae;
	}
	public void setImgae(String imgae) {
		this.imgae = imgae;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
