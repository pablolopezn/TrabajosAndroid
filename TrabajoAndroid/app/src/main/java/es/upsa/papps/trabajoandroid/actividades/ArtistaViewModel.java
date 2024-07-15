package es.upsa.papps.trabajoandroid.actividades;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import es.upsa.papps.trabajoandroid.ListasApplication;
import es.upsa.papps.trabajoandroid.modelo.Artista;
import es.upsa.papps.trabajoandroid.repositorio.Repository;

public class ArtistaViewModel extends AndroidViewModel
{
    private Repository repository;

    public ArtistaViewModel(@NonNull Application application)
    {
        super(application);
        ListasApplication app = getApplication();
        this.repository = app.getRepository();
    }


    public Artista findArtistaById(String id)
    {
        return repository.findArtistaById( id );
    }

}