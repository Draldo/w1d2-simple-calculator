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

        mButtonAdd = (Button) findViewById(R.id.a_add_btn);
        mButtonSub = (Button) findViewById(R.id.a_sub_btn);
        mButtonRes = (Button) findViewById(R.id.a_res_btn);
    }

    public void type1(View view) {
        Log.d(TAG, "type1: ");
        mEditText.append(mButton1.getText());
    }

    public void type2(View view) {
        Log.d(TAG, "type2: ");
    }

    public void type3(View view) {
        Log.d(TAG, "type3: ");
    }

    public void sum(View view) {
        Log.d(TAG, "sum: ");
    }

    public void min(View view) {
        Log.d(TAG, "min: ");
    }

    public void result(View view) {
        Log.d(TAG, "res: ");
    }
}
