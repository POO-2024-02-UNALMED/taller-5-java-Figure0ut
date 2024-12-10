package zooAnimales;

public class Pez extends Animal {
    private static Pez[] listado = new Pez[100];
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String color, int aletas){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorEscamas = color;
        this.cantidadAletas = aletas;
        totalAnimales += 1;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
    }
    public Pez(){totalAnimales += 1;
        for (int i = 0; i < listado.length; i++){
            if (listado[i] == null){
                listado[i] = this;
                break;
            }
        }
    }

    public void setColorEscamas(String color){this.colorEscamas = color;}
    public void setCantidadAletas(int aletas){this.cantidadAletas = aletas;}

    public String getColorEscamas(){return this.colorEscamas;}
    public int getCantidadAletas(){return this.cantidadAletas;}

    public static int cantidadPeces(){
        int c = 0;
        for (Animal i: listado){
            if (i != null){
                c += 1;
            }
        }
        return c;
    }

    public String movimiento(){return "nadar";}

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez bailarina = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones += 1;
        return bailarina;
    }
    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez carlos = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos += 1;
        return carlos;
    }
}