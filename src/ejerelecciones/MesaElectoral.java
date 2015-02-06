
package ejerelecciones;

public class MesaElectoral {
    /**
     * Clase MesaElectoral que funcionara como Mesa electoral en proceso de
     * unas elecciones
     */
    private String presidente;
    private String secretario;
    private String vocal;
    private int censo;
    private boolean abierta;
    private int votosPartido0;
    private int votosPartido1;
    private int votosPartido2;
    
    /**
     * Variables constantes referenciadas a los partidos
     */
    public final static int BB = 0;
    public final static int PSAO = 1;
    public final static int UI = 2;
    
    /**
     * Método constructor con 4 parametros,iniciara la mesa(Cerrada inicialmente)
     * @param presidente variable presidente,que indica el presidente(tipo String)
     * @param secretario variable secretario,que indica el secretario(tipo String)
     * @param vocal variable vocal,que indica el vocal(tipo String)
     * @param censo variable censo,que indica el censo(tipo int)
     */
    public MesaElectoral(String presidente,String secretario,String vocal,int censo){
        this.presidente = presidente;
        this.secretario = secretario;
        this.vocal = vocal;
        this.censo = censo;
        this.abierta = false;
    }
    
    /**
     * Método constructor con 1 paramentro,iniciara rapidamente la mesa(Abierta inicialmente)
     * @param censo variable censo,que indica el censo(tipo int)
     */
    public MesaElectoral(int censo){
        this.censo = censo;
        this.abierta = true;
    }
    
    /**
     * Método boolean que establece el estado de la mesa:Abierta o cerrada
     * @param estado (True o false) según queramos abrir o cerrar la mesa
     */
    public void setAbierta(boolean estado){
        if(estado){
            this.abierta = true;
        }else{
            this.abierta = false;
        }
    }
    
    /**
     * Método con dos parametros
     * Introducir el número de votos y el partido,si la mesa se encuentra abierta
     * se asignaran los votos,de lo contrario,se asignaran 0 votos a los partidos.
     * @param num número de votos al partido (tipo int)
     * @param partido partido al que votaremos (tipo int)
     */
    public void setVotos(int num,int partido){
        if(abierta){
            switch(partido){
                case BB: votosPartido0 = num;
                case PSAO: votosPartido1 = num;
                case UI: votosPartido2 = num;
            }
        }else{
            votosPartido0 = 0;
            votosPartido1 = 0;
            votosPartido2 = 0;
        }               
    }

    /**
     * Método con 1 parametro
     * Introducir el partido a votar y se incrementaran los votos a uno
     * @param partido partido al que votaremos (tipo int)
     */
    public void setVotos(int partido){
        if(abierta){
            switch(partido){
                case BB: votosPartido0++;
                        break;
                case PSAO: votosPartido1++;
                        break;
                case UI: votosPartido2++;
                        break;
            }
        }
    }
    
    /**
     * Método con 1 parametro
     * Introducir el partido a votar para obtener los votos obtenidos
     * @param partido partido del que queramos obtener los votos(tipo int)
     * @return partido debere ser un numero de 0 a 2 (referente a los partidos)
     */
    public int getVotos(int partido){
        switch(partido){
            case BB: 
                return votosPartido0;
            case PSAO: 
                return votosPartido1;
            case UI:
                return votosPartido2;
        }
        return 0;
    }
    
    /**
     * Método que calculara el porcentaje (sin %) de votantes que participaron
     * @return Total del porcentaje de votantes que participaron
     */
    public int participacion(){
        int participacion = votosPartido0 + votosPartido1 + votosPartido2;
        int resultado = (participacion *100)/censo;
        return resultado;
    }
}
