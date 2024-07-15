package es.upsa.papps.trabajoandroid.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import es.upsa.papps.trabajoandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(this.getLayoutInflater());

        /*setContentView no volvemos a pasarle el .xml entero*/
        setContentView( viewBinding.getRoot() );

        viewBinding.myArtistsTv.setOnClickListener( (View v) ->
        {
            Intent intent = new Intent(MainActivity.this, ListaArtistasActivity.class);
            startActivity(intent);
        });
    }
}