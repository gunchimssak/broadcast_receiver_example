package com.example.broadcastreceiverexample

import android.annotation.SuppressLint
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val br = BroadcastReceiver()
        val filter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        val filter3 = IntentFilter(Intent.ACTION_POWER_CONNECTED)
        val filter4 = IntentFilter(Intent.ACTION_POWER_DISCONNECTED)
        val filter2 = IntentFilter("hello")
        //충전기 꼽았다 뺏다하면 반응함
        registerReceiver(br, filter)
        registerReceiver(br, filter2)
        registerReceiver(br, filter3)
        registerReceiver(br, filter4)
        val button = findViewById<TextView>(R.id.hello)
        button.setOnClickListener {
            sendBroadcast(Intent("hello"))
        }
    }
}