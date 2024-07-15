package es.upsa.papps.listas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactosRepository implements Repository
{
    Map<String, Contacto> contactos = new HashMap<>();

    public ContactosRepository()
    {
        contactos.put("1", new Contacto("1", "Luis", "luis@gmail.com", "666321456"));
        contactos.put("2", new Contacto("2", "Marta", "marta@gmail.com", "665987654") );
        contactos.put("3", new Contacto("3", "María", "maria@gmail.com", "664147258"));
        contactos.put("4", new Contacto("4", "Carlos", "carlos@gmail.com", "660852963"));
        contactos.put("5", new Contacto("5", "Miguel", "miguel@gmail.com", "664753421"));
        contactos.put("6", new Contacto("6", "Carla", "carla@gmail.com", "669357689"));
        contactos.put("7", new Contacto("7", "Lucia", "lucia@gmail.com", "687879546"));
        contactos.put("8", new Contacto("8", "Oscar", "oscar@gmail.com", "624825417"));
        contactos.put("9", new Contacto("9",  "Alberto", "alberto@gmail.com", "620148259"));
        contactos.put("10", new Contacto("10", "Ana", "aba@gmail.com", "620863214"));
    }

    @Override
    public List<Contacto> findAllContactos()
    {
        return  List.copyOf( contactos.values() );
    }

    @Override
    public Contacto findContactoById(String id)
    {
        return contactos.get( id );
    }
}
