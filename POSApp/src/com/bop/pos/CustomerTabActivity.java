package com.bop.pos;

import com.bop.pos.MenuTabActivity.ListAdapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class CustomerTabActivity extends Activity {

    private final static int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final static int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
	
    private Resources res;
    private LinearLayout baseLayout;
    private ListView list;
    private final String[] photolist
    = {"sample030"
      , "sample031"
      , "sample032"
      , "sample033"};
    
    private final String[] nameList =
    	{
    		"Kumiko Akabori"
    	    , "Yurika Takachi"
    	    , "Eiko Nakamoto"
    	    , "Swapna Mishra"};
	
	@Override
	 protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 res = this.getResources();
	     baseLayout = new LinearLayout(this);
	     baseLayout.setOrientation(LinearLayout.VERTICAL);
	     baseLayout.setGravity(Gravity.TOP+Gravity.CENTER_HORIZONTAL);
	     setContentView(baseLayout);
	        
	     list = new ListView(this);
	     list.setBackgroundColor(Color.WHITE);
	     baseLayout.addView(list, new LinearLayout.LayoutParams(FP, FP));
	     
	     list.setAdapter(new ListAdapter(this)); 
	     
	     list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	    	 @Override            
	    	 public void onItemClick(AdapterView<?> parent
	    			 , View view, int position, long id) {
	    		 //goToNextViewInTabView();
	         }	 
	     }); 
	}
	
	private void goToNextViewInTabView(){
		/*
		 baseLayout.removeAllViews();
		 Intent intent = new Intent(MenuTabActivity.this,ItemListActivity.class);
		 Window nextActivity = getLocalActivityManager().startActivity("ItemListActivity",intent);
		 baseLayout.addView(nextActivity.getDecorView());
		 */
	}
 
	
    public class ListAdapter extends BaseAdapter {
        //private Context contextInAdapter;
        private LayoutInflater inflater;
        
        public ListAdapter(Context context) {
            //contextInAdapter = context;
            inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        }
        
        @Override
        public int getCount() {
            return photolist.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           
            if(convertView == null){  
                convertView = inflater.inflate(R.layout.row, null);  
            }
            
            ImageView imageView = (ImageView) convertView.findViewById(R.id.photo);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(getResourceID(photolist[position]));
            
            TextView textView = (TextView) convertView.findViewById(R.id.filename);
            textView.setPadding(10, 0, 0, 0);
            textView.setText(nameList[position]);
            
            return convertView; 
        }
    }
    
    private int getResourceID(String fileName) {
        int resID = res.getIdentifier(fileName
            , "drawable", "com.bop.pos");
        return resID;
    }
}
