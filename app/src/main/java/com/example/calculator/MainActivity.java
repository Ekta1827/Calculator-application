package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edittxt, prevResult;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    Button btnadd,btnsub,btnmul,btndiv,btnequal,btnclear,btndot,btnboublezero,btnper;
    float res1,res2;
    boolean add,sub,mul,div,per;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittxt=(EditText) findViewById(R.id.edittxt);
        prevResult=(EditText) findViewById(R.id.prevResult);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn10=(Button)findViewById(R.id.btn10);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnequal=(Button)findViewById(R.id.btnequal);
        btnclear=(Button)findViewById(R.id.btnclear);
        btndot=(Button)findViewById(R.id.btndot);
        btnboublezero=(Button)findViewById(R.id.btnboublezero);
        btnper=(Button)findViewById(R.id.btnper);

        result = "";
        prevResult.setText(result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"7");
                prevResult.setText(result);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"8");
                prevResult.setText(result);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"9");
                prevResult.setText(result);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"4");
                prevResult.setText(result);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"5");
                prevResult.setText(result);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"6");
                prevResult.setText(result);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"1");
                prevResult.setText(result);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"2");
                prevResult.setText(result);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"3");
                prevResult.setText(result);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"0");
                prevResult.setText(result);
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+".");
                prevResult.setText(result);
            }
        });
        btnboublezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittxt.setText(edittxt.getText()+"00");
                prevResult.setText(result);
            }
        });

        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittxt==null){
                    edittxt.setText("");
                }
                else{
                    res1=Float.parseFloat(edittxt.getText()+"");
                    per=true;
                    edittxt.setText(null);
                }
            }
        });btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittxt==null){
                    edittxt.setText("");
                }
                else{
                    res1=Float.parseFloat(edittxt.getText()+"");
                    add=true;
                    edittxt.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittxt==null){
                    edittxt.setText("");
                }
                else{
                    res1=Float.parseFloat(edittxt.getText()+"");
                    sub=true;
                    edittxt.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittxt==null){
                    edittxt.setText("");
                }
                else{
                    res1=Float.parseFloat(edittxt.getText()+"");
                    mul=true;
                    edittxt.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittxt==null){
                    edittxt.setText("");
                }
                else{
                    res1=Float.parseFloat(edittxt.getText()+"");
                    div=true;
                    edittxt.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(edittxt.getText()+"");
                if(add==true)
                {
                    edittxt.setText(res1+res2+"");
                    add=false;
                    prevResult.setText(result);
                    result = res1 + " + " + res2 + " = " + res1 + res2;
                }
                if(sub==true)
                {
                    edittxt.setText(res1-res2+"");
                    sub=false;
                    prevResult.setText(result);
                    result = res1 + " - " + res2 + " = " + (res1 - res2);
                }
                if(mul==true)
                {
                    edittxt.setText(res1*res2+"");
                    mul=false;
                    prevResult.setText(result);
                    result = res1 + " * " + res2 + " = " + res1 * res2;
                }
                if(div==true)
                {
                    edittxt.setText(res1/res2+"");
                    div=false;
                    prevResult.setText(result);
                    result = res1 + " / " + res2 + " = " + res1 / res2;
                }
                if(per==true)
                {
                    edittxt.setText(res1%res2+"");
                    per=false;
                    prevResult.setText(result);
                    result = res1 + " % " + res2 + " = " + res1 % res2;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittxt.getText().toString() == "") {
                    result = "";
                    prevResult.setText(result);
                }
                edittxt.setText("");
            }
        });
    }
}