package com.utad.asmblogreader.model;

import java.util.Date;

import android.os.Parcel;
import android.os.Parcelable;

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
public class Post implements Parcelable
{
	private long id;
	private String url;
	private String title;
	private Date date;
	private String picUrl;
	private String body;
	
	public static final Parcelable.Creator< Post > CREATOR = new Creator< Post >()
	{
		/*********************************************************/
		/*                                                       */ 
		/* Post.createFromParcel()                               */ 
		/*                                                       */ 
		/*********************************************************/
		@Override
          public Post createFromParcel( Parcel source )
          {
	          return new Post( source );
          }

		/*********************************************************/
		/*                                                       */ 
		/* Post.newArray()                                       */ 
		/*                                                       */ 
		/*********************************************************/
		@Override
          public Post[] newArray( int size )
          {
	          return new Post[ size ];
          }
	};

	/*********************************************************/
	/*                                                       */ 
	/* Post.Post()                                           */ 
	/*                                                       */ 
	/*********************************************************/
	public Post(long id, String url, String title, Date date, String picUrl, String body)
	{
		this.id = id;
		this.url = url;
		this.title = title;
		this.date = date;
		this.picUrl = picUrl;
		this.body = body;
	}
	
	/*********************************************************/
	/*                                                       */ 
	/* Post.Post()                                           */ 
	/*                                                       */ 
	/*********************************************************/
	public Post( Parcel source )
	{
		this.id = source.readLong();
		this.url = source.readString();
		this.title = source.readString();
		long dateMillis = source.readLong();
		this.date = dateMillis == 0 ? null: new Date( dateMillis );
		this.picUrl = source.readString();
		this.body = source.readString();
	}

	/*********************************************************/
	/*                                                       */ 
	/* Post.describeContents()                               */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
     public int describeContents()
     {
	     return 0;
     }

	/*********************************************************/
	/*                                                       */ 
	/* Post.writeToParcel()                                  */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
     public void writeToParcel( Parcel dest, int flags )
     {
		dest.writeLong( id );
		dest.writeString( url );
		dest.writeString( title );
		dest.writeLong( date == null ? null : date.getTime() );
		dest.writeString( picUrl );
		dest.writeString( body );
     }

	/*********************************************************/
	/*                                                       */ 
	/* Post.getters                                          */ 
	/*                                                       */ 
	/*********************************************************/
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
