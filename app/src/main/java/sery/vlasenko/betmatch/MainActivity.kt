package sery.vlasenko.betmatch

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.background_layout)

        delayAndSetContentView()
    }

    private fun delayAndSetContentView() {
        Handler(Looper.getMainLooper()).postDelayed({
            setContentView(R.layout.activity_main)
        }, 0)
    }
}