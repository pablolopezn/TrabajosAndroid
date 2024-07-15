package es.upsa.papps.viewmodel;


import android.app.Application;

/*  nombre de app + Application
    objeto que persistetodo el ciclo de vida de la app, hasta que se destruye
    !solo tenemos UNA
*/
public class ViewModelApplication extends Application
{

    private Repositorio repositorio;


    @Override
    public void onCreate()
    {
        super.onCreate();
        this.repositorio = new Repositorio();
    }

    public Repositorio getRepositorio()
    {
        return repositorio;
    }
}
