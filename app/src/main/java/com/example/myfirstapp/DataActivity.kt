package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myfirstapp.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val exitActivity: Button = findViewById(R.id.exitActivity)
        val displayData: TextView = findViewById(R.id.displayData)

        val intent = intent

        val dataString = intent.getStringExtra("dataString")

        displayData.text = dataString

        exitActivity.setOnClickListener{

            finish()

        }
    }
}