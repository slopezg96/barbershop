package com.example.santiagolopezgarcia.barbershop.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.santiagolopezgarcia.barbershop.R;
import com.example.santiagolopezgarcia.barbershop.adapters.BarberAdapter;
import com.example.santiagolopezgarcia.barbershop.model.Barber;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BarberListActivity extends AppCompatActivity {

    @BindView(R.id.rvBarberList)
    RecyclerView rvBarbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barber_list);
        ButterKnife.bind(this);
        loadBarbers();
    }

    private void loadBarbers() {
        List<Barber> barbers = new ArrayList<>();
        for (int i = 0; i < 10; i++ ) {
            Barber barber = new Barber();
            barber.setName("Julio Hernan");
            barber.setLastName("Perez Gonzalez");
            barber.setDescription("Graduado en la Escuela La Mariela");
            barbers.add(barber);
        }


        rvBarbers.setAdapter(new BarberAdapter(this, barbers));
        rvBarbers.setLayoutManager(new LinearLayoutManager(this));
    }
}
