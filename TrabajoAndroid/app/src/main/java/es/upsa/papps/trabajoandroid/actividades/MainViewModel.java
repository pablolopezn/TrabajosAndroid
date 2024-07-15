package es.upsa.papps.trabajoandroid.actividades;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.List;

import es.upsa.papps.trabajoandroid.ListasApplication;
import es.upsa.papps.trabajoandroid.modelo.Artista;
import es.upsa.papps.trabajoandroid.repositorio.Repository;

public class MainViewModel extends AndroidViewModel
{

    private Repository repository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        ListasApplication listasApplication = getApplication();

        /*  listasApplication le da el repositorio al MainViewModel
            MainViewModel tiene como atributo el reppositorio
        */
        repository = listasApplication.getRepository();
    }

    public List<Artista> findAllArtistas()
    {
        return repository.findAllArtistas();
    }

}
