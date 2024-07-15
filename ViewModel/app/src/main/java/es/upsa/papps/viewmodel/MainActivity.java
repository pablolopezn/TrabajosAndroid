package es.upsa.papps.viewmodel;

import android.app.Application;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import es.upsa.papps.viewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding viewBinding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.viewBinding = ActivityMainBinding.inflate( this.getLayoutInflater() );

        /*me da el ConstraintLayout*/
        setContentView( this.viewBinding.getRoot() );
        this.viewModel = new ViewModelProvider(this).get( MainViewModel.class );

        viewBinding.btIncrementar.setOnClickListener( (View v) ->
        {
            viewModel.incrementar();
            showContador();
        });

        /*muestra el contador cuando se arranque la app*/
        showContador();

        ViewModelApplication application = (ViewModelApplication) this.getApplication();
        Repositorio repositorio = application.getRepositorio();

    }

    private void showContador()
    {
        String contadorString = getResources().getString(R.string.contador, viewModel.getContador() );
        viewBinding.textView.setText( contadorString );
    }


    /*  !SUSTITUIMOS EL GUARDAR EL ESTADO POR EL VIEWMODEL*/
//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState)
//    {
//        super.onSaveInstanceState(outState);
//
//        /*(key, value)*/
//        outState.putInt( "contador", contador );
//    }



}