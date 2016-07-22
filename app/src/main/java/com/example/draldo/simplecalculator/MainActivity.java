package com.example.draldo.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG_" ;
    private EditText mEditText;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButtonAdd;
    private Button mButtonSub;
    private Button mButtonRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.a_main_et);

        mButton1 = (Button) findViewById(R.id.a_main_n1);
        mButton2 = (Button) findViewById(R.id.a_main_n2);
        mButton3 = (Button) findViewById(R.id.a_main_n3);
        mButton4 = (Button) findViewById(R.id.a_main_n4);
        mButton5 = (Button) findViewById(R.id.a_main_n5);
        mButton6 = (Button) findViewById(R.id.a_main_n6);

        mButtonAdd = (Button) findViewById(R.id.a_add_btn);
        mButtonSub = (Button) findViewById(R.id.a_sub_btn);
        mButtonRes = (Button) findViewById(R.id.a_res_btn);
    }

    public void type1(View view) {
        Log.d(TAG, "type1: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + 1);
    }

    public void type2(View view) {
        Log.d(TAG, "type2: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + 2);
    }

    public void type3(View view) {
        Log.d(TAG, "type3: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + 3);
    }

    public void type4(View view) {
        Log.d(TAG, "type4: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + 4);
    }

    public void type5(View view) {
        Log.d(TAG, "type5: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + 5);
    }

    public void type6(View view) {
        Log.d(TAG, "type6: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + 6);
    }

    public void sum(View view) {
        Log.d(TAG, "sum: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + "+");
    }

    public void min(View view) {
        Log.d(TAG, "min: ");
        String tmp = mEditText.getText().toString();
        mEditText.setText(tmp + "-");
    }

    public void result(View view) {
        Log.d(TAG, "res: ");
        String tmp = mEditText.getText().toString();
        int result;
        if(tmp.contains("-")){
            String[] numbers = tmp.split("-");
            result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        }
        else {
            String[] numbers = tmp.split("\\+");
            result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
        mEditText.setText(String.valueOf(result));
    }
}
