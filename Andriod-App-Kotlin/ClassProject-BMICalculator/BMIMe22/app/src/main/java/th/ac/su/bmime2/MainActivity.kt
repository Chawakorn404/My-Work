package th.ac.su.bmime2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hight = findViewById<EditText>(R.id.hight)
        val weight = findViewById<EditText>(R.id.weight)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {

            val hig = hight.text.toString().toDouble()
            val weg = weight.text.toString().toDouble()

            var height = hig/100.0
            var bmi = weg/(height*height)
            val bmis:Double = String.format("%.2f", bmi).toDouble()
            var BMIt = ""

            if (bmi <= 18.50){
                BMIt = "(Underweight)"
            }
            if (bmi > 18.50 && bmi <= 25.00){
                BMIt = "(Healthy)"
            }
            if (bmi > 25.00 && bmi <= 30.00){
                BMIt = "(Overweight)"
            }
            else if (bmi >= 30.00){
                BMIt = "(Obese)"
            }

            var intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("hig",height.toString())
            intent.putExtra("weg",weg.toString())
            intent.putExtra("BMI",bmis)
            intent.putExtra("BMIt",BMIt)

            startActivity(intent)

        }

    }
}