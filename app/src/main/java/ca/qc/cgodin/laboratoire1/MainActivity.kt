package ca.qc.cgodin.laboratoire1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.graphics.Color
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setListeners()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //pour couleurs
//    private fun makeColored(view: View) {
//        when (view.id) {
//            // textViews using Color class colors for the background
//            R.id.tvCGodin -> view.setBackgroundColor(Color.DKGRAY)
//            R.id.tvName -> view.setBackgroundColor(Color.GRAY)
//            R.id.tvCours1 -> view.setBackgroundColor(Color.BLUE)
//            R.id.tvCours2 -> view.setBackgroundColor(Color.MAGENTA)
//            R.id.tvCours3 -> view.setBackgroundColor(Color.BLUE)
//            else -> view.setBackgroundColor(Color.LTGRAY)
//        }
//    }

    //pour images
    private fun makeColored(view: View) {
        when (view.id) {
            // textViews using drawable images for the background
            R.id.tvCGodin ->
                view.setBackgroundResource(R.drawable.damascuscentre)
            R.id.tvName ->
                view.setBackgroundResource(R.drawable.damascuscentre)
            R.id.tvCours1 ->
                view.setBackgroundResource(R.drawable.damascuscentre)
            R.id.tvCours2 ->
                view.setBackgroundResource(R.drawable.damascuscentre)
            R.id.tvCours3 ->
                view.setBackgroundResource(R.drawable.damascuscentre)
            else ->
                view.setBackgroundResource(R.drawable.ic_launcher_background)
        }
    }

    private fun setListeners() {
        val tvCGodin = findViewById<TextView>(R.id.tvCGodin)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvCours1 = findViewById<TextView>(R.id.tvCours1)
        val tvCours2 = findViewById<TextView>(R.id.tvCours2)
        val tvCours3 = findViewById<TextView>(R.id.tvCours3)
        //val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val rootConstraintLayout = findViewById<View>(R.id.main)

        val clickableViews: List<View> =
            listOf(
                tvCGodin, tvName, tvCours1,
                tvCours2, tvCours3, rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }
}