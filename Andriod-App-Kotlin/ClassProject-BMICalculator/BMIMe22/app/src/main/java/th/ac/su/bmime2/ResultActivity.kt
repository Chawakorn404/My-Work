package th.ac.su.bmime2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val txvR = findViewById<TextView>(R.id.txvR)
        val txvR2 = findViewById<TextView>(R.id.txvR2)
        val btnS = findViewById<Button>(R.id.btnS)
        val btnB = findViewById<Button>(R.id.btnB)

        val height = intent.getStringExtra("hig")
        val weight = intent.getStringExtra("weg")
        val BMI = intent.getDoubleExtra("BMI",0.0)
        val BMIt = intent.getStringExtra("BMIt")

        txvR.text = BMI.toString()
        txvR2.text = BMIt + "\n( height: " + height + " weight: " + weight + " )"

        btnS.setOnClickListener {
            val vale = "My BMI is " + BMI.toString() + " " + BMIt

            var intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, vale)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "share to"))
        }

        btnB.setOnClickListener {
            finish()
        }
    }
}