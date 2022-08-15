package com.example.socialmediagamer.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediagamer.R;
import com.example.socialmediagamer.activities.FiltersActivity;


public class FiltersFragment extends Fragment {

    View mview;
    CardView mcardViewPs4;
    CardView mcardViewXbox;
    CardView mcardViewNintendo;
    CardView mcardViewPc;



    public FiltersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mview =  inflater.inflate(R.layout.fragment_filters, container, false);
        mcardViewPs4 = mview.findViewById(R.id.cardViewPs4);
        mcardViewXbox = mview.findViewById(R.id.cardViewXbox);
        mcardViewPc = mview.findViewById(R.id.cardViewPc);
        mcardViewNintendo = mview.findViewById(R.id.cardViewNintendo);

        mcardViewPs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFilterActivity("Carrera Profesional");
            }
        });

        mcardViewXbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFilterActivity("Experiencias");
            }
        });

        mcardViewPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFilterActivity("Trabajos de Investigacion");
            }
        });

        mcardViewNintendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFilterActivity("Proyectos");
            }
        });

        return mview;
    }

    private void goToFilterActivity(String category){
        Intent intent = new Intent(getContext(), FiltersActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}