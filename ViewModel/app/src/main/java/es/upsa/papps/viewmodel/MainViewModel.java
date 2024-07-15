package es.upsa.papps.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;


/*  public class MainViewModel extends AndroidViewModel

    si extiende de AndroidViewModel podra acceder tambien a Application
*/
public class MainViewModel extends AndroidViewModel
{

    private int contador = 0;

    /*pasamos la application al constructor*/
    public MainViewModel(@NonNull Application application)
    {
        super(application);
        ViewModelApplication app = getApplication();
        contador = app.getRepositorio().getValorInicial();
    }

    public int getContador()
    {
        return contador;
    }

     public void incrementar()
    {
        ++contador;
    }



}
