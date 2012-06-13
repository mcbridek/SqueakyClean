package com.kylemcbride.SqueakyClean.Handler;

import com.kylemcbride.SqueakyClean.R;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SqueakyCleanHandler implements OnClickListener {
	
	protected String TAG = "Activity Handler";
	
	@Override
	public void onClick(View v) {
		System.out.println("Button being clicked");
		
		Log.d(TAG, "Listening");
		switch (v.getId()) {
		
		case R.id.currentCustomer:
			Toast.makeText(v.getContext(), "You pressed " + ((Button)v).getText(), Toast.LENGTH_LONG).show();
			break;
			
		case R.id.newCustomer:
			Toast.makeText(v.getContext(), "You pressed " + ((Button)v).getText(), Toast.LENGTH_LONG).show();
			break;
		
		default:
			Log.d(TAG, "Launching a new page.");
			Toast.makeText(v.getContext(), "You pressed " + ((Button)v).getText(), Toast.LENGTH_LONG).show();
			break;
		}
		

	}

}
