package com.example.popuwindowtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

/*
 * 类名：PopuWindowTest 
 */
public class PopuWindowActivity extends Activity {

	private LinearLayout ll_user_insert;
	private Button btn_cancel;
	private Button btn_sure;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 加载R.layout.popup对应的界面布局
		View root = this.getLayoutInflater().inflate(R.layout.popup, null);
		// 创建出PopupWindow对象
		final PopupWindow popup = new PopupWindow(root, 500, 400);
		// 通过findViewById()找出ll_user_insert的id
		LinearLayout ll_user_insert = (LinearLayout) findViewById(R.id.ll_user_insert);
		// 通过findViewById()找出btn_sure的id
		Button btn_sure = (Button) findViewById(R.id.btn_sure);
		// 为ll_user_insert添加监听器
		ll_user_insert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// popup.showAsDropDown(v);
				// 将PopupWindow显示在指定位置
				popup.showAtLocation(findViewById(R.id.ll_user_insert),
						Gravity.LEFT, 200, 0);
			}
		});

		// 为PopupWindow中的取消按钮实现监听功能
		root.findViewById(R.id.btn_cancel).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						popup.dismiss();// 点击取消按钮关闭弹窗
					}
				});

		// 为PopupWindow中的确定按钮实现监听功能
		root.findViewById(R.id.btn_sure).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						AlertDialog.Builder builder = new AlertDialog.Builder(
								PopuWindowActivity.this);
						builder.setTitle("提示");
						builder.setMessage("请输入角色名称");

						builder.create().show();
					}
				});

		/*
		 * btn_sure.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * AlertDialog.Builder builder = new AlertDialog.Builder(
		 * PopuWindowTest.this); builder.setTitle("提示");
		 * builder.setMessage("请输入角色名称");
		 * 
		 * builder.setPositiveButton("确认", new DialogInterface.OnClickListener()
		 * {
		 * 
		 * @Override public void onClick(DialogInterface dialog, int which) { //
		 * TODO Auto-generated method stub Toast toast = Toast.makeText(
		 * getApplicationContext(), "what", Toast.LENGTH_SHORT); toast.show(); }
		 * }); builder.create().show(); } });
		 */
	}
}
