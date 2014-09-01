package com.utad.asmblogreader;

import android.content.Intent;
import android.os.Bundle;
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
public class MainActivity extends CommonActivity implements OnClickListener
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
}
