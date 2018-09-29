package com.example.aluno.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Declara variavel de textView
    lateinit var textView: TextView
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<Button>(R.id.textView1);
        editText = findViewById(R.id.ediText1);
    }

    fun testeClick(view: View){
        val textoEditText = ediText1.text.toString()
        Toast.makeText(this, "mensagem", Toast.LENGTH_SHORT).show()
        textView.text = textoEditText
    }
}
