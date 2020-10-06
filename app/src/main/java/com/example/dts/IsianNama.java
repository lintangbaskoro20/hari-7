package com.example.dts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IsianNama extends AppCompatActivity {
    EditText et_nama, et_alamat;
    Button btn_simpan, btn_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputnama);
        et_nama = findViewById(R.id.et_nama);
        et_alamat = findViewById(R.id.et_alamat);
        btn_simpan = findViewById(R.id.btn_simpan);
        btn_reset = findViewById(R.id.btn_reset);
    }

    public void onClick(View view) {
        String Nama,Alamat;
        if(et_nama.getText().toString().equals("")){
            Toast.makeText(IsianNama.this, "Silahkan Isikan Nama!", Toast.LENGTH_LONG).show();
            et_nama.requestFocus();
        }else if(et_alamat.getText().toString().equals("")) {
            Toast.makeText(IsianNama.this, "Silahkan Isikan Alamat!", Toast.LENGTH_LONG).show();
            et_alamat.requestFocus();
        }else{
            Nama = et_nama.getText().toString();
            Alamat = et_alamat.getText().toString();
            Toast.makeText(IsianNama.this,"Selamat Datang"+Nama+" yang beralamat di "+Alamat,Toast.LENGTH_LONG).show();


        }
    }

    public void reset(View view) {
        et_nama.setText("");
        et_alamat.setText("");
    }
}