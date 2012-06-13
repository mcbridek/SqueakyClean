package com.kylemcbride.SqueakyClean.Handler;

import com.kylemcbride.SqueakyClean.CurrentCustomer;
import com.kylemcbride.SqueakyClean.NewCustomer;
import com.kylemcbride.SqueakyClean.R;
import com.kylemcbride.SqueakyClean.SelectPackage;

import android.content.Intent;
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
		
		case R.id.newCustomer:
			v.getContext().startActivity(new Intent(v.getContext(), NewCustomer.class));
			break;
			
		case R.id.currentCustomer:
			v.getContext().startActivity(new Intent(v.getContext(), CurrentCustomer.class));
			break;
		
		case R.id.nwusr_continue:
			v.getContext().startActivity(new Intent(v.getContext(), SelectPackage.class));
			break;
		
		default:
			Log.d(TAG, "Launching a new page.");
			Toast.makeText(v.getContext(), "You pressed " + ((Button)v).getText(), Toast.LENGTH_LONG).show();
			break;
		}
		

	}

}
