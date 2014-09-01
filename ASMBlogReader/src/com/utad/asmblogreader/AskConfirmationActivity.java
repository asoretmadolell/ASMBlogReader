package com.utad.asmblogreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/*************************************************************/
/*                                                           */ 
/* AskConfirmationActivity                                   */ 
/* (c)2014 Alejandro                                         */ 
/*                                                           */ 
/* Description: AskConfirmationActivity Class                */ 
/*              ASMBlogReader Project                        */ 
/*                                                           */ 
/*                                                           */ 
/*************************************************************/
public class AskConfirmationActivity extends Activity implements OnClickListener
{
	
	/*********************************************************/
	/*                                                       */ 
	/* AskConfirmationActivity.onCreate()                    */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
	     super.onCreate( savedInstanceState );
	     setContentView( R.layout.activity_ask_confirmation );
	     
	     TextView question = (TextView) findViewById( R.id.IDV_QUESTION_TEXTVIEW );
	     question.setText( getIntent().getCharSequenceExtra( ASMApplication.IDRC_QUESTION_TEXT ) );
	     
	     findViewById( R.id.IDV_BACKGROUND ).setOnClickListener( this );
	     findViewById( R.id.IDV_ACCEPT_BUTTON ).setOnClickListener( this );
	     findViewById( R.id.IDV_CANCEL_BUTTON ).setOnClickListener( this );
	}
	
	/*********************************************************/
	/*                                                       */ 
	/* AskConfirmationActivity.onClick()                     */ 
	/*                                                       */ 
	/*********************************************************/
	@Override
     public void onClick( View v )
     {
		switch( v.getId() )
          {
			case R.id.IDV_ACCEPT_BUTTON:
				setResult( ASMApplication.IDRC_ACCEPTED );
				finish();
				break;

			default:
				setResult( ASMApplication.IDRC_CANCELLED );
				finish();
				break;
		}
     }
}
