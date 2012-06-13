package com.kylemcbride.SqueakyClean;

import com.kylemcbride.SqueakyClean.Handler.SqueakyCleanHandler;
import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SqueakyCleanActivity extends Activity {
    
    protected String TAG = "SqueakyClean";
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        SqueakyCleanHandler activityHandler = new SqueakyCleanHandler();
        
        
        Button newCustomer =  (Button) findViewById(R.id.newCustomer);
        newCustomer.setOnClickListener((OnClickListener) activityHandler);
        
        Button currentCustomer = (Button) findViewById(R.id.currentCustomer);
        currentCustomer.setOnClickListener((OnClickListener) activityHandler);
    }
    
}