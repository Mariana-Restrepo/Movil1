package com.example.myapplication
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDeviceInfo: TextView = findViewById(R.id.tvDeviceInfo)
        tvDeviceInfo.text = getDeviceInfo()
    }

    private fun getDeviceInfo(): String {
        return buildString {
            append("Modelo: ").append(Build.MODEL).append("\n")
            append("Fabricante: ").append(Build.MANUFACTURER).append("\n")
            append("Versión de Android: ").append(Build.VERSION.RELEASE).append("\n")
            append("SDK: ").append(Build.VERSION.SDK_INT).append("\n")
            append("Procesador: ").append(Build.HARDWARE).append("\n")
        }
    }
}