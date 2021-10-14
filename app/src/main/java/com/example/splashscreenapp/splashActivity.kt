package com.example.splashscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import java.lang.Exception
import java.lang.Thread.sleep
import kotlin.concurrent.thread

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        thread {

            run() {

                try {
                    sleep(10000)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                finally {
                    intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}