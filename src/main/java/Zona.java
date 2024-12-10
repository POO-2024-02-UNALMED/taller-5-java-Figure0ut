package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
        zoo.agregarZonas(this);
    }

    public Zona() {
        this.animales = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Zoologico getZoo() {
        return this.zoo;
    }

    public List<Animal> getAnimales() {
        return new ArrayList<>(animales); 
    }

    public void agregarAnimales(Animal animal) {
        if (animal != null) {
            animales.add(animal);
            animal.setZona(this);
        }
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public Zona get(int a) {
        return this; 
    }

    @Override
    public String toString() {
        return nombre;
    }
}