package com.android.menu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.example.menu.R;

public class MenuActivity extends Activity{
	private CheckBox menu[];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		   setContentView(R.layout.food);
		   menu[0] = (CheckBox)findViewById(R.id.checkBox1);
		   menu[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
	            @Override
	            public void onCheckedChanged(CompoundButton buttonView,
	                    boolean isChecked) {
	                // TODO Auto-generated method stub
	                if(isChecked){
	                    
	                }else{
	                   
	                }
	            }
	        }); 
	}

}
