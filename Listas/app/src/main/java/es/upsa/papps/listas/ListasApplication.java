package es.upsa.papps.listas;

import android.app.Application;

public class ListasApplication extends Application
{
    private Repository repository;

    @Override
    public void onCreate()
    {
        super.onCreate();
        this.repository = new ContactosRepository();
    }


    public Repository getRepository() {
        return repository;
    }
}
