package com.utad.asmblogreader.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.TreeMap;

public class PostList
{
	private ArrayList<Post> posts;
	private TreeMap<Long, Post> byId;
	
	public PostList()
	{
		posts = new ArrayList<Post>();
		byId = new TreeMap<Long, Post>();
	}
	
	public ArrayList<Post> getPosts()
	{
		return posts;
	}
	
	public void add(Post post)
	{
		add(new Post[]{ post });
	}
	
	public void add(Post... postArray)
	{
		this.posts.addAll(Arrays.asList(postArray));
		for (Post post : postArray)
		{
			byId.put(post.getId(), post);
		}
	}
	
	public Post get(long id)
	{
		return byId.get(Long.valueOf(id));
	}
	
	public static PostList generateDummyContents()
	{
		PostList ret = new PostList();
		
		ret.add(
	            new Post(1234, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1235, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2"),
	            new Post(1236, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1237, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2"),
	            new Post(1238, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1239, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2"),
	            new Post(1240, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1241, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2"),
	            new Post(1242, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1243, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2"),
	            new Post(1244, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1245, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2"),
	            new Post(1246, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1247, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2"),
	            new Post(1248, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg", "Cuerpo del artículo"),
	            new Post(1249, "Segunda entrada", new Date(), "http://2.bp.blogspot.com/-t99bRjpvPtY/UiSACREWH3I/AAAAAAAABpY/B9tl7MJUGgg/s72-c/20130902_135737.jpg", "Cuerpo del artículo 2")
		);
		
		return ret;
	}
}
