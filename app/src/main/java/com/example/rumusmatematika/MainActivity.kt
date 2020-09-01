package com.example.rumusmatematika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            val alas = txtAlas.text
            val tinggi = txtTinggi.text

            if (alas.isNullOrBlank()){
                txtAlas.error = "Alas tidak boleh kosong"
                txtAlas.requestFocus()
            } else if (tinggi.isNullOrBlank()){
                txtTinggi.error = "Tinggi tidak boleh kosong"
                txtTinggi.requestFocus()
            } else {
                hitung(alas.toString().toInt(),tinggi.toString().toInt())
            }
        }

    }

    fun hitung(alas: Int, tinggi: Int){
        val hasil = alas * tinggi
        txtHasil.text = hasil.toString()
    }
}