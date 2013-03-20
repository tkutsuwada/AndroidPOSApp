package com.bop.pos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProductCategoryAdapter extends BaseAdapter {

	
	private Context ContextInAdapter;
	private LayoutInflater inflater;
	
	
	public ProductCategoryAdapter(Context context) {
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		/*
		if (convertView == null) {
			convertView = inflater.inflate(R.id.row,null);
		}
		
		ImageView imageView = (ImageView) convertView.findViewById(R.id.photo);
		imageView.setLayoutParams(new LinearLayout.LayoutParams(120,120));
		imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
		imageView.setImageResource(getResourceID)
		*/
		return null;
	}
	
    private int getResourceID(String fileName) {
    
    	/*
        int resID = getResourceID(fileName).getIdentifier(fileName
            , "drawable", "socym.hazama.sample_listView");
        return resID;
        */
    	return 0;
    }
    

}
