package com.example.restaurantapp.ui.dish;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.restaurantapp.R;
import com.example.restaurantapp.adapter.DishAdapter;
import com.example.restaurantapp.model.DishModel;

import java.util.ArrayList;
import java.util.List;


public class DishFragment extends Fragment {


    public DishFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    List<DishModel> dishModels;
    DishAdapter dishAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_dish, container, false);

        recyclerView=root.findViewById(R.id.dish_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        dishModels = new ArrayList<>();

        dishModels.add(new DishModel(R.drawable.breakfast,"Breakfast","Breakfast full of energy","breakfast"));
        dishModels.add(new DishModel(R.drawable.lunch,"Lunch","Light lunch","lunch"));
        dishModels.add(new DishModel(R.drawable.dinner,"Dinner","A romantic dinner","dinner"));
        dishModels.add(new DishModel(R.drawable.sweets,"Sweets","Paradise of sweetness","sweets"));
        dishModels.add(new DishModel(R.drawable.coffe,"Coffee","Enjoy a delicious cup of coffee","coffee"));

        dishAdapter = new DishAdapter(dishModels, getContext());

        recyclerView.setAdapter(dishAdapter);
        dishAdapter.notifyDataSetChanged();
        return root;
    }


}