package servlet;

import java.io.Serializable;

public class Recode implements Serializable {
	private String content;
	private String auther;
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
