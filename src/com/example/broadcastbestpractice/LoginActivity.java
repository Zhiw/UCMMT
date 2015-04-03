package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
     private EditText accountEdit;
     private EditText passwordEdit;
     private Button login;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		accountEdit = (EditText)findViewById(R.id.account);
		passwordEdit = (EditText)findViewById(R.id.password);
		login = (Button)findViewById(R.id.login);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String account= accountEdit.getText().toString();
				String password= passwordEdit.getText().toString();
				
				if(account.equals("admin")&&password.equals("123456")){
					Intent intent = new Intent(LoginActivity.this,MainActivity.class);
					startActivity(intent);
					finish();
					
				}
				else {
					Toast.makeText(LoginActivity.this, "account or password is invaild", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
