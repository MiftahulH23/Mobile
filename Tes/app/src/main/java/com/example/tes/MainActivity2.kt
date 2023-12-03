package com.example.tes
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain2)
    }

    fun kembali(view: View?) {
        val i = Intent(applicationContext, MainActivity::class.java)
        startActivity(i)
    }
}