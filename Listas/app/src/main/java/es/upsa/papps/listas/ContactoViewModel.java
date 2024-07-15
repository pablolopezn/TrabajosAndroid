package es.upsa.papps.listas;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ContactoViewModel extends AndroidViewModel
{
    private Repository repository;

    public ContactoViewModel(@NonNull Application application)
    {
        super(application);
        ListasApplication app = getApplication();
        this.repository = app.getRepository();
    }

    public Contacto findContactoById(String id)
    {
        return repository.findContactoById(id);
    }

}
