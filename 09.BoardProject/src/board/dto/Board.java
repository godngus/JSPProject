package board.dto;

import java.sql.Date;

public class Board {
private int num;
private String name;
private String title;
private String content;
private String attachment;
private Date wdate;
private int hits;
public String getName() {
	return name;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public void setName(String name) {
	this.name = name;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getAttachment() {
	return attachment;
}
public void setAttachment(String attachment) {
	this.attachment = attachment;
}
public Date getWdate() {
	return wdate;
}
public void setWdate(Date wdate) {
	this.wdate = wdate;
}
public int getHits() {
	return hits;
}
public void setHits(int hits) {
	this.hits = hits;
}
}
