package zooAnimales;

public class Anfibio extends Animal {
    private static Anfibio[] listado = new Anfibio[100];
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean veneno){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPiel = color;
        this.venenoso = veneno;
        totalAnimales += 1;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
    }
    public Anfibio(){totalAnimales += 1;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
    }

    public void setColorPiel(String color){this.colorPiel = color;}
    public void setVenenoso(boolean veneno){this.venenoso = veneno;}


    public String getColorPiel(){return this.colorPiel;}
    public boolean isVenenoso(){return this.venenoso;}

    public static int cantidadAnfibios(){
        int c = 0;
        for (Animal i: listado){
            if (i != null){
                c += 1;
            }
        }
        return c;
    }

    public String movimiento(){return "saltar";}

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio nico = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas += 1;
        return nico;
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio lucas = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        salamandras += 1;
        return lucas;
    }
}