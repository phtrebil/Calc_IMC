package me.dio.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setListeners()

    }

    private fun setListeners(){
        my_button?.setOnClickListener {
            CalcularIMC(weight.text.toString(), high.text.toString())
        }
    }

    private fun CalcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso !=null && altura!= null){
            val imc = peso / (altura * altura /10000)
            val builder = AlertDialog.Builder(this)
            builder.setTitle("IMC").toString()  
            builder.setMessage("Seu IMC é de $imc").toString()
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }

}