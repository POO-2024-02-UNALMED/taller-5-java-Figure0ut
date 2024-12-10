package zooAnimales;

import gestion.Zona;

public class Animal {
    protected static int totalAnimales = 0;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;
    public Animal (String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales += 1;
    }
    public Animal (){totalAnimales += 1;}

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setNombre(int edad){this.edad = edad;}
    public void setHabitat(String habitat){this.habitat = habitat;}
    public void setGenero(String genero){this.genero = genero;}
    public void setZona(Zona zona){this.zona = zona;}

    public String getNombre(){return this.nombre;}
    public int getEdad(){return this.edad;}
    public String getHabitat(){return this.habitat;}
    public String getGenero(){return this.genero;}

    public static String totalPorTipo(){
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
                "Aves: " + Ave.cantidadAves() + "\n" +
                "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
                "Peces: " + Pez.cantidadPeces() + "\n" +
                "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    @Override
    public String toString() {
        if (this.zona != null){
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + "la zona en la que me ubico es " + zona + ", en el " + zona.getZoo();
        }else{return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;}
    }
    public String movimiento(){return "desplazarse";}
}