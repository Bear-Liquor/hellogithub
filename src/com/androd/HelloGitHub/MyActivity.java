package com.androd.HelloGitHub;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		System.out.println("马上测试");
		System.out.println("First Test");
		System.out.println("Second Test");
	}
}
