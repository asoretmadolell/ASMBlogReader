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
	private String url;
	private String title;
	private Date date;
	private String picUrl;
	private String body;

	/*********************************************************/
	/*                                                       */ 
	/* Post.Post()                                           */ 
	/*                                                       */ 
	/*********************************************************/
	public Post(long id, String url, String title, Date date, String picUrl, String body)
	{
		super();
		this.id = id;
		this.url = url;
		this.title = title;
		this.date = date;
		this.picUrl = picUrl;
		this.body = body;
	}
	
	
	// Generated getters
	public long getId() {
		return id;
	}
	public String getUrl() {
		return url;
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
