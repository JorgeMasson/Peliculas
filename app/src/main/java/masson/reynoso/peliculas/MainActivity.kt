package masson.reynoso.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AgregarPeliculas()
    }

    fun AgregarPeliculas() {
        peliculas.add(Pelicula (1, "Tenet", "Aun se desconoce la trama de la película pero el proyecto se describe como un épico viaje alrededor del espionaje internacional.", R.drawable.tenet))
        peliculas.add(Pelicula(2, "Origen", "A un ladrón que roba secretos corporativos a través de la tecnología de entrar en el subconsciente, se le da la tarea de implantar una idea en la mente del jefe de una gran empresa.", R.drawable.inception))
        peliculas.add(Pelicula(3, "Interstellar", "Un grupo de exploradores prueban los saltos a través de agujeros de gusano en búsqueda de la sobrevivencia de la humanidad.", R.drawable.interstellar))
        peliculas.add(Pelicula(4, "El Prestigio", "Tras un trágico accidente, dos magos se envuelven en la competencia para crear la más espectacular ilusión, aún si ello significa sacrificar todo lo que tienen.", R.drawable.theprestige))

    }

}