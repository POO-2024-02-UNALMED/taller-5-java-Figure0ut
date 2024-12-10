package gestion;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private Animal[] animales = new Animal[100];
    public Zona (String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
        zoo.agregarZonas(this);
    }
    public Zona (){}

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setZoo(Zoologico zoo){this.zoo = zoo;}

    public String getNombre(){return this.nombre;}
    public Zoologico getZoo(){return this.zoo;}
    public Animal[] getAnimales(){return animales;}

    public void agregarAnimales(Animal animal){
        for (int i = 0; i < animales.length; i++){
            if (animales[i] == null){
                animales[i]=animal;
                animales[i].setZona(this);
                break;
            }
        }
    }
    public int cantidadAnimales(){
        int c = 0;
        for (Animal i: animales){
            if (i != null){
                c += 1;
            }
        }
        return c;
    }
    public Zona get(int a){
        return this;
    }

    public String toString(){return nombre;}
}