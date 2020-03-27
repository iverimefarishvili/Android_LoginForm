package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClick();
    }

    private fun onClick() {
        signin_button.setOnClickListener {
            if(email_edittext.text.toString().isEmpty() || password_edittext.text.toString().isEmpty()) {
                Toast.makeText(this,"unsuccesfull", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,"succesfull", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
