package cursoandroid.kotlin.com.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gerarNovaFrase(view: View) {
        val frases = arrayListOf<String>(
            "Frase 1",
            "Frase 2",
            "Frase 3",
            "Frase 4",
            "Frase 5"
        )
        var texto = findViewById<TextView>(R.id.id_textView_Resultado)
        texto.setText(frases.random())
    }
}