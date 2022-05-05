package pe.edu.ilp.geopreguntas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        des()
        factoria()
        triangulo()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVerdad=findViewById<android.view.View>(R.id.btnVerdadero)
        btnVerdad.setOnClickListener{
            Toast.makeText(this,"La respuesta es incorrecta",Toast.LENGTH_SHORT).show()
        }

        val btnIncorrecto=findViewById<android.view.View>(R.id.btnFalso)
        btnIncorrecto.setOnClickListener{
            Toast.makeText(this,"La respuesta es Correcta",Toast.LENGTH_SHORT).show()
        }
    }
    fun des(){
        for (k in 50 downTo  1 step 2)
            println("Desiende de  $k")
    }

    fun factoria(){
        val fator=12
        var des=1
        for (i in 1..fator){
            des*=i
        }
        println("La factorizacion de: $des")
    }
    fun triangulo(){
        var ba=12
        var al =2

        var resul=ba*al/2
        println("El area es de : $resul")
    }
}