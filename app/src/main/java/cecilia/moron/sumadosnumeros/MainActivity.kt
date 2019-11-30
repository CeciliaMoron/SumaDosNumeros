package cecilia.moron.sumadosnumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etUno=findViewById<View>(R.id.etUno) as EditText
        var etDos=findViewById<View>(R.id.etUno) as EditText

        var btnCalcular=findViewById<View>(R.id.btnCalcular) as Button

        btnCalcular.setOnClickListener(View.OnClickListener {

            var resultado=etUno.text.toString().toInt()+etDos.text.toString().toInt()

            Toast.makeText(this, "EL RESULTADO DE LA SUMA ENTRE LOS DOS NUMEROS ES:  "+resultado,Toast.LENGTH_LONG).show()

            //Toast.makeText(this, "El resultado de la suma es:  "+ resultado.Toast.LENGTH_LONG).show()
        })
    }
}
