package com.kylemcbride.SqueakyClean;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SelectPackage extends Activity {
	
	public String [] newcust;  
	
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.package_select);
		
		newcust = new String[6];  
		newcust[0] = new String(getIntent().getExtras().getString("name"));
		newcust[1] = new String(getIntent().getExtras().getString("surname"));
		newcust[2] = new String(getIntent().getExtras().getString("email"));
		newcust[3] = new String(getIntent().getExtras().getString("mobile"));
		newcust[4] = new String(getIntent().getExtras().getString("license"));
		
		TextView tv = (TextView) findViewById(R.id.packagetv);
		tv.setText(newcust[0]);
		
	}

}
