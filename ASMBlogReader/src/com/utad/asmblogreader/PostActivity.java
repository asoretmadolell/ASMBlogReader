package com.utad.asmblogreader;

import java.text.DateFormat;
import java.util.Locale;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
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
	private Post mPost;
	
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
	     mPost = PostList.getInstance().get( mPostId );
	     if( mPost == null )
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
	     
	     title.setText( mPost.getTitle() );
	     DateFormat df = DateFormat.getDateInstance( DateFormat.LONG, Locale.getDefault() );
	     date.setText( df.format( mPost.getDate() ) );
	     body.setText( Html.fromHtml( mPost.getBody() ) );
	}
	
	/*********************************************************/
	/*                                                       */ 
	/* PostActivity.onCreateOptionsMenu()                    */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate( R.menu.activity_post, menu );
	     return true;
	}
	
	/*********************************************************/
	/*                                                       */ 
	/* PostActivity.onOptionsItemSelected()                  */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	public boolean onOptionsItemSelected( MenuItem item )
	{
		switch( item.getItemId() )
          {
			case android.R.id.home:
				finish();
				return true;
				
			case R.id.IDM_ACTION_FAVORITE:
				Intent intent = new Intent( this, AskConfirmationActivity.class );
				String questionText = getString( R.string.IDS_ADD_TO_FAVORITES_QUESTION, mPost.getTitle() );
				intent.putExtra( ASMApplication.IDRC_QUESTION_TEXT, Html.fromHtml( questionText ) );
				startActivityForResult( intent, ASMApplication.IDRC_ADD_TO_FAVORITES_REQUEST_ID );
				return true;
				
			case R.id.IDM_ACTION_SHARE:
				Intent implicitIntent = new Intent();
				implicitIntent.setAction( Intent.ACTION_SEND );
				implicitIntent.setType( "text/plain" ); // use this line for testing in the emulator
				implicitIntent.putExtra( Intent.EXTRA_SUBJECT, mPost.getTitle() );
				implicitIntent.putExtra( Intent.EXTRA_TEXT, mPost.getUrl() );
				startActivity( implicitIntent );
				return true;
				
			case R.id.IDM_ACTION_SETTINGS:
				return true;

			default:
				return super.onOptionsItemSelected( item );
		}
	}
	
	/*********************************************************/
	/*                                                       */ 
	/* PostActivity.onActivityResult()                       */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	protected void onActivityResult( int requestCode, int resultCode, Intent data )
	{
	     switch( requestCode )
          {
			case ASMApplication.IDRC_ADD_TO_FAVORITES_REQUEST_ID:
				if( resultCode == ASMApplication.IDRC_ACCEPTED )
                    {
					Toast.makeText(this, "Accept button was pressed", Toast.LENGTH_LONG).show();
                    }
				else if( resultCode == ASMApplication.IDRC_CANCELLED )
                    {
	                    Toast.makeText(this, "Cancel button was pressed", Toast.LENGTH_LONG).show();
                    }
				break;

			default:
				super.onActivityResult( requestCode, resultCode, data );
				break;
		}
	}
}
