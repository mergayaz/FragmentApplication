package kz.kuz.fragmentapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// MainActivity extends AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // super - отсылка на верхний класс (AppCompatActivity)
        super.onCreate(savedInstanceState) // извлекает метод onCreate из AppCompatActivity
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, MainFragment())
                    .commitNow()
        }
    }
}