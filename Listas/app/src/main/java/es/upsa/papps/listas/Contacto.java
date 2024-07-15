package es.upsa.papps.listas;

public class Contacto
{
    private String id;
    private String nombre;
    private String email;
    private String telefono;

    public Contacto(String id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacto contacto = (Contacto) o;

        if (!id.equals(contacto.id)) return false;
        if (!nombre.equals(contacto.nombre)) return false;
        if (!email.equals(contacto.email)) return false;
        return telefono.equals(contacto.telefono);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
