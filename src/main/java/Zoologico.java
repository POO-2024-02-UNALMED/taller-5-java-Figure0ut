package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public Zoologico() {
        this.zonas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona) {
        if (zona != null) {
            zonas.add(zona);
            zona.setZoo(this);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public Zona getZona(int index) {
        if (index >= 0 && index < zonas.size()) {
            return zonas.get(index);
        }
        return null;
    }

    public int cantidadTotalAnimales() {
        int total = 0;
        for (Zona zona : zonas) {
            total += zona.cantidadAnimales();
        }
        return total;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}