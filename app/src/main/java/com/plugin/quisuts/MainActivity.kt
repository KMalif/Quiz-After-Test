package com.plugin.quisuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plugin.quisuts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        receiveFromRegister()
    }

    private fun receiveFromRegister(){
        val namaBarang = intent.getStringExtra("namaBarang")
        val hargaBarang = intent.getStringExtra("hargaBarang")
        val jumlahBarang = intent.getStringExtra("jumlahBarang")

        if (namaBarang != null){
            binding.namaBarang.setText(namaBarang)
            binding.hargaBarang.setText(hargaBarang)
            binding.jumlahBarang.setText(jumlahBarang)
        }

    }
}