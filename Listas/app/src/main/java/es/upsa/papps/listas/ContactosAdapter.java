package es.upsa.papps.listas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.upsa.papps.listas.databinding.ContactoItemBinding;

public class ContactosAdapter extends RecyclerView.Adapter< ContactosAdapter.ContactoViewHolder >
{

    public interface OnItemClickListener
    {
        public void onClick( Contacto contacto );
    }

    private List<Contacto> contactos;
    private OnItemClickListener onItemClickListener;


    public void setOnItemClickListener(OnItemClickListener onItemClickListener)
    {
        this.onItemClickListener = onItemClickListener;
    }

    public void submitList(List<Contacto> contactos)
    {
        this.contactos = contactos;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount()
    {
        return contactos.size();
    }

    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ContactoItemBinding itemViewBinding = ContactoItemBinding.inflate(layoutInflater, parent, false);
        return new ContactoViewHolder(itemViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder holder, int position)
    {
        Contacto contacto = contactos.get(position);
        holder.bind(contacto);

    }


    class ContactoViewHolder extends RecyclerView.ViewHolder
    {
        private ContactoItemBinding itemViewBinding;
        private Contacto contacto;

        public ContactoViewHolder(ContactoItemBinding itemViewBinding)
        {
            super(itemViewBinding.getRoot());
            this.itemViewBinding = itemViewBinding;
            itemViewBinding.getRoot().setOnClickListener( v -> {
                                                                  if ( onItemClickListener != null )
                                                                  {
                                                                      onItemClickListener.onClick(contacto);
                                                                  }
                                                               }
                                                        );

        }

        public void bind(Contacto contacto)
        {
            this.contacto = contacto;
            itemViewBinding.tvNombre.setText( contacto.getNombre() );
            itemViewBinding.tvEmail.setText( contacto.getEmail() );
            itemViewBinding.tvTelefono.setText( contacto.getTelefono() );
        }
    }
}
