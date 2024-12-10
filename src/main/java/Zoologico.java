package gestion;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private Zona[] zonas = new Zona[100];
    public Zoologico (String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public Zoologico (){}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setUbicacion(String ubicacion){this.ubicacion = ubicacion;}
    public void agregarZonas(Zona zona){
        for (int i = 0; i < zonas.length; i++){
            if (zonas[i] == null){
                zonas[i] = zona;
                zona.setZoo(this);
                break;
            }
        }
    }

    public String getNombre(){return this.nombre;}
    public String getUbicacion(){return this.ubicacion;}
    public Zona getZona(){
        return zonas[0];
    }

    public int cantidadTotalAnimales() {
        int total = 0;
        for (Zona zona : zonas) {
            if (zona != null) {
                total += zona.cantidadAnimales();
            }
        }
        return total;
    }

    public String toString(){return this.nombre;}
}