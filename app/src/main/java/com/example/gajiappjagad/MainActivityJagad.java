package com.example.gajiappjagad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityJagad extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_jagad);

        Button btnGaji = findViewById(R.id.btnGajiJagad);
        Button btnPetunjuk = findViewById(R.id.btnPetunjukJagad);
        Button btnTentang = findViewById(R.id.btnTentangJagad);
        Button btnExit = findViewById(R.id.btnExitJagad);

        // Membuka Halaman Gaji
        btnGaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahGaji = new Intent(MainActivityJagad.this, GajiActivityJagad.class);
                startActivity(pindahGaji);
            }
        });

        // Membuka Halaman Petunjuk
        btnPetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahPetunjuk = new Intent(MainActivityJagad.this, PetunjukActivityJagad.class);
                startActivity(pindahPetunjuk);
            }
        });

        // Membuka Halaman Tentang
        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTentang = new Intent(MainActivityJagad.this, TentangActivityJagad.class);
                startActivity(pindahTentang);
            }
        });

        // Menutup Aplikasi
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}