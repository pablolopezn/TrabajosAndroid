package es.upsa.papps.listas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import es.upsa.papps.listas.databinding.ActivityContactoBinding;

public class ContactoActivity extends AppCompatActivity
{
    private ActivityContactoBinding viewBinding;
    private ContactoViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityContactoBinding.inflate( getLayoutInflater() );
        setContentView( viewBinding.getRoot() );

        this.viewModel = new ViewModelProvider(this).get( ContactoViewModel.class );

        String id = getIntent().getStringExtra("id");

        Contacto contacto = viewModel.findContactoById( id );
        viewBinding.tv.setText( contacto.getNombre() );
    }
}