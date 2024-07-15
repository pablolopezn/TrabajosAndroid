package es.upsa.papps.listas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import es.upsa.papps.listas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding viewBinding;

    private MainViewModel viewModel;
    private ContactosAdapter adapter = new ContactosAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate( this.getLayoutInflater() );
        setContentView(  viewBinding.getRoot()  );
        viewModel = new ViewModelProvider(this).get( MainViewModel.class );

        adapter.submitList( viewModel.findContactos() );
        adapter.setOnItemClickListener( contacto -> onContactoClick(contacto) );
        viewBinding.rvContactos.setAdapter( adapter );

    }

    public void onContactoClick(Contacto contacto)
    {
//        Snackbar.make(viewBinding.getRoot(), "Click " + contacto.getNombre(), Snackbar.LENGTH_LONG)
//                .show();
        Intent intent = new Intent(this, ContactoActivity.class);
        intent.putExtra("id", contacto.getId());

        startActivity( intent );
    }
}