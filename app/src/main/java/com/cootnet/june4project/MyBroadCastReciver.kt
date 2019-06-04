package com.cootnet.june4project

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastReciver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
     val s:String? = intent?.action
        when(s) {
            Intent.ACTION_POWER_CONNECTED -> {
                Toast.makeText(context, "connect", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED -> {
                Toast.makeText(context, "disconnect", Toast.LENGTH_LONG).show()

            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                Toast.makeText(context, "plane mode changed", Toast.LENGTH_LONG).show()

            }
        }

    }
}