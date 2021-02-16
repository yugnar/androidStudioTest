package edu.itesm.rro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var tiros = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("salu2pelu2", "demostracionDeLog salu2")
        //test_kotlin()

        tira_dado()
    }

    fun tira_dado(){
        roll_dice.setOnClickListener {
            val rand = Random.nextInt(1, 6)
            mensaje.text = "$rand tiro # ${tiros++}"
        }
    }

    fun test_kotlin(){
        // comentario
        /*
        Bloque de comentario
         */
        val edad = 45
        val peso : Double = 67.7
        val altura : Float = 1.58f
        Log.i("edu.itesm.rro", imc(peso, altura))
    }

    fun imc(peso: Double, altura: Float): String{
        val imc_cal = peso / altura * altura
        val imc_str = if(imc_cal > 18.5 && imc_cal < 25){
            "$imc_cal normal"
        }else if(imc_cal > 25 && imc_cal < 30){
            "$imc_cal sobrepeso"
        }
        else{
            "$imc_cal obesidad"
        }
        return imc_str
    }
}