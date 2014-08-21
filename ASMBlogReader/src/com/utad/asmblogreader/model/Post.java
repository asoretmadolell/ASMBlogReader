package com.utad.asmblogreader.model;

import java.util.Date;

/*************************************************************/
/*                                                           */ 
/* Post                                                      */ 
/* (c)2014 Alejandro                                         */ 
/*                                                           */ 
/* Description: Post Class                                   */ 
/*              ASMBlogReader Project                        */ 
/*                                                           */ 
/*                                                           */ 
/*************************************************************/
public class Post
{
	private long id;
	private String title;
	private Date date;
	private String picUrl;
	private String body;

	// Generated constructor using fields
	public Post(long id, String title, Date date, String picUrl, String body)
	{
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.picUrl = picUrl;
		this.body = body;
	}
	
	
	// Generated getters
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Date getDate() {
		return date;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public String getBody() {
		return body;
	}
}
