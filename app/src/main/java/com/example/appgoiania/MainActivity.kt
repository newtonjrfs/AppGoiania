package com.example.appgoiania

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao.setOnClickListener {

            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.activity_text,null)
            dialog.setContentView(view)
            dialog.show()

        }

        btn_env_texto.setOnClickListener {

            val mensagem : String = getString(R.string.text)

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,mensagem)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent,"Selecione um aplicativo para encaminhar o texto"))

        }

    }
}
