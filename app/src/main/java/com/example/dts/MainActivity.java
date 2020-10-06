package com.example.dts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_nama,btn_kalkulator,btn_listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_nama = findViewById(R.id.btn_input);
        btn_kalkulator = findViewById(R.id.btn_kalkulator);
        btn_listview = findViewById(R.id.btn_list);
    }


    public void moveInputnama(View view) {
        Intent mv_input = new Intent(MainActivity.this,IsianNama.class);
        startActivity(mv_input);
    }
    public void moveKalkulator(View view) {
        Intent mv_kalkulator = new Intent(MainActivity.this,kalkulator.class);
        startActivity(mv_kalkulator);
    }
    public void moveList(View view) {
        Intent mv_list = new Intent(MainActivity.this,listView.class);
        startActivity(mv_list);
    }
}