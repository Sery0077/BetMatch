package sery.vlasenko.betmatch

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBackground()

        setContentView(R.layout.background_layout)

        delayAndSetContentView()
    }

    private fun delayAndSetContentView() {
        Handler(Looper.getMainLooper()).postDelayed({
            setContentView(R.layout.activity_main)
        }, 3000)
    }

    private fun setBackground() {
        val pf = getSharedPreferences(getString(R.string.prefs), Context.MODE_PRIVATE)
        val backgroundId = pf.getInt(getString(R.string.pref_background_id), R.drawable.background_1)

        window?.setBackgroundDrawableResource(backgroundId)
    }
}