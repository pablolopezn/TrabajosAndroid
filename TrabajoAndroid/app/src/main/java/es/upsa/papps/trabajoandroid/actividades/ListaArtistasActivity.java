package es.upsa.papps.trabajoandroid.actividades;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import es.upsa.papps.trabajoandroid.adaptadores.ArtistasAdapter;
import es.upsa.papps.trabajoandroid.databinding.ActivityListaArtistasBinding;
import es.upsa.papps.trabajoandroid.modelo.Artista;

public class ListaArtistasActivity extends AppCompatActivity
{

    /*! 1.- LLAMAR A BINDING*/
    private ActivityListaArtistasBinding viewBinding;

    private MainViewModel viewModel;

    /*! 3.- Crear el adaptador*/
    private ArtistasAdapter artistasAdapter = new ArtistasAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        viewBinding = ActivityListaArtistasBinding.inflate(this.getLayoutInflater());

        /*setContentView no volvemos a pasarle el .xml entero*/
        setContentView( viewBinding.getRoot() );

        this.viewModel = new ViewModelProvider( this ).get( MainViewModel.class );

        /*vicular adaptador al RecyclerView*/
        viewBinding.rvArtistas.setAdapter( artistasAdapter );

        /*darle la lista de Artistas*/
        artistasAdapter.setArtistas( viewModel.findAllArtistas() );
        artistasAdapter.setOnItemClickListener( (Artista artista) ->
        {
            onArtistaClick( artista );
        });

    }

    void onArtistaClick( Artista artista )
    {


        /*
        Un intent es una descripción abstracta de una operación que se va a realizar. Se puede utilizar para startActivity lanzar un Activity, broadcastIntent para enviarlo a cualquier componente interesado BroadcastReceiver y Context.startService /o Context.bindService para comunicarse con un fondo android.app.Service.
        Un Intent proporciona una función para realizar el enlace en tiempo de ejecución tardío entre el código en diferentes aplicaciones. Su uso más significativo es en el lanzamiento de actividades, donde se puede pensar como el pegamento entre actividades. Es básicamente una estructura de datos pasiva que contiene una descripción abstracta de una acción a realizar.
        */
        Intent intent = new Intent(this, ArtistaActivity.class);
        intent.putExtra( "id", artista.getId() );

        startActivity( intent );
    }

}

