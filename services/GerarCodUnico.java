<<<<<<< HEAD
import java.util.Random;
=======
package services;
>>>>>>> 798d278d79d336e4539d73e121d80e8d374c5435

public class GerarCodUnico {
    private Random gerador = new Random();

    public void gerarRandom() {
        for ( int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt());
        }
    }
}
