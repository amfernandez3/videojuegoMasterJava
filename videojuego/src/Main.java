import com.cursojava.models.Enemigo;
import com.cursojava.models.Heroe;

public class Main {
    public static void main(String[] args) {
        //Flujo principal de la aplicación

        //Instancias
        Heroe heroe1 = new Heroe("Alejandro");
        Enemigo enemigo1 =  new Enemigo("Jun");
        Enemigo enemigo2 =  new Enemigo("Ronal");
        Enemigo enemigo3 =  new Enemigo("Ronaldo");
        Enemigo enemigo4 =  new Enemigo("Ronlan");
        Enemigo enemigo5 =  new Enemigo("Ronland");
        /**
         * Control del flujo de ejecución principal.
         */
        try{
            gestionBatallas(heroe1,enemigo1,enemigo2,enemigo3,enemigo4,enemigo5);
        }catch (Exception e){
            e.getMessage();
        }
    }

    /**
     * Método que gestiona las batallas de un personaje
     * @param heroe heroe que llevará a cabo la acción
     * @param enemigos enemigos contra los que actuará el heroe (param[0])
     */
    public static void gestionBatallas(Heroe heroe, Enemigo...enemigos){
        for(Enemigo enemigo : enemigos){
            heroe.realizarBatalla(enemigo);
        }
    }
}