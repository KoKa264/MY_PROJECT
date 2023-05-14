package com.example.restaurantapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.adapter.DetailDishAdapter;
import com.example.restaurantapp.model.DetailDishModel;

import java.util.ArrayList;
import java.util.List;

public class DetailDishActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailDishModel> detailDishModelList;
    DetailDishAdapter dishAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dish);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detail_rec);
        imageView = findViewById(R.id.detail_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailDishModelList = new ArrayList<>();
        dishAdapter = new DetailDishAdapter(detailDishModelList);
        recyclerView.setAdapter(dishAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){

            detailDishModelList.add(new DetailDishModel(R.drawable.fav1,"Fruit", "description","5.0","30"));
            detailDishModelList.add(new DetailDishModel(R.drawable.fav2,"Hamburger", "description","5.0","50"));
            detailDishModelList.add(new DetailDishModel(R.drawable.fav3,"Noodle", "description","5.0","40"));

            dishAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("lunch")){

            detailDishModelList.add(new DetailDishModel(R.drawable.pizza1,"Cheese Pizza", "description","5.0","50"));
            detailDishModelList.add(new DetailDishModel(R.drawable.pizza2,"Beef Pizza", "description","5.0","50"));
            detailDishModelList.add(new DetailDishModel(R.drawable.pizza3,"Mixed Pizza", "description","5.0","50"));

            dishAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.sweets);

            detailDishModelList.add(new DetailDishModel(R.drawable.s1,"Candy", "description","5.0","20"));
            detailDishModelList.add(new DetailDishModel(R.drawable.s2,"Donut", "description","5.0","35"));
            detailDishModelList.add(new DetailDishModel(R.drawable.s3,"Strawberry Ice Cream", "description","5.0","10"));
            detailDishModelList.add(new DetailDishModel(R.drawable.s4,"Sandwich Ice Cream", "description","5.0","10"));

            dishAdapter.notifyDataSetChanged();
        }
    }
}