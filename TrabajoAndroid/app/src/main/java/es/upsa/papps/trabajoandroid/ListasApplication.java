package es.upsa.papps.trabajoandroid;

import android.app.Application;

import es.upsa.papps.trabajoandroid.repositorio.Repositorio;
import es.upsa.papps.trabajoandroid.repositorio.Repository;


public class ListasApplication extends Application
{

    private Repository repository;

    @Override
    public void onCreate() {
        super.onCreate();
        this.repository = new Repositorio();
    }

    public Repository getRepository()
    {
        return repository;
    }
}
