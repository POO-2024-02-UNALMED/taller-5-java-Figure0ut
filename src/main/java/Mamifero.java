package zooAnimales;

import java.util.Arrays;
import java.util.Objects;

public class Mamifero extends Animal {
    private static Mamifero[] listado = new Mamifero[100];
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        totalAnimales++;
        agregarAListado(this);
    }

    public Mamifero() {
        totalAnimales++;
        agregarAListado(this);
    }

    private static void agregarAListado(Mamifero mamifero) {
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] == null) {
                listado[i] = mamifero;
                break;
            }
        }
    }

    public void setPelaje(boolean pelo) {
        this.pelaje = pelo;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isPelaje() {
        return this.pelaje;
    }

    public int getPatas() {
        return this.patas;
    }

    public static int cantidadMamiferos() {
        return (int) Arrays.stream(listado)
                           .filter(Objects::nonNull)
                           .count();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
}