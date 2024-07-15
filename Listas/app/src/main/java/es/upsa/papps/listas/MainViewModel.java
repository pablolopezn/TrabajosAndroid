package es.upsa.papps.listas;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.List;

public class MainViewModel extends AndroidViewModel
{
    private Repository repository;
    public MainViewModel(@NonNull Application application)
    {
        super(application);
        ListasApplication app = getApplication();
        this.repository = app.getRepository();
    }


    public List<Contacto> findContactos()
    {
        return repository.findAllContactos();
    }
}
