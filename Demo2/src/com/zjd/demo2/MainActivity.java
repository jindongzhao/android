package com.zjd.demo2;

import com.zjd.demo2.service.CommonServiceActivity;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void showLayoutHandler(View view){
		Intent intent = new Intent(this,LayoutActivity.class);
		startActivity(intent);
	}
	
	public void showFragementHandler(View view){
		startActivity(new Intent(this,FragementActivity.class));
	}
	
	public void sendMsgHandler(View view){
		startActivity(new Intent(this,SendMsgActivity.class));
	}
	
	public void openDemoPublicHandler(View view){
		startActivity(new Intent("com.zjd.demo.publicShow",null));
	}
	
	public void openServiceHandler(View view){
		startActivity(new Intent(this,CommonServiceActivity.class));
	}
	
	public void openTabHandler(View view){
		startActivity(new Intent(this,TabBarActivity.class));
	}
	
	public void openMenuListHandler(View view){
		startActivity(new Intent(this,MenuBarActivity.class));
	}
	
	public void openHuadongHandler(View view){
		startActivity(new Intent(this,HuadongActivity.class));
	}
	
}
