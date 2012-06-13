package com.kylemcbride.SqueakyClean;

import com.kylemcbride.SqueakyClean.Handler.SqueakyCleanHandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewCustomer extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_customer);
		
		SqueakyCleanHandler activityHandler = new SqueakyCleanHandler();
		
		Button cnt = (Button) findViewById(R.id.nwusr_continue);
		cnt.setOnClickListener((OnClickListener) activityHandler);
		
	}
	

}
