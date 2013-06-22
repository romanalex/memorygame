package com.example.memorygame;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 

public class MainActivity extends Activity {

	public int first = -1; 
	public int last = -1; 
	public Button BB1,BB2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 12;)
		{
			int rand = ((int)(Math.random() * 12)) ;
			
			if(!list.contains(rand))
	    	{
		    	list.add(rand);
		    	i++;
	    	}
		}
		//Log.d("tag", "length: " + list.size());
		
		
		for(int i = 0; i < 12;i++)
			if(list.get(i) > 5)
				list.set(i, list.get(i) - 6);
		
		int arraySize = list.size();
		for(int i = 0; i < arraySize; i++) {
			Log.d("TAG", "" + list.get(i));
		}
			
		loadImages();

		final Button B1 = (Button) findViewById(R.id.b11);
		final Button B2 = (Button) findViewById(R.id.b12);
		final Button B3 = (Button) findViewById(R.id.b13);
		final Button B4 = (Button) findViewById(R.id.b21);
		final Button B5 = (Button) findViewById(R.id.b22);
		final Button B6 = (Button) findViewById(R.id.b23);
		final Button B7 = (Button) findViewById(R.id.b31);
		final Button B8 = (Button) findViewById(R.id.b32);
		final Button B9 = (Button) findViewById(R.id.b33);
		final Button B10 = (Button) findViewById(R.id.b41);
		final Button B11 = (Button) findViewById(R.id.b42);
		final Button B12 = (Button) findViewById(R.id.b43);
			 
		
		
		
		 
		B1.setOnClickListener(new OnClickListener() {
			 
			public Drawable bkimage;
			private int $missing$;
			@Override
			public void onClick(View v) {
				
				B1.setBackgroundDrawable (images.get(list.get(0)));
				
				if(first != last && first != -1 && last != -1 && B1 != BB1 && B1 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;				
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
					
				
				if(first == -1)
				{
					first = list.get(0);
					BB1 = B1;
				} 
				else if(last == -1 && BB1 != B1)
				{
					last = list.get(0);
					BB2 = B1;
				}
				
				
			}
		});
		
		B2.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B2.setBackgroundDrawable (images.get(list.get(1)));
				if(first != last && first != -1 && last != -1 && B2 != BB1 && B2 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(1);
						BB1 = B2;
				} 
				else if(last == -1 && BB1 != B2)
				{
					last = list.get(1);
					BB2 = B2;
				}
				
				
				
			}
		});
		
		B3.setOnClickListener(new OnClickListener() {
		
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B3.setBackgroundDrawable (images.get(list.get(2)));
				if(first != last && first != -1 && last != -1 && B3 != BB1 && B3 != BB2) 
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(2);
						BB1 = B3;
				} 
				else if(last == -1 && BB1 != B3)
				{
					last = list.get(2);
					BB2 = B3;
				}
			
			}
		});
	
		B4.setOnClickListener(new OnClickListener() {
		
			public Drawable bkimage;
			@Override
			public void onClick(View v) {

				B4.setBackgroundDrawable (images.get(list.get(3)));
				if(first != last && first != -1 && last != -1 && B4 != BB1 && B4 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(3);
						BB1 = B4;
				} 
				else if(last == -1 && BB1 != B4)
				{
					last = list.get(3);
					BB2 = B4;
				}
			
			}
		});
		
		B5.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B5.setBackgroundDrawable (images.get(list.get(4)));
				if(first != last && first != -1 && last != -1 && B5 != BB1 && B5 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(4);
						BB1 = B5;
				} 
				else if(last == -1 && BB1 != B5)
				{
					last = list.get(4);
					BB2 = B5;
				}
				
			}
		});
		
		B6.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				
				B6.setBackgroundDrawable (images.get(list.get(5)));
				if(first != last && first != -1 && last != -1 && B6 != BB1 && B6 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(5);
						BB1 = B6;
				} 
				else if(last == -1 && BB1 != B6)
				{
					last = list.get(5);
					BB2 = B6;
				}
				
			}
		});
		
		B7.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B7.setBackgroundDrawable (images.get(list.get(6)));
				if(first != last && first != -1 && last != -1 && B7 != BB1 && B7 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(6);
						BB1 = B7;
				} 
				else if(last == -1 && BB1 != B7)
				{
					last = list.get(6);
					BB2 = B7;
				}
				
			}
		});
		
		B8.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B8.setBackgroundDrawable (images.get(list.get(7)));
				if(first != last && first != -1 && last != -1 && B8 != BB1 && B8 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(7);
						BB1 = B8;
				} 
				else if(last == -1 && BB1 != B8)
				{
					last = list.get(7);
					BB2 = B8;
				}
				
			}
		});
		
		B9.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B9.setBackgroundDrawable (images.get(list.get(8)));
				if(first != last && first != -1 && last != -1 && B9 != BB1 && B9 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(8);
						BB1 = B9;
				} 
				else if(last == -1 && BB1 != B9)
				{
					last = list.get(8);
					BB2 = B9;
				}
				
			}
		});
		
		B10.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B10.setBackgroundDrawable (images.get(list.get(9)));
				if(first != last && first != -1 && last != -1 && B10 != BB1 && B10 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(9);
						BB1 = B10;
				} 
				else if(last == -1 && BB1 != B10)
				{
					last = list.get(9);
					BB2 = B10;
				}
				
			}
		});
		
		B11.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) {
				
				B11.setBackgroundDrawable (images.get(list.get(10)));
				if(first != last && first != -1 && last != -1 && B11 != BB1 && B11 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
				
				if(first == -1)
				{
						first = list.get(10);
						BB1 = B11;
				} 
				else if(last == -1 && BB1 != B11)
				{
					last = list.get(10);
					BB2 = B11;
				}
				
			}
		});
		
		B12.setOnClickListener(new OnClickListener() {
			
			public Drawable bkimage;
			@Override
			public void onClick(View v) { 
				
				B12.setBackgroundDrawable (images.get(list.get(11)));
				if(first != last && first != -1 && last != -1 && B12 != BB1 && B12 != BB2)
				{
					BB1.setBackgroundDrawable (images.get(6));
					BB2.setBackgroundDrawable (images.get(6));	
					first = last = -1;
					BB2 = null;
				}
				else 
					if(first == last && first != -1)
						{
						first = last = -1;
						BB1.setEnabled(false);
						BB2.setEnabled(false);
						}
		 		
				if(first == -1)
				{
						first = list.get(11);
						BB1 = B12;
				} 
				else if(last == -1 && BB1 != B12)
				{
					last = list.get(11);
					BB2 = B12;
				}
				
			}
		});
		
		
		//int arraySize = list.size();
		//for(int i = 1; i < arraySize; i++) {
			//Log.d("TAG", "" + list.get(4)+ " ");
	//	} 
		
	} 
	
	public ArrayList<Drawable> images;

	public void loadImages () {
		images = new ArrayList<Drawable>();
	
		images.add(getResources().getDrawable(R.drawable.ananas));
		images.add(getResources().getDrawable(R.drawable.capsuna));
		images.add(getResources().getDrawable(R.drawable.cirese));
		images.add(getResources().getDrawable(R.drawable.mar));
		images.add(getResources().getDrawable(R.drawable.pepene));
		images.add(getResources().getDrawable(R.drawable.strugure));
		images.add(getResources().getDrawable(R.drawable.backg));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;		
		
	}

}
