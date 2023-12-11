package com.example.projetodevidaquadrangular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

//Activity da SplashScreen
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Realizando a transição da SplashScreen para a tela de login
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}