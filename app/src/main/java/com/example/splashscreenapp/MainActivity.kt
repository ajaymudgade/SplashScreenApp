package com.example.splashscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)


        yoga.setOnClickListener() {
            animation.visibility = View.VISIBLE
            yoga.visibility = View.INVISIBLE
            animation.playAnimation()

            thread {

                run() {

                    try {
                        Thread.sleep(3000)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    } finally {
                        intent = Intent(this, DetailActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }

        }


    }


}