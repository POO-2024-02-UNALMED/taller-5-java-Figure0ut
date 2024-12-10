package zooAnimales;


public class Mamifero extends Animal {
    private static  Mamifero[] listado = new Mamifero[100];
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.pelaje = pelaje;
        this.patas = patas;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
        totalAnimales += 1;
    }
    public Mamifero(){totalAnimales += 1;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
    }

    public void setPelaje(boolean pelo){this.pelaje = pelo;}
    public void setPatas(int patas){this.patas = patas;}

    public boolean isPelaje(){return this.pelaje;}
    public int getPatas() {return this.patas;}

    public static int cantidadMamiferos(){
        int c = 0;
        for (Animal i: listado){
            if (i != null){
                c += 1;
            }
        }
        return c;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero tomas = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos += 1;
        return tomas;
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero javier = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones += 1;
        return javier;
    }

}