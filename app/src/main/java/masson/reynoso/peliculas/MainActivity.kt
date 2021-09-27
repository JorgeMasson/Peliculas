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

        val adaptador: AdaptadorPeliculas = AdaptadorPeliculas(this, peliculas)

        val listView: ListView = findViewById(R.id.listview)

        listView.adapter = adaptador
    }

    fun AgregarPeliculas() {
        peliculas.add(Pelicula(1, "The Dark Knight", "Cuando el Joker emerge causando caos y violencia en Gotham, el caballero de la noches deberá aceptar una de las pruebas psicológicas y físicas más difíciles para poder luchar con las injusticias del enemigo.", R.drawable.darkknight))
        peliculas.add(Pelicula(2, "John Wick", "Un ex asesino sale del retiro para buscar a los pandilleros que mataron a su perro y tomaron todas su posesiones.", R.drawable.johnwick))
        peliculas.add(Pelicula(3, "Winter Soldier", "Mientras Steve Rogers se esfuerza por asumir su papel en el mundo moderno, se une a un compañero Avenger y al agente de Black Widow, para luchar contra una nueva amenaza de la historia, un asesino conocido como el Soldado de Invierno.", R.drawable.wintersoldier))
        peliculas.add(Pelicula(4, "The Good Will Hunting", "Will Hunting, un conserje del MIT, tiene un don para las matemáticas, pero necesitará la ayuda de un psicólogo para encontrar orientación en su vida.", R.drawable.goodwillhunting))
        peliculas.add(Pelicula (5, "Tenet", "Aun se desconoce la trama de la película pero el proyecto se describe como un épico viaje alrededor del espionaje internacional.", R.drawable.tenet))
        peliculas.add(Pelicula(6, "Origen", "A un ladrón que roba secretos corporativos a través de la tecnología de entrar en el subconsciente, se le da la tarea de implantar una idea en la mente del jefe de una gran empresa.", R.drawable.inception))
        peliculas.add(Pelicula(7, "Interstellar", "Un grupo de exploradores prueban los saltos a través de agujeros de gusano en búsqueda de la sobrevivencia de la humanidad.", R.drawable.interstellar))
        peliculas.add(Pelicula(8, "El Prestigio", "Tras un trágico accidente, dos magos se envuelven en la competencia para crear la más espectacular ilusión, aún si ello significa sacrificar todo lo que tienen.", R.drawable.theprestige))

    }

}