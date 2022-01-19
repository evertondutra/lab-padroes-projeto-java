package onedigitalinnovation.gof;

/**
 * Singleton "apressado".
 *
 * @author everton
 */

public class SingletonEager {

    private static SingletonEager instancia;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }


}
