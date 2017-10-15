package com.example.abir.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnAdd,btnSub,btnMul,btnDiv,btnEqual;
    EditText edtInput;
    TextView tvOutput;
    int i,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnOne=(Button)findViewById(R.id.btnOne);
        btnTwo=(Button)findViewById(R.id.btnTwo);
        btnThree=(Button)findViewById(R.id.btnThree);
        btnFour=(Button)findViewById(R.id.btnFour);
        btnFive=(Button)findViewById(R.id.btnFive);
        btnSix=(Button)findViewById(R.id.btnSix);
        btnSeven=(Button)findViewById(R.id.btnSeven);
        btnEight=(Button)findViewById(R.id.btnEight);
        btnNine=(Button)findViewById(R.id.btnNine);
        btnZero=(Button)findViewById(R.id.btnZero);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnEqual=(Button)findViewById(R.id.btnEqual);

        edtInput=(EditText) findViewById(R.id.edtInput);
        tvOutput=(TextView)findViewById(R.id.tvOutput);

        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                edtInput.setText(edtInput.getText()+"1");


            }
        });

        System.out.println(" ");
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtInput.setText(edtInput.getText()+"2");


            }
        });
    }
}
