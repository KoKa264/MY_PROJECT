package com.example.restaurantapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.restaurantapp.adapter.CartAdapter;
import com.example.restaurantapp.model.CartModel;

import java.util.ArrayList;
import java.util.List;


public class CartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public CartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.pizza1,"Cheese Pizza","50"));
        list.add(new CartModel(R.drawable.icecream3,"Vani Ice Cream","20"));
        list.add(new CartModel(R.drawable.sandwich2,"Mixed Sandwich","60"));
        list.add(new CartModel(R.drawable.burger2,"Beef Burger","50"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}