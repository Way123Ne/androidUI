package com.example.arraylistdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	/*1>�����ļ�������ListView�ؼ�
	  2>�����ļ����ҳ�ListView�ؼ�id
	  3>Ϊÿһ��ListView��view ������һ������
	  4>����һ��arrayadapter����,ͬʱָ��listview��ʽ
	  5>Ϊlistview�ؼ�����������
	*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ListView list1 = (ListView)findViewById(R.id.list1);
		//����һ������
		String[] arr1 = {"�����","��˽�","ţħ��"};
		//�������װΪArrayAdapter
		ArrayAdapter<String> adpter1 = new ArrayAdapter<String>
		(this,R.layout.array_item,arr1);
		//Ϊlistview�ؼ�����������
		list1.setAdapter(adpter1);
	}
}
