package com.zjd.demo;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PublicShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_public_show);
		Uri uri = getIntent().getData();
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.public_show, menu);
        return true;
    }
}
