import java.util.Random;

public class GerarCodUnico {
    private Random gerador = new Random();

    public void gerarRandom() {
        for ( int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt());
        }
    }
}
