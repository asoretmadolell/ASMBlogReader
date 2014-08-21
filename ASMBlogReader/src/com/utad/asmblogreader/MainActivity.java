package com.utad.asmblogreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

/*************************************************************/
/*                                                           */ 
/* MainActivity                                              */ 
/* (c)2014 Alejandro                                         */ 
/*                                                           */ 
/* Description: MainActivity Class                           */ 
/*              ASMBlogReader Project                        */ 
/*                                                           */ 
/*                                                           */ 
/*************************************************************/
public class MainActivity extends ActionBarActivity implements OnClickListener
{
	/*********************************************************/
	/*                                                       */ 
	/* MainActivity.onCreate()                               */ 
	/*                                                       */ 
	/*********************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.helloWorld).setOnClickListener( this );
    }
    
    /*********************************************************/
    /*                                                       */ 
    /* MainActivity.onClick()                                */ 
    /*                                                       */ 
    /*********************************************************/
    @Override
    public void onClick( View v )
    {
	    switch( v.getId() )
	    {
		    case R.id.helloWorld:
			    
			    Intent intent = new Intent(MainActivity.this, PostListActivity.class);
			    startActivity(intent);
			    finish();
			    
			    break;
		
		    default:
			    break;
	    }
    }

	/*********************************************************/
	/*                                                       */ 
	/* MainActivity.onCreateOptionsMenu()                    */ 
	/*                                                       */ 
	/*********************************************************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /*********************************************************/
    /*                                                       */ 
    /* MainActivity.onOptionsItemSelected()                  */ 
    /*                                                       */ 
    /*********************************************************/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
