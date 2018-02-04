package com.example.alertdialog;

import android.app.Activity;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends Activity {

	private Button btn_one;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn_one = (Button) findViewById(R.id.btn_one);

		btn_one.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				/*
				 * AlertDialog is in-built class of Andorid Package,you can not
				 * use that name,try some another name AlertDialog1 like
				 * 
				 * your class name should be changed to AlertDialog1,also your 
				 * class file name should be changed too
				 */
				AlertDialog.Builder builder = new AlertDialog.Builder(
						AlertDialogActivity.this);
				builder.setTitle("Ã· æ");
				builder.setMessage("«Î—°‘Ò");

				/*builder.setPositiveButton("OK",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								Toast toast = Toast.makeText(
										getApplicationContext(),"what",
										Toast.LENGTH_LONG);
								toast.show();
							}
						});*/
				builder.create().show();
			}
		});

	}

}
