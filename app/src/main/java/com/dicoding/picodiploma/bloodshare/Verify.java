package com.dicoding.picodiploma.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Verify extends AppCompatActivity {
//Tgl Pengerjaan 29 April 2021
//Nim   : 10116580
//Nama  : Hamdan Hamdani
//Kelas : IF-1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void send(View view) {
        Intent intent = new Intent(Verify.this, Home.class);
        startActivity(intent);
    }
}