package com.example.santiagolopezgarcia.barbershop.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.santiagolopezgarcia.barbershop.R;
import com.example.santiagolopezgarcia.barbershop.model.Barber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by santiagolopezgarcia on 6/13/17.
 */

public class BarberAdapter extends RecyclerView.Adapter<BarberAdapter.BarberListAdapterViewHolder> {

    Context context;
    List<Barber> barbers = new ArrayList<>();

    public BarberAdapter(Context context, List<Barber> barbers) {
        this.context = context;
        this.barbers = barbers;
    }

    @Override
    public BarberListAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        return new BarberListAdapterViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_barber, parent, false));
    }

    @Override
    public void onBindViewHolder(BarberListAdapterViewHolder holder, int position) {
        Barber barber = barbers.get(position);
//        holder.tvName.setText(barber.getName() + " " + barber.getLastName());
        holder.tvDescription.setText(barber.getDescription());
    }

    @Override
    public int getItemCount() {
        return barbers.size();
    }

    public class BarberListAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView tvName;
        private TextView tvDescription;

        public BarberListAdapterViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvName = (TextView) (itemView.findViewById(R.id.tvName));
            tvDescription = (TextView) (itemView.findViewById(R.id.tvDescription));
        }

        @Override
        public void onClick(View view) {

        }
    }
}
