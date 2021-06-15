package ambrosio.armando.asignacion04_calculadoraimc_ambrosio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    val weight: EditText= findViewById(R.id.weight) as EditText
    val height: EditText= findViewById(R.id.height) as EditText
    val imc=findViewById(R.id.imc) as TextView
    val range= findViewById(R.id.range) as TextView
    val calculate = findViewById(R.id.calculate) as Button

    var res:Double =0.0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate.setOnClickListener(){
            res=Math.sqrt(height.toString().toDouble())
            res= (weight.toString().toDouble()/res)
            if (res <= 18.50){
                imc.setText("Bajo peso")
                range.setBackgroundResource(R.color.colorRed)
            }else if(res>18.50&&res<=24.9){
                imc.setText("Normal")
                range.setBackgroundResource(R.color.colorGreenish)
            }else if(res>24.9 && res<=29.9){
                imc.setText("Sobrepeso")
                range.setBackgroundResource(R.color.colorYellow)
            }else if(res>29.9 && res<=34.9){
                imc.setText("Obesidad grado 1")
                range.setBackgroundResource(R.color.colorOrange)
            }else if(res>34.9 && res<=39.9){
                imc.setText("Obesidad grado 2")
                range.setBackgroundResource(R.color.colorBrown)
            }else if(res>=40){
                imc.setText("Obesidad grado 3")
                range.setBackgroundResource(R.color.colorRed)
            }

        }
    }
}