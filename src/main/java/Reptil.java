package zooAnimales;

import java.util.Arrays;
import java.util.Objects;

public class Reptil extends Animal {
    private static Reptil[] listado = new Reptil[100];
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String color, int largo) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = color;
        this.largoCola = largo;
        totalAnimales++;
        agregarAListado(this);
    }

    public Reptil() {
        totalAnimales++;
        agregarAListado(this);
    }

    private static void agregarAListado(Reptil reptil) {
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] == null) {
                listado[i] = reptil;
                break;
            }
        }
    }

    public void setColorEscamas(String color) {
        this.colorEscamas = color;
    }

    public void setLargoCola(int largo) {
        this.largoCola = largo;
    }

    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public int getLargoCola() {
        return this.largoCola;
    }

    public static int cantidadReptiles() {
        return (int) Arrays.stream(listado)
                           .filter(Objects::nonNull)
                           .count();
    }

    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }
}