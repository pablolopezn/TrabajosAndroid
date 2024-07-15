package es.upsa.papps.trabajoandroid.actividades;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import es.upsa.papps.trabajoandroid.R;
import es.upsa.papps.trabajoandroid.databinding.ActivityArtistaBinding;
import es.upsa.papps.trabajoandroid.modelo.Artista;

public class ArtistaActivity extends AppCompatActivity
{

    private ActivityArtistaBinding artistaBinding;
    private ArtistaViewModel artistaViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_artistas);
        this.artistaBinding = ActivityArtistaBinding.inflate( getLayoutInflater() );
        setContentView( artistaBinding.getRoot() );

        /*crea el objeto ViewModel*/
        this.artistaViewModel = new ViewModelProvider(this).get( ArtistaViewModel.class );

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        Artista artista = artistaViewModel.findArtistaById(id);

        artistaBinding.tv.setText( artista.getNombre() );

    }
}