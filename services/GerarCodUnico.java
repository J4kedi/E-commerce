package services;

import java.util.HashSet;
import java.util.Random;

public class GerarCodUnico {
    private Random gerador = new Random();
    private int codigo;
    private HashSet<Integer> codigos = new HashSet<>();

    public int gerarCodRandom() {
        do {
            codigo = gerador.nextInt(1000000);
            codigos.add(codigo);
        } while (codigos.contains(codigo));
        
        System.out.println("--------------------------");
        System.out.println("Código gerado: " + codigo);
        System.out.println("--------------------------");

        return codigo;
    }
}
