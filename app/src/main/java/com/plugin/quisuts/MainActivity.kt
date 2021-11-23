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
        supportActionBar?.hide()
        receiveFromRegister()
    }

    private fun receiveFromRegister(){
        var namaBarang = intent.getStringExtra("namaBarang")
        var hargaBarang = intent.getStringExtra("hargaBarang")
        var jumlahBarang = intent.getStringExtra("jumlahBarang")

        binding.namaBarang.text = namaBarang
        binding.hargaBarang.text = "Rp" + hargaBarang
        binding.jumlahBarang.text = jumlahBarang


    }
}