package com.utad.asmblogreader.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.TreeMap;

/*************************************************************/
/*                                                           */ 
/* PostList                                                  */ 
/* (c)2014 Alejandro                                         */ 
/*                                                           */ 
/* Description: PostList Class                               */ 
/*              ASMBlogReader Project                        */ 
/*                                                           */ 
/*                                                           */ 
/*************************************************************/
public class PostList
{
	private static PostList singleInstance = null;
	private ArrayList<Post> posts;
	private TreeMap<Long, Post> byId;
	
	private PostList()
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
	
	public synchronized static PostList getInstance()
	{
		if( singleInstance == null )
          {
	          singleInstance = new PostList();
          }
				
		singleInstance.add(
		            new Post(1234, "Primera entrada", new Date(), "http://1.bp.blogspot.com/-RfkRO12V__A/UhPosJBvinI/AAAAAAAABn8/jxwe5hRmBV0/s72-c/todas.jpg",
		                      "<p><b>Lorem ipsum</b> dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>"
		                      + "<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?</p>"),
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
		
		return singleInstance;
	}
}
