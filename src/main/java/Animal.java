package zooAnimales;

import gestion.Zona;

public class Animal {
    protected static int totalAnimales = 0;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal() {
        totalAnimales++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }

    public static String totalPorTipo() {
        return String.format(
            "Mamiferos: %d\n" +
            "Aves: %d\n" +
            "Reptiles: %d\n" +
            "Peces: %d\n" +
            "Anfibios: %d", 
            Mamifero.cantidadMamiferos(),
            Ave.cantidadAves(),
            Reptil.cantidadReptiles(),
            Pez.cantidadPeces(),
            Anfibio.cantidadAnfibios()
        );
    }

    @Override
    public String toString() {
        String baseInfo = String.format(
            "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s", 
            nombre, edad, habitat, genero
        );
        
        return (zona != null) 
            ? baseInfo + " la zona en la que me ubico es " + zona + ", en el " + zona.getZoo()
            : baseInfo;
    }

    public String movimiento() {
        return "desplazarse";
    }
}