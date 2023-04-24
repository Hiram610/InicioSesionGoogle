package garcia.hiram.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle = intent.extras
        if(bundle != null){
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")

            val txtNombre = findViewById<TextView>(R.id.txtNombre)
            val txtEmail = findViewById<TextView>(R.id.txtEmail)

            txtNombre.setText(nombre)
            txtEmail.setText(correo)
        }

        val cerrarSesionBtn = findViewById<Button>(R.id.cerrarSesionBtn)

        cerrarSesionBtn.setOnClickListener{
            finish()
        }
    }
}