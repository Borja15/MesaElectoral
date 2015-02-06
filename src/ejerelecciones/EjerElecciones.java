
package ejerelecciones;

/**
 *
 * @author Borja Andrades
 */
public class EjerElecciones {

    
    public static void main(String[] args) {
        //Clase principal con una mesa electoral
        MesaElectoral elecciones = new MesaElectoral("Rajoy","Barcenas","Mangar",200);
        //Asigno 80 votos a un partido(Mesa cerrada,no es valido)
        elecciones.setVotos(80,0);
        //Abro la mesa
        elecciones.setAbierta(true);
        //Vuelvo a asignar los votos
        elecciones.setVotos(80,1);
        //Mostrar los votos
        System.out.println(String.valueOf(elecciones.getVotos(1)));
        System.out.println(String.valueOf("La participacion fue:"+elecciones.participacion()+"%"));
        
        //Segunda parte,más rapido
        MesaElectoral elecciones2 = new MesaElectoral(500);
        elecciones2.setVotos(100,0);
        elecciones2.setVotos(200,1);
        elecciones2.setVotos(30,2);
        elecciones2.setVotos(0);
        elecciones2.setVotos(1);
        elecciones2.setVotos(2);
        System.out.println(String.valueOf(elecciones2.getVotos(0)));
        System.out.println(String.valueOf(elecciones2.getVotos(1)));
        System.out.println(String.valueOf(elecciones2.getVotos(2)));
        System.out.println(String.valueOf(elecciones2.participacion()+"%"));
        
    }
    
}
