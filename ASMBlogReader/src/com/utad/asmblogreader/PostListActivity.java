package com.utad.asmblogreader;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.utad.asmblogreader.model.PostList;

/*************************************************************/
/*                                                           */ 
/* PostListActivity                                          */ 
/* (c)2014 Alejandro                                         */ 
/*                                                           */ 
/* Description: PostListActivity Class                       */ 
/*              ASMBlogReader Project                        */ 
/*                                                           */ 
/*                                                           */ 
/*************************************************************/
public class PostListActivity extends CommonActivity implements OnItemClickListener
{
	private ListView list;
	private PostList postList;
	
	/*********************************************************/
	/*                                                       */ 
	/* PostListActivity.onCreate()                           */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_post_list);
		
		// Obtain Post listing
		this.postList = PostList.getInstance();
		
		// Assign the adapter of the list
		list = (ListView) findViewById(R.id.postList);
		list.setAdapter( new PostListAdapter( this, this.postList ) );
		
		// When clicking on a list element
		list.setOnItemClickListener( this );
	}

	/*********************************************************/
	/*                                                       */ 
	/* PostListActivity.onItemClick()                        */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	public void onItemClick( AdapterView< ? > parent, View view, int position, long id )
	{
		if( (ListView) parent == list )
          {
			Toast.makeText(PostListActivity.this, "Id: " + id, Toast.LENGTH_SHORT).show();
			Intent intent = new Intent( PostListActivity.this, PostActivity.class );
			intent.putExtra( ASMApplication.IDRC_POST_ID, id );
			startActivity( intent );
          }
	}
	
	/*********************************************************/
	/*                                                       */ 
	/* PostListActivity.onCreateOptionsMenu()                */ 
	/*                                                       */ 
	/*********************************************************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
