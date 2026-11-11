package com.example.gajiappjagad;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PetunjukActivityJagad extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk_jagad);

        Button btnKembali = findViewById(R.id.btnKembaliPetunjukJagad);

        // Perintah untuk menutup halaman ini dan kembali ke menu utama
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}