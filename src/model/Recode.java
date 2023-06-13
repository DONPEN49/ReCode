package model;

import java.io.Serializable;

public class Recode implements Serializable {
	private int id;
	private String image;
	private String content;
	private String auther;

	public Recode(){
		auther = "hoge";
		content = "hogehoge";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}


	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
}
