package com.android.frankmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.menu.R;

public class MenuActivity extends Activity{
	private CheckBox menu[];
	private Button sendbutton;
	private SelecedMenu selecedmenu[];
	private Message msg;
	private String addr;
	private String output;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		   setContentView(R.layout.food);
		   menu = new CheckBox[20];
		   menu[0] = (CheckBox)findViewById(R.id.checkBox1);
		   sendbutton = (Button)findViewById(R.id.button1);
		   selecedmenu = new SelecedMenu[20];
		   addr = "用户地址信息 ";
		   
		  // msg = new Message("13141048947");
		   menu[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
	            @Override
	            public void onCheckedChanged(CompoundButton buttonView,
	                    boolean isChecked) {
	                // TODO Auto-generated method stub
	                if(isChecked){
	                    selecedmenu[0] = new SelecedMenu((String)menu[0].getText());
	                    
	                }else{
	                	selecedmenu[0] = null;
	                }
	            }
	        }); 

		   sendbutton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(selecedmenu[0] == null){
					Toast toast = Toast.makeText(getApplicationContext(),
							"请选择菜品!", Toast.LENGTH_SHORT); 
					toast.show(); //请选择菜品
				}
				else{
					output = addr + selecedmenu[0].toString();
					Toast toast = Toast.makeText(getApplicationContext(),
							output, Toast.LENGTH_SHORT); 
					toast.show(); 
					//发送信息					
				}
			}
			   
		   });
	}

}
