package com.example.projetodevidaquadrangular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var tvCadastrar = findViewById<TextView>(R.id.tvCadastrar);
        tvCadastrar.setOnClickListener { irParaCadastro() } //Quando a textView de cadastro é clicada, aparece a tela de cadastro.
    }

    //Função para levar à tela de cadastro
    fun irParaCadastro(){
        val intent = Intent (this, Cadastro::class.java) //Iniciando a intenção para ir à tela de cadastro.
        startActivity(intent)
    }
}