package com.example.restaurantapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.restaurantapp.R;
import com.example.restaurantapp.adapter.FeaturedAdapter;
import com.example.restaurantapp.adapter.FeaturedVerAdapter;
import com.example.restaurantapp.model.FeaturedModel;
import com.example.restaurantapp.model.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    //hor
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    //ver
    List<FeaturedVerModel> featuredVerModelsList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        //hor
        recyclerView = view.findViewById(R.id.ft_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.fav1, "Eat Clean", "Fresh vegetables"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav2, "Beef Burger", "Make from scrumptious beef"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav3, "Spaghetti", "Chewy noodles with greasy sauce"));

        featuredAdapter=new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);

        //ver
        recyclerView2 = view.findViewById(R.id.ft_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelsList = new ArrayList<>();

        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1,"Strawberry cereal","Weight loss cereal","5.0"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2,"Egg sandwich","Hit melt with chewy bread","5.0"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3,"Blueberry Sandwich","Sweet like princess Rapunzel","5.0"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.s4,"Socola Ice Cream","Cool with the bitter taste of chocolate","5.0"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelsList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;

    }
}