package com.all.social;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebSocial extends Activity {
	WebView webSocial;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_social);
        
        Bundle extras = getIntent().getExtras();
        int id = extras.getInt("id");
        webSocial = (WebView) findViewById(R.id.web_social);
        webSocial.getSettings().setJavaScriptEnabled(true);
         
       switch(id)
       {
       
	       case 1:
	    	   	  webSocial.loadUrl("http://www.facebook.com");
	           break;
	       
	       case 2:
	    	   	  webSocial.loadUrl("http://www.twitter.com");
               break;
           
	       case 3:
		          webSocial.loadUrl("http://www.plus.google.com");
	           break;
	           
	       case 4:
		          webSocial.loadUrl("http://tr.my.yahoo.com/");
		       break;
		       
	       case 5:
		          webSocial.loadUrl("http://www.linkedin.com");
		       break;
		       
	       case 6:
		          webSocial.loadUrl("http://www.blogger.com");
		       break;
		       
	       case 7:
		          webSocial.loadUrl("http://www.behance.net/");
		       break;
		       
	       case 8:
		          webSocial.loadUrl("http://www.flickr.com");
		       break;
		       
	       case 9:
		          webSocial.loadUrl("http://www.friendfeed.com");
		       break;
		       
	       case 10:
		          webSocial.loadUrl("http://www.myspace.com");
		       break;
		       
	       case 11:
		          webSocial.loadUrl("http://www.orkut.com");
		       break;
		       
	       case 12:
		          webSocial.loadUrl("http://www.netvibes.com");
		       break;
		       
	       case 13:
		          webSocial.loadUrl("http://www.youtube.com");
		       break;
		       
	       case 14:
	    	      webSocial.loadUrl("http://www.reddit.com");
		       break;
		       
	       case 15:
	    	      webSocial.loadUrl("http://www.stumbleupon.com");
		       break;
		       
	       case 16:
		          webSocial.loadUrl("http://www.technorati.com");
		       break;
		   
	       case 17:
		          webSocial.loadUrl("http://www.hi5.com");
		       break;
           
	       case 18:
		          webSocial.loadUrl("http://www.delicious.com");
		       break;
       }
    }
	
}
