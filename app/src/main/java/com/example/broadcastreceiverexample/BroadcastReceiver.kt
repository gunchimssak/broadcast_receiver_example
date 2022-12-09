package com.example.broadcastreceiverexample

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BroadcastReceiver : android.content.BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        StringBuilder().apply {
            append("Action: ${intent?.action}\n")
            append("URI: ${intent?.toUri(Intent.URI_INTENT_SCHEME)}\n")
            toString().also { log ->
                Log.e("BroadcastReceiver", log)
                Toast.makeText(context, log, Toast.LENGTH_LONG).show()
            }
        }
    }
}