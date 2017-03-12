package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends Activity implements View.OnClickListener {

    //Объявляем программе о существовании следующих объектов:
    private EditText mE1;
    private EditText mE2;
    private EditText mE3;
    private EditText mE4;
    private EditText mE5;
    private EditText mE6;
    private EditText mE7;
    private EditText mE8;
    private EditText mE9;
    private EditText mE10;
    private EditText mY1;
    private EditText mY2;
    private EditText mY3;
    private EditText mY4;
    private EditText mY5;
    private EditText mY6;
    private EditText mY7;
    private EditText mY8;
    private EditText mY9;
    private EditText mY10;
    private EditText mNumber;
    private TextView mResult;
    private Button mB1;
   // private Button mB2;
   // private Button mB3;
   // private Button mB4;
  //  private String mCount = "";
    //EditText[] mass = {mY1,mY2,mY3,mY4,mY5,mY6,mY7,mY8,mY9,mY10,mE1,mE2,mE3,mE4,mE5,mE6,mE7,mE8,mE9,mE10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Привязываем введенные программные объекты к созданным в файле разметки элементам:
        mE1=(EditText)findViewById(R.id.et1);
        mE2=(EditText)findViewById(R.id.et2);
        mE3=(EditText)findViewById(R.id.et3);
        mE4=(EditText)findViewById(R.id.et4);
        mE5=(EditText)findViewById(R.id.et5);
        mE6=(EditText)findViewById(R.id.et6);
        mE7=(EditText)findViewById(R.id.et7);
        mE8=(EditText)findViewById(R.id.et8);
        mE9=(EditText)findViewById(R.id.et9);
        mE10=(EditText)findViewById(R.id.et10);
        mY1=(EditText)findViewById(R.id.rt1);
        mY2=(EditText)findViewById(R.id.rt2);
        mY3=(EditText)findViewById(R.id.rt3);
        mY4=(EditText)findViewById(R.id.rt4);
        mY5=(EditText)findViewById(R.id.rt5);
        mY6=(EditText)findViewById(R.id.rt6);
        mY7=(EditText)findViewById(R.id.rt7);
        mY8=(EditText)findViewById(R.id.rt8);
        mY9=(EditText)findViewById(R.id.rt9);
        mY10=(EditText)findViewById(R.id.rt10);
        mNumber=(EditText)findViewById(R.id.number);
        mResult=(TextView)findViewById(R.id.result);
        mB1=(Button)findViewById(R.id.plus);
        //mB2=(Button)findViewById(R.id.minus);
       // mB3=(Button)findViewById(R.id.multiply);
       // mB4=(Button)findViewById(R.id.divide);

        //Приписываем нашим кнопочкам нажатие:
        mB1.setOnClickListener(this);
     //   mB2.setOnClickListener(this);
     //   mB3.setOnClickListener(this);
     //   mB4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        //Вводим переменные, с которыми будем оперировать:
        float x1 =0; float y1 =0;
        float x2 =0; float y2 =0;
        float x3 =0; float y3 =0;
        float x4 =0; float y4 =0;
        float x5 =0; float y5 =0;
        float x6 =0; float y6 =0;
        float x7 =0; float y7 =0;
        float x8 =0; float y8 =0;
        float x9 =0; float y9 =0;
        float x10 =0; float y10 =0;
       // float result=0;
        float a = 0;
        float b = 0;
        double Sb = 0;
        double Sa = 0;

        float n = 0;

        //Принимаем значения для value1 и value2 с элементов ввода:
        x1=Float.parseFloat(mE1.getText().toString());
        x2=Float.parseFloat(mE2.getText().toString());
        x3=Float.parseFloat(mE3.getText().toString());
        x4=Float.parseFloat(mE4.getText().toString());
        x5=Float.parseFloat(mE5.getText().toString());
        x6=Float.parseFloat(mE6.getText().toString());
        x7=Float.parseFloat(mE7.getText().toString());
        x8=Float.parseFloat(mE8.getText().toString());
        x9=Float.parseFloat(mE9.getText().toString());
        x10=Float.parseFloat(mE10.getText().toString());

        y1=Float.parseFloat(mY1.getText().toString());
        y2=Float.parseFloat(mY2.getText().toString());
        y3=Float.parseFloat(mY3.getText().toString());
        y4=Float.parseFloat(mY4.getText().toString());
        y5=Float.parseFloat(mY5.getText().toString());
        y6=Float.parseFloat(mY6.getText().toString());
        y7=Float.parseFloat(mY7.getText().toString());
        y8=Float.parseFloat(mY8.getText().toString());
        y9=Float.parseFloat(mY9.getText().toString());
        y10=Float.parseFloat(mY10.getText().toString());

        n=Float.parseFloat(mNumber.getText().toString());


        float x = (x1+x2+x3+x4+x5+x6+x7+x8+x9+x10)/n;
        float y = (y1+y2+y3+y4+y5+y6+y7+y8+y9+y10)/n;
        float xy =(x1*y1+x2*y2+x3*y3+x4*y4+x5*y5+x6*y6+x7*y7+x8*y8+x9*y9+x10*y10)/n;
        float xx =(x1*x1+x2*x2+x3*x3+x4*x4+x5*x5+x6*x6+x7*x7+x8*x8+x9*x9+x10*x10)/n;
        float yy =(y1*y1+y2*y2+y3*y3+y4*y4+y5*y5+y6*y6+y7*y7+y8*y8+y9*y9+y10*y10)/n;



        //Описываем действия кнопок:
        switch (v.getId()) {
            case R.id.plus:
              //  mCount = "result";
                //result = x1 + x2;
                b = (xy - (x * y)) / (xx - x * x);
                a = y - b*x;
                Sb = (1/(sqrt(n)))*(sqrt(((yy-y*y)/(xx-x*x))-b*b));
                Sa = Sb*sqrt(xx - x*x);
                break;
           // case R.id.minus:
           //     mCount = "-";
            //    result = value1 - value2;
           //     break;
         //   case R.id.multiply:
           //     mCount = "*";
           //     result = value1 * value2;
           //     break;
         //   case R.id.divide:
          //      mCount = "/";
          //      result = value1 / value2;
          //      break;
            default:
                break;
        }

        //настраиваем отображение результата:
        mResult.setText("a = " + a + "     b = " + b + "       Sa = " + Sa + "      Sb = " + Sb);
    }
}