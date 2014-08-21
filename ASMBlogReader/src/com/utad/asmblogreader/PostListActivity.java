package com.utad.asmblogreader;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

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
public class PostListActivity extends CommonActivity
{
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
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		// Assign the adapter of the list
		ListView list = (ListView) findViewById(R.id.postList);
		list.setAdapter(new PostListAdapter(this));
		
		// When clicking on a list element
		list.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				Toast.makeText(PostListActivity.this, "Id: " + id, Toast.LENGTH_SHORT).show();
			}
		});
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


    /*********************************************************/
    /*                                                       */ 
    /* PostListActivity.onOptionsItemSelected()              */ 
    /*                                                       */ 
    /*********************************************************/
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
    }

}
