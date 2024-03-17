package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeActivity: Button = findViewById(R.id.changeActivity)
        val dataString: EditText = findViewById(R.id.dataString)

        changeActivity.setOnClickListener{
            val data = dataString.text.toString()

            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra("dataString", data)
            startActivity(intent)

        }
    }
}



