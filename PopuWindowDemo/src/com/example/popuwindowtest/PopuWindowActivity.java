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
 * ������PopuWindowTest 
 */
public class PopuWindowActivity extends Activity {

	private LinearLayout ll_user_insert;
	private Button btn_cancel;
	private Button btn_sure;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ����R.layout.popup��Ӧ�Ľ��沼��
		View root = this.getLayoutInflater().inflate(R.layout.popup, null);
		// ������PopupWindow����
		final PopupWindow popup = new PopupWindow(root, 500, 400);
		// ͨ��findViewById()�ҳ�ll_user_insert��id
		LinearLayout ll_user_insert = (LinearLayout) findViewById(R.id.ll_user_insert);
		// ͨ��findViewById()�ҳ�btn_sure��id
		Button btn_sure = (Button) findViewById(R.id.btn_sure);
		// Ϊll_user_insert��Ӽ�����
		ll_user_insert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// popup.showAsDropDown(v);
				// ��PopupWindow��ʾ��ָ��λ��
				popup.showAtLocation(findViewById(R.id.ll_user_insert),
						Gravity.LEFT, 200, 0);
			}
		});

		// ΪPopupWindow�е�ȡ����ťʵ�ּ�������
		root.findViewById(R.id.btn_cancel).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						popup.dismiss();// ���ȡ����ť�رյ���
					}
				});

		// ΪPopupWindow�е�ȷ����ťʵ�ּ�������
		root.findViewById(R.id.btn_sure).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						AlertDialog.Builder builder = new AlertDialog.Builder(
								PopuWindowActivity.this);
						builder.setTitle("��ʾ");
						builder.setMessage("�������ɫ����");

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
		 * PopuWindowTest.this); builder.setTitle("��ʾ");
		 * builder.setMessage("�������ɫ����");
		 * 
		 * builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener()
		 * {
		 * 
		 * @Override public void onClick(DialogInterface dialog, int which) { //
		 * TODO Auto-generated method stub Toast toast = Toast.makeText(
		 * getApplicationContext(), "what", Toast.LENGTH_SHORT); toast.show(); }
		 * }); builder.create().show(); } });
		 */
	}
}
