package com.example.datetimepickerdemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends Activity {
	static int mYear, mMonth, mDay;
	private TextView tv_singed_date, tv_expire_date;
	final int SINGED_DATE_DIALOG = 1;
	final int EXPIRE_DATE_DIALOG = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv_singed_date = (TextView) findViewById(R.id.tv_singed_date);
		tv_expire_date = (TextView) findViewById(R.id.tv_expire_date);

		tv_singed_date.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(SINGED_DATE_DIALOG);
			}
		});

		tv_expire_date.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(EXPIRE_DATE_DIALOG);
			}
		});

		final Calendar ca = Calendar.getInstance();
		mYear = ca.get(Calendar.YEAR);
		mMonth = ca.get(Calendar.MONTH);
		mDay = ca.get(Calendar.DAY_OF_MONTH);
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		switch (id) {
		case SINGED_DATE_DIALOG:
			return new DatePickerDialog(this, singed_mdateListener, mYear,
					mMonth, mDay);

		case EXPIRE_DATE_DIALOG:
			return new DatePickerDialog(this, expire_mdateListener, mYear,
					mMonth, mDay);
		}
		return null;
	}

	// 设置文本的内容 -宋玮琦 2017-11-15
	public void singed_date_display() {
		tv_singed_date.setText(new StringBuffer().append(mYear).append("-")
				.append(mMonth + 1).append("-").append(mDay).append(""));
	}

	public void expire_date_display() {
		tv_expire_date.setText(new StringBuffer().append(mYear).append("-")
				.append(mMonth + 1).append("-").append(mDay).append(""));

	}

	private DatePickerDialog.OnDateSetListener singed_mdateListener = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			mYear = year;
			mMonth = monthOfYear;
			mDay = dayOfMonth;
			singed_date_display();
		}
	};

	private DatePickerDialog.OnDateSetListener expire_mdateListener = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			mYear = year;
			mMonth = monthOfYear;
			mDay = dayOfMonth;
			expire_date_display();
		}
	};

}
