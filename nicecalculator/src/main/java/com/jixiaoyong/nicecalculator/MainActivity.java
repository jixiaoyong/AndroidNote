package com.jixiaoyong.nicecalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //声明各个按钮
    Button no0 = null;
    Button no1 = null;
    Button no2 = null;
    Button no3 = null;
    Button no4 = null;
    Button no5 = null;
    Button no6 = null;
    Button no7 = null;
    Button no8 = null;
    Button no9 = null;
    Button clear = null;
    Button delete = null;
    Button add = null;
    Button reduce = null;
    Button multiply = null;
    Button divide = null;
    Button equal = null;
    TextView result = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = (TextView)findViewById(R.id.result);

        //定义各个0~9按钮
        no0 = (Button)findViewById(R.id.no0);
        no1 = (Button)findViewById(R.id.no1);
        no2 = (Button)findViewById(R.id.no2);
        no3 = (Button)findViewById(R.id.no3);
        no4 = (Button)findViewById(R.id.no4);
        no5 = (Button)findViewById(R.id.no5);
        no6 = (Button)findViewById(R.id.no6);
        no7 = (Button)findViewById(R.id.no7);
        no8 = (Button)findViewById(R.id.no8);
        no9 = (Button)findViewById(R.id.no9);

        //定义各种按钮
        clear = (Button)findViewById(R.id.clear);
        delete = (Button)findViewById(R.id.delete);
        equal = (Button)findViewById(R.id.equal);

        //定义+-*/
        add = (Button)findViewById(R.id.add);
        reduce = (Button)findViewById(R.id.reduce);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);

        //添加监听事件
        no1.setOnClickListener(this);
        no2.setOnClickListener(this);
        no3.setOnClickListener(this);
        no4.setOnClickListener(this);
        no5.setOnClickListener(this);
        no6.setOnClickListener(this);
        no7.setOnClickListener(this);
        no8.setOnClickListener(this);
        no9.setOnClickListener(this);
        no0.setOnClickListener(this);

        clear.setOnClickListener(this);
        delete.setOnClickListener(this);
        equal.setOnClickListener(this);
        add.setOnClickListener(this);
        reduce.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);

        }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.no0:
            {}
        }
    }



}