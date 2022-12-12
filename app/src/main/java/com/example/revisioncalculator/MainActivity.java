package com.example.revisioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView res, tit;
    Button btn;
    EditText op1, op2;
    RadioButton bt1, bt2, bt3 , bt4;
    Switch sw1, sw2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =this.findViewById(R.id.btncalc);
        op1=this.findViewById(R.id.op1);
        op2=this.findViewById(R.id.op2);
        res = this.findViewById(R.id.tv5);
        bt1 = this.findViewById(R.id.rbadd);
        bt2 = this.findViewById(R.id.rbsous);
        bt3 = this.findViewById(R.id.rbmul);
        bt4 = this.findViewById(R.id.rbdiv);
        sw1 = this.findViewById(R.id.neg1);
        sw2 = this.findViewById(R.id.neg2);
        btn.setOnClickListener(this);


   /*     this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String editText1 = op1.getText().toString();
                String editText2 = op2.getText().toString();
                int x1 = Integer.valueOf(editText1);
                int x2 = Integer.valueOf(editText2);

                res.setText("Resultat = "+(x1+x2));

            }
        });*/




    }

/*    public void btn_calculate(View view) {
        String editText1 = op1.getText().toString();
        String editText2 = op2.getText().toString();
        int x1 = Integer.valueOf(editText1);
        int x2 = Integer.valueOf(editText2);

        res.setText("Resultat = "+(x1+x2));

    }*/

    public void onClick(View V){
        String editText1 = op1.getText().toString();
        String editText2 = op2.getText().toString();
        int x1 = Integer.valueOf(editText1);
        int x2 = Integer.valueOf(editText2);
        if(sw1.isChecked()){
            x1 = -x1;
        }
        if(sw1.isChecked()){
            x2 = -x2;
        }
        float r=0;
        if(bt1.isChecked()){
            r = x1+x2;
        }
        if(bt2.isChecked()){
            r = x1-x2;
        }
        if(bt3.isChecked()){
            r = x1*x2;
        }
        if(bt4.isChecked()){
            r = (float) x1/ (float) x2;
        }
        res.setText("Resultat = "+r);




    }
}