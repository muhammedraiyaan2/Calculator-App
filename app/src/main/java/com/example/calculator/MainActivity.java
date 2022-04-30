package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText num1,num2;
TextView output,output2,output3,output4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
    }
    public void calculate(View view){
        output=findViewById(R.id.output);
        output2=findViewById(R.id.output2);
        output3=findViewById(R.id.output3);
        output4=findViewById(R.id.output4);
        int nums1=Integer.parseInt(num1.getText().toString());
        int nums2=Integer.parseInt(num2.getText().toString());
        int sum=nums1+nums2;
        int sub=nums1-nums2;
        int mul=nums1*nums2;
        int div=nums1/nums2;
        output.setText("The addition of two number is "+sum);
        output2.setText("The subraction of two numbers is "+sub);
        output3.setText("The multiplication of two numbers is "+mul);
        output4.setText("The division of two numbers is "+div);
    }
}