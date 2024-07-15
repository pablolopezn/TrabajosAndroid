package es.upsa.papps.trabajoandroid.repositorio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upsa.papps.trabajoandroid.modelo.Artista;

public class Repositorio implements Repository {

    /*!2.- Lista de items*/
    Map<String, Artista> artistaMap = new HashMap<>();

    private List<Artista> artistas = List.of(
            new Artista("1", "Melendi", 1000345, 424693052),
            new Artista("2", "Pablo López", 648489, 5335573),
            new Artista("3", "Rosalía", 1969342, 22784529 ),
            new Artista("4", "U2", 7263977, 507429595 )
    );


    public Repositorio()
    {
        artistaMap.put( "1",  new Artista("1", "Melendi", 1000345, 424693052) );
        artistaMap.put( "2",  new Artista("2", "Pablo López", 648489, 5335573) );
        artistaMap.put( "3",  new Artista("3", "Rosalía", 1969342, 22784529) );
        artistaMap.put( "4",  new Artista("4", "U2", 7263977, 507429595) );
    }



    @Override
    public List<Artista> findAllArtistas() {
        return List.copyOf( artistaMap.values() ) ;
    }

    @Override
    public Artista findArtistaById(String id)
    {
        return artistaMap.get( id );
    }
}

