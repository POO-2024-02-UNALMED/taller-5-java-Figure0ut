package zooAnimales;

import java.util.Arrays;
import java.util.Objects;

public class Pez extends Animal {
    private static Pez[] listado = new Pez[100];
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String color, int aletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = color;
        this.cantidadAletas = aletas;
        totalAnimales++;
        agregarAListado(this);
    }

    public Pez() {
        totalAnimales++;
        agregarAListado(this);
    }

    private static void agregarAListado(Pez pez) {
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] == null) {
                listado[i] = pez;
                break;
            }
        }
    }

    public void setColorEscamas(String color) {
        this.colorEscamas = color;
    }

    public void setCantidadAletas(int aletas) {
        this.cantidadAletas = aletas;
    }

    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public int getCantidadAletas() {
        return this.cantidadAletas;
    }

    public static int cantidadPeces() {
        return (int) Arrays.stream(listado)
                           .filter(Objects::nonNull)
                           .count();
    }

    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }
}