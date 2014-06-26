package com.example.sampletoast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText edtValue;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		edtValue = (EditText) findViewById(R.id.edtValue);


		Button btnSubmitVAl = (Button)findViewById(R.id.btnSubmitVAl);
		btnSubmitVAl.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				InputMethodManager imm = (InputMethodManager)getSystemService(
						Context.INPUT_METHOD_SERVICE);
				imm.hideSoftInputFromWindow(edtValue.getWindowToken(), 0);

				Toast.makeText(MainActivity.this, "You have entered:"+edtValue.getText().toString(), Toast.LENGTH_LONG).show();

			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
