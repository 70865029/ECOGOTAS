package com.ecogota.appp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtnIniciarSesion.setOnClickListener {
        Toast.makeText(applicationContext, "Iniciar Sesion ",
            Toast.LENGTH_SHORT).show()

        }

        binding.BtnRegistrarme.setOnClickListenner{

            val intent = Intent(this@MainActivity, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}