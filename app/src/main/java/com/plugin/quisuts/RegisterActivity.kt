package com.plugin.quisuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plugin.quisuts.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        sendRegisterValue()
    }

    private fun sendRegisterValue(){
        binding.btnRegister.setOnClickListener {
            val namaBarang = binding.etName.text.toString()
            val hargaBarang = binding.etPrice.text.toString()
            val jumlahBarang = binding.etItemsCount.text.toString()
            startActivity(Intent(this, MainActivity::class.java).apply {
                putExtra("namaBarang", namaBarang)
                putExtra("hargaBarang", hargaBarang)
                putExtra("jumlahBarang", jumlahBarang)
            })
        }

    }
}