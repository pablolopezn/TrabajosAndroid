package es.upsa.papps.trabajoandroid.adaptadores;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.upsa.papps.trabajoandroid.R;
import es.upsa.papps.trabajoandroid.databinding.ArtistaItemBinding;
import es.upsa.papps.trabajoandroid.modelo.Artista;
import lombok.Setter;

public class ArtistasAdapter extends RecyclerView.Adapter<ArtistasAdapter.ArtistaViewHolder>
{
    public interface OnItemClickListener
    {
        void onClick( Artista artista );
    }

    private List<Artista> artistas;
    @Setter
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setArtistas(List<Artista> artistas)
    {
        this.artistas = artistas;
        notifyDataSetChanged();
    }

    /*Devuelve el número total de elementos del conjunto de datos que contiene el adaptador.*/
    @Override
    public int getItemCount() {
        return artistas.size();
    }



    /*crear un ArtistaViewHolder*/
    @NonNull
    @Override
    public ArtistaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ArtistaItemBinding itemViewBinding = ArtistaItemBinding.inflate( layoutInflater, parent, false );
        return new ArtistaViewHolder(itemViewBinding);
    }


    /*Bindear un item a un ViewHolder*/
    @Override
    public void onBindViewHolder(@NonNull ArtistaViewHolder holder, int position)
    {
        Artista artista = artistas.get( position );
        holder.bind_to_Item(artista);
    }



    class ArtistaViewHolder extends RecyclerView.ViewHolder
    {
        private ArtistaItemBinding itemViewBinding;
        private Artista artista;


        public ArtistaViewHolder(ArtistaItemBinding itemViewBinding)
        {
            /*el root es el cardview*/
            super( itemViewBinding.getRoot() );
            this.itemViewBinding = itemViewBinding;
            this.itemViewBinding.getRoot().setOnClickListener( (View view) ->
            {
                onItemClickListener.onClick( this.artista );
            });
        }

        public void bind_to_Item(Artista artista )
        {
            this.artista = artista;
            itemViewBinding.tvNombreArtista.setText(   artista.getNombre() );
            itemViewBinding.tvNumSeguidores.setText
            (
                    String.format("%s %s", String.valueOf(artista.getNum_seguidores()), itemViewBinding.tvNumSeguidores.getContext().getString(R.string.followers))
            );

            itemViewBinding.tvReproduccionesTotales.setText(
                    String.format("%s %s", String.valueOf(artista.getReproducciones_totales()), itemViewBinding.tvReproduccionesTotales.getContext().getString(R.string.plays))
            );
        }

    }



}
