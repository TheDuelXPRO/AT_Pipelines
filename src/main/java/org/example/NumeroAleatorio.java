package org.example;
import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int numero = random.nextInt(100);
        System.out.println("Número aleatório: " + numero);
    }
}
