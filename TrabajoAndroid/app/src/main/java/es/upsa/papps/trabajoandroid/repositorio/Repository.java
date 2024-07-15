package es.upsa.papps.trabajoandroid.repositorio;

import java.util.List;

import es.upsa.papps.trabajoandroid.modelo.Artista;

public interface Repository
{
    List<Artista> findAllArtistas();

    Artista findArtistaById(String id);
}
