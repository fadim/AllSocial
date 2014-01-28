package com.all.social;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;


public class AllSocialActivity extends Activity {
    /** Called when the activity is first created. */
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        		                   WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        setContentView(R.layout.main);
        
        HashMap<String, Object> map = new HashMap<String, Object>();
        final GridView social_media = (GridView)findViewById(R.id.social_media);
        final ArrayList<HashMap<String, Object>> lstImageItem = new ArrayList<HashMap<String, Object>>();
       
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.behance);
        map.put("itemtxt","Behance");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.blogger);
        map.put("itemtxt","Blogger");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.delicious);
        map.put("itemtxt","Delicious");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.facebook);
        map.put("itemtxt","Facebook");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.flickr);
        map.put("itemtxt","Flickr");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.friendfeed);
        map.put("itemtxt","FriendFeed");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.googleplus);
        map.put("itemtxt","Google+");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.hi5);
        map.put("itemtxt","Hi5");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.linkedin);
        map.put("itemtxt","Linkedin");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.myspace);
        map.put("itemtxt","MySpace");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.netvibes);
        map.put("itemtxt","Netvibes");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.orkut);
        map.put("itemtxt","Orkut");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.reddit);
        map.put("itemtxt","Reddit");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.stumbleupon);
        map.put("itemtxt","StumbleUpon");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.technorati);
        map.put("itemtxt","Technorati");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.twitter);
        map.put("itemtxt","Twitter");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.yahoo);
        map.put("itemtxt","Yahoo!");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.youtube);
        map.put("itemtxt","YouTube");
        lstImageItem.add(map);
        
        
        SimpleAdapter adapter = new SimpleAdapter(this,
       		 lstImageItem,
       		 R.layout.gridview_item,
       		 new String[] {"itemimg","itemtxt"},
       		 new int[] {R.id.item_image,R.id.item_text});
       
        social_media.setAdapter(adapter);
        
        social_media.setOnItemClickListener(new OnItemClickListener(){
        	
        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) 
        {
        	HashMap<String, Object> item = new HashMap<String, Object>();
        	item = lstImageItem.get(pos);
        	
        	int id;
        	if ((item.get("itemtxt")).equals("Facebook"))
        	{
        		id = 1;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Twitter"))
        	{
        		id = 2;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Google+"))
        	{
        		id = 3;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Yahoo!"))
        	{
        		id = 4;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Linkedin"))
        	{
        		id = 5;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Blogger"))
        	{
        		id = 6;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Behance"))
        	{
        		id = 7;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Flickr"))
        	{
        		id = 8;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("FriendFeed"))
        	{
        		id = 9;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("MySpace"))
        	{
        		id = 10;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Orkut"))
        	{
        		id = 11;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Netvibes"))
        	{
        		id = 12;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}

        	else if ((item.get("itemtxt")).equals("YouTube"))
        	{
        		id = 13;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}

        	else if ((item.get("itemtxt")).equals("Reddit"))
        	{
        		id = 14;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}

        	else if ((item.get("itemtxt")).equals("StumbleUpon"))
        	{
        		id = 15;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Technorati"))
        	{
        		id = 16;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Hi5"))
        	{
        		id = 17;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
        	
        	else if ((item.get("itemtxt")).equals("Delicious"))
        	{
        		id = 18;
        		Intent intent = new Intent(AllSocialActivity.this, WebSocial.class);
        		Bundle bundle = new Bundle();
        		bundle.putInt("id", id);
        		intent.putExtras(bundle);
	    		startActivity(intent);
        	}
          
        }
       
        });
       
    }
}