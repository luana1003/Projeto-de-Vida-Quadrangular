package com.example.projetodevidaquadrangular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        var tvFazerLogin = findViewById<TextView>(R.id.tvFazerLogin);
        tvFazerLogin.setOnClickListener { irParaLogin() } //Quando a textView de login é clicada, aparece a tela de login.
    }

    //Função para levar à tela de login
    fun irParaLogin(){
        val intent = Intent (this, Login::class.java) //Iniciando a intenção para ir à tela de login.
        startActivity(intent)
    }
}