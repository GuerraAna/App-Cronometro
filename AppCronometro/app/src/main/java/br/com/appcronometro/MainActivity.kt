package br.com.appcronometro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import br.com.appcronometro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var running: Boolean = false
    var pause: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIniciar.setOnClickListener {
            if(!running) {
                binding.chronometer.base = SystemClock.elapsedRealtime() - pause
                binding.chronometer.start()
                running = true
            }
        }

        binding.buttonPausar.setOnClickListener {
            if (running) {
                binding.chronometer.stop()
                pause = SystemClock.elapsedRealtime() - binding.chronometer.base
                running = false
            }
        }

        binding.buttonZerar.setOnClickListener {
                binding.chronometer.base = SystemClock.elapsedRealtime()
                pause = 0
        }
    }
}