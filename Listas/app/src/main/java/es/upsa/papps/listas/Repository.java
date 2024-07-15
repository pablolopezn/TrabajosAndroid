package es.upsa.papps.listas;

import java.util.List;

public interface Repository
{
    List<Contacto> findAllContactos();
    Contacto findContactoById(String id);
}
