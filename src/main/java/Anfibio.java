package zooAnimales;

import java.util.Arrays;
import java.util.Objects;

public class Anfibio extends Animal {
    private static Anfibio[] listado = new Anfibio[100];
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean veneno){
        super(nombre, edad, habitat, genero);
        this.colorPiel = color;
        this.venenoso = veneno;
        totalAnimales++;
        agregarAListado(this);
    }

    public Anfibio(){
        totalAnimales++;
        agregarAListado(this);
    }

    private static void agregarAListado(Anfibio anfibio) {
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = anfibio;
                break;
            }
        }
    }

    public void setColorPiel(String color){
        this.colorPiel = color;
    }

    public void setVenenoso(boolean veneno){
        this.venenoso = veneno;
    }

    public String getColorPiel(){
        return this.colorPiel;
    }

    public boolean isVenenoso(){
        return this.venenoso;
    }

    public static int cantidadAnfibios(){
        return (int) Arrays.stream(listado)
                           .filter(Objects::nonNull)
                           .count();
    }

    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
}