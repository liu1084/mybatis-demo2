package com.jim.mybatis.model.po;

/**
 * Created by jim on 2017/9/19.
 * This class is ...
 */
public class Book extends Base {
	private String name;
	private String description;
	private String[] cover;
	private Author[] authors;
	private String isbn;
	private String year;
	private int pages;
	private String language;
	private double size;
	private String format;
	private Category[] categories;
	private double rating;
	private Boolean enabled;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getCover() {
		return cover;
	}

	public void setCover(String[] cover) {
		this.cover = cover;
	}

	public Author[] getAuthor() {
		return authors;
	}

	public void setAuthor(Author[] authors) {
		this.authors = authors;
	}

	public Category[] getCategories() {
		return categories;
	}

	public void setCategory(Category[] categories) {
		this.categories = categories;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}


	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}
