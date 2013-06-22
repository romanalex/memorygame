package com.example.memorygame;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 12;)
		{
			int rand = ((int)(Math.random() * 12)) + 1;
			
			if(!list.contains(rand))
	    	{
	    	list.add(rand);
	    	i++;
	    	}
		}
		System.out.println("dksam");
		
		int arraySize = list.size();
		for(int i = 0; i < arraySize; i++) {
			Log.d("TAG", "" + list.get(i)+ " ");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;		
		
	}

}
