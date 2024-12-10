package zooAnimales;

import java.util.Arrays;
import java.util.Objects;

public class Ave extends Animal {
    private static Ave[] listado = new Ave[100];
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String color) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = color;
        totalAnimales++;
        agregarAListado(this);
    }

    public Ave() {
        totalAnimales++;
        agregarAListado(this);
    }

    private static void agregarAListado(Ave ave) {
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] == null) {
                listado[i] = ave;
                break;
            }
        }
    }

    public void setColorPlumas(String color) {
        this.colorPlumas = color;
    }

    public String getColorPlumas() {
        return this.colorPlumas;
    }

    public static int cantidadAves() {
        return (int) Arrays.stream(listado)
                           .filter(Objects::nonNull)
                           .count();
    }

    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
}