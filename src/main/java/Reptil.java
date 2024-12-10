package zooAnimales;

public class Reptil extends Animal {
    private static Reptil[] listado = new Reptil[100];
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String color, int largo){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorEscamas = color;
        this.largoCola = largo;
        totalAnimales += 1;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
    }
    public Reptil(){totalAnimales += 1;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
    }

    public void setColorEscamas(String color){this.colorEscamas = color;}
    public void setLargoCola(int largo){this.largoCola = largo;}

    public String getColorEscamas(){return this.colorEscamas;}
    public int getLargoCola(){return this.largoCola;}

    public static int cantidadReptiles(){
        int c = 0;
        for (Animal i: listado){
            if (i != null){
                c += 1;
            }
        }
        return c;
    }

    public String movimiento(){return "reptar";}

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        Reptil laura = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas += 1;
        return laura;
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        Reptil buddy = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes += 1;
        return buddy;
    }
}