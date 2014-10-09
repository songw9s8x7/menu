package com.android.frankmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.menu.R;

public class MenuActivity extends Activity{
	private CheckBox menu[];
	private TextView text[];
	private Button sendbutton;
	private SelecedMenu selecedmenu[];
	private Message msg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		   setContentView(R.layout.food);
		//   menu[0] = (CheckBox)findViewById(R.id.checkBox1);
		   sendbutton = (Button)findViewById(R.id.button1);
		  /* msg = new Message("13141048947");
		   menu[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
	            @Override
	            public void onCheckedChanged(CompoundButton buttonView,
	                    boolean isChecked) {
	                // TODO Auto-generated method stub
	                if(isChecked){
	                    selecedmenu[0] = new SelecedMenu((String)menu[0].getText());
	                }else{
	                   
	                }
	            }
	        }); */
		   sendbutton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(selecedmenu == null | selecedmenu.length == 0){
					Toast toast = Toast.makeText(getApplicationContext(), "请选择菜品!", Toast.LENGTH_SHORT); 
					toast.show(); //请选择菜品
				}
				else{
					//生成需要发送的信息
					//发送信息					
				}
			}
			   
		   });
	}

}
