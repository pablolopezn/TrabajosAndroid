package es.upsa.papps.trabajoandroid.modelo;


import lombok.Data;

@Data
public class Artista
{
    //ATRIBUTOS
    private String id;
    private String nombre;
    private int num_seguidores;
    private int reproducciones_totales;

    public Artista()
    {
    }

    public Artista(String id, String nombre, int num_seguidores, int reproducciones_totales)
    {
        this.id = id;
        this.nombre = nombre;
        this.num_seguidores = num_seguidores;
        this.reproducciones_totales = reproducciones_totales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_seguidores() {
        return num_seguidores;
    }

    public void setNum_seguidores(int num_seguidores) {
        this.num_seguidores = num_seguidores;
    }

    public int getReproducciones_totales() {
        return reproducciones_totales;
    }

    public void setReproducciones_totales(int reproducciones_totales) {
        this.reproducciones_totales = reproducciones_totales;
    }
}
