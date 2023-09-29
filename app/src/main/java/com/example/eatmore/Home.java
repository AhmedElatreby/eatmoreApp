package com.example.eatmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    RecyclerView recyclerCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerCategories = findViewById(R.id.recycler_categories);
        setCategories();
    }

    private void setCategories() {
        List<FoodCategory> data = new ArrayList<>();

        FoodCategory foodCategory = new FoodCategory("Chicken", R.drawable.ic_chicken);
        FoodCategory foodCategory2 = new FoodCategory("Burger", R.drawable.burger);
        FoodCategory foodCategory3 = new FoodCategory("Pizza", R.drawable.pizza);
        FoodCategory foodCategory4 = new FoodCategory("Chicken", R.drawable.ic_chicken);
        FoodCategory foodCategory5 = new FoodCategory("Chicken", R.drawable.ic_chicken);

        data.add(foodCategory);
        data.add(foodCategory2);
        data.add(foodCategory3);
        data.add(foodCategory4);
        data.add(foodCategory5);

        FoodCategoryAdapter foodCategoryAdapter = new FoodCategoryAdapter(data, Home.this);

        recyclerCategories.setLayoutManager(new LinearLayoutManager(Home.this, RecyclerView.HORIZONTAL, false));
        recyclerCategories.setAdapter(foodCategoryAdapter);

        foodCategoryAdapter.notifyDataSetChanged();
    }
}