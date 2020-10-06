package com.example.dts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kalkulator extends AppCompatActivity {
    EditText et_1, et_2;
    Button btn_tambah, btn_kurang, btn_kali, btn_bagi, reset;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);
        et_1 = (EditText)findViewById(R.id.et_1);
        et_2 = (EditText)findViewById(R.id.et_2);
        btn_tambah = (Button)findViewById(R.id.btn_tambah);
        btn_kurang = (Button)findViewById(R.id.btn_kurang);
        btn_kali = (Button)findViewById(R.id.btn_kali);
        btn_bagi = (Button)findViewById(R.id.btn_bagi);
        reset = (Button)findViewById(R.id.reset);
        
    }

}