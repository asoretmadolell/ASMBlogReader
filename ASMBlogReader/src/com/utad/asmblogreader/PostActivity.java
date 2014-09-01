package com.utad.asmblogreader;

import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.utad.asmblogreader.model.Post;
import com.utad.asmblogreader.model.PostList;

/*************************************************************/
/*                                                           */ 
/* PostActivity                                              */ 
/* (c)2014 Alejandro                                         */ 
/*                                                           */ 
/* Description: PostActivity Class                           */ 
/*              ASMBlogReader Project                        */ 
/*                                                           */ 
/*                                                           */ 
/*************************************************************/
public class PostActivity extends CommonActivity
{
	private long mPostId;
	
	/*********************************************************/
	/*                                                       */ 
	/* PostActivity.onCreate()                               */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
	     super.onCreate( savedInstanceState );
	     
	     mPostId = this.getIntent().getLongExtra( ASMApplication.IDRC_POST_ID, -1 );
	     
	     // Fetch the Post
	     Post post = PostList.getInstance().get( mPostId );
	     if( post == null )
          {
	     	Toast.makeText(this, R.string.IDS_NO_POST_FOUND, Toast.LENGTH_SHORT).show();
	     	finish();
          }
	     
	     // Once we know there's a Post, we assign it to the view
	     this.setContentView( R.layout.activity_post );
	     
	     getActionBar().setDisplayHomeAsUpEnabled( true );
	     
	     TextView title = (TextView) findViewById( R.id.IDV_POST_TITLE );
	     TextView date= (TextView) findViewById( R.id.IDV_POST_DATE );
	     TextView body = (TextView) findViewById( R.id.IDV_POST_BODY );
	     
	     title.setText( post.getTitle() );
	     date.setText( "" + post.getDate() );
	     body.setText( Html.fromHtml( post.getBody() ) );
	}
	
	/*********************************************************/
	/*                                                       */ 
	/* PostActivity.onOptionsItemSelected()                  */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	public boolean onOptionsItemSelected( MenuItem item )
	{
		if( item.getItemId() == android.R.id.home )
          {
	          finish();
	          return true;
          }
		else
		{
			return super.onOptionsItemSelected( item );			
		}
	}
}
