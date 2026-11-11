package com.example.gajiappjagad;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GajiActivityJagad extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_jagad);

        // 1. Kenalkan semua kolom input dan output ke Java
        EditText inputGajiPokok = findViewById(R.id.inputGajiPokokJagad);
        EditText inputTunjJabatan = findViewById(R.id.inputTunjanganJabJagad);
        EditText inputHariKerja = findViewById(R.id.inputHariKerjaJagad);
        Button btnHitung = findViewById(R.id.btnHitungJagad);

        TextView outMakan = findViewById(R.id.outTunjanganMakanJagad);
        TextView outTransport = findViewById(R.id.outTunjanganTransportJagad);
        TextView outGotor = findViewById(R.id.outGajiKotorJagad);
        TextView outBersih = findViewById(R.id.outGajiBersihJagad);

        // 2. Apa yang terjadi saat tombol HITUNG diklik?
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil teks dari kolom, ubah menjadi angka (Double/Integer)
                double gajiPokok = Double.parseDouble(inputGajiPokok.getText().toString());
                double tunjJabatan = Double.parseDouble(inputTunjJabatan.getText().toString());
                int hariKerja = Integer.parseInt(inputHariKerja.getText().toString());

                // 3. Proses Rumus sesuai soal UTS
                double tunjMakan = hariKerja * 10000;
                double tunjTransport = hariKerja * 5000;
                double gajiKotor = gajiPokok + tunjJabatan + tunjMakan + tunjTransport;
                double pajak = gajiKotor * 0.10; // Pajak 10%
                double gajiBersih = gajiKotor - pajak;

                // 4. Tampilkan kembali ke layar
                outMakan.setText("Tunjangan Makan: Rp " + tunjMakan);
                outTransport.setText("Tunjangan Transportasi: Rp " + tunjTransport);
                outGotor.setText("Gaji Kotor: Rp " + gajiKotor);
                outBersih.setText("Gaji Bersih: Rp " + gajiBersih);
            }
        });
    }
}