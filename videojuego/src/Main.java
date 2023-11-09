import com.cursojava.models.Enemigo;
import com.cursojava.models.Heroe;
import com.cursojava.models.Personaje;

public class Main {
    public static void main(String[] args) {
        //Flujo principal de la aplicación

        //Instancias
        Heroe heroe1 = new Heroe("Alejandro");
        Enemigo enemigo1 =  new Enemigo("Jun");
        Enemigo enemigo2 =  new Enemigo("Ronal");


        heroe1.realizarBatalla(enemigo1);
        heroe1.realizarBatalla(enemigo2);
    }
}