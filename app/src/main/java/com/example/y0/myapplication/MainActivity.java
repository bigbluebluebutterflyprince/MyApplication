package com.example.y0.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.edit_text);//上方搜索框
        initFruit();//初始化
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                if(fruit.getName() ==  "炸鸡店"){
                    Intent intent = new Intent(MainActivity.this,zhajidian.class);
                startActivity(intent);}
                else if(fruit.getName() == "火锅店"){
                    Intent intent = new Intent(MainActivity.this,huoguodian.class);
                    startActivity(intent);
                }
            }
        });


    }

    //初始化
    private void initFruit(){
        for (int i=0;i<4;i++){
            Fruit zhaji = new Fruit("炸鸡店","123km","月售3333笔",R.drawable.huoguo);
            fruitList.add(zhaji);
            Fruit shuiguo = new Fruit("水果店","456km","月售2222笔",R.drawable.huoguo);
            fruitList.add(shuiguo);
            Fruit huoguo = new Fruit("火锅店","789km","月售4444笔",R.drawable.huoguo);
            fruitList.add(huoguo);
            Fruit niupai = new Fruit("牛排店","222km","月售1111笔",R.drawable.huoguo);
            fruitList.add(niupai);
        }
    }


}
