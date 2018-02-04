package com.example.arraylistdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	/*1>布局文件中声明ListView控件
	  2>代码文件中找出ListView控件id
	  3>为每一行ListView中view 声明出一个数组
	  4>创建一个arrayadapter对象,同时指定listview样式
	  5>为listview控件设置适配器
	*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ListView list1 = (ListView)findViewById(R.id.list1);
		//定义一个数组
		String[] arr1 = {"孙悟空","猪八戒","牛魔王"};
		//将数组包装为ArrayAdapter
		ArrayAdapter<String> adpter1 = new ArrayAdapter<String>
		(this,R.layout.array_item,arr1);
		//为listview控件设置适配器
		list1.setAdapter(adpter1);
	}
}
