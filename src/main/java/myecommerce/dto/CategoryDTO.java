package com.myecommerce.dto;

public class CategoryDTO {

	private Long categoryId;
	private String categoryName;
	private String descripiton;
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescripiton() {
		return descripiton;
	}
	public void setDescripiton(String descripiton) {
		this.descripiton = descripiton;
	}



}