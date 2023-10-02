package com.example.eatmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    RecyclerView recyclerCategories;
    RecyclerView recyclerFoodItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerCategories = findViewById(R.id.recycler_categories);
        recyclerFoodItem = findViewById(R.id.recycler_foodItem);
        setCategories();
        setFoodItems(0);
    }



    private void setCategories() {
        List<FoodCategory> data = new ArrayList<>();

        FoodCategory foodCategory3 = new FoodCategory("Pizza", R.drawable.pizza);
        FoodCategory foodCategory = new FoodCategory("Chicken", R.drawable.ic_chicken);
        FoodCategory foodCategory2 = new FoodCategory("Burger", R.drawable.burger);
        FoodCategory foodCategory4 = new FoodCategory("Chicken", R.drawable.ic_chicken);
        FoodCategory foodCategory5 = new FoodCategory("Chicken", R.drawable.ic_chicken);

        data.add(foodCategory);
        data.add(foodCategory2);
        data.add(foodCategory3);
        data.add(foodCategory4);
        data.add(foodCategory5);

        FoodCategoryAdapter foodCategoryAdapter = new FoodCategoryAdapter(data, Home.this, new FoodCategoryAdapter.OnCategoryClickedListener() {
            @Override
            public void onCategoryClick(int position) {
                // category will change everytime we click on it
                setFoodItems(position);
            }
        });

        recyclerCategories.setLayoutManager(new LinearLayoutManager(Home.this, RecyclerView.HORIZONTAL, false));
        recyclerCategories.setAdapter(foodCategoryAdapter);

        foodCategoryAdapter.notifyDataSetChanged();
    }

    private void setFoodItems(int categoryPosition) {
        List<FoodItem> data = new ArrayList<>();

        switch (categoryPosition) {
            case 0 :
            FoodItem foodItem1 = new FoodItem("Pizza", 4.5f, 3.99, R.drawable.pizza_1);
            FoodItem foodItem2 = new FoodItem("Some Pizza", 4.5f, 3.99, R.drawable.pizza_2);
            FoodItem foodItem3 = new FoodItem("Nice Pizza", 4.5f, 3.99, R.drawable.pizza_3);
            FoodItem foodItem4 = new FoodItem("Hot Pizza", 4.5f, 3.99, R.drawable.pizza_4);
            FoodItem foodItem5 = new FoodItem("Best Pizza", 4.5f, 3.99, R.drawable.pizza_5);

            data.add(foodItem1);
            data.add(foodItem2);
            data.add(foodItem3);
            data.add(foodItem4);
            data.add(foodItem5);

            break;
            case 1:
                FoodItem foodItem6 = new FoodItem("Chicken", 3.5f, 3.99, R.drawable.grill_chicken_1);
                FoodItem foodItem7 = new FoodItem("Some Chicken", 2.5f, 3.99, R.drawable.grill_chicken_2);
                FoodItem foodItem8 = new FoodItem("Nice Chicken", 1.5f, 3.99, R.drawable.grill_chicken_3);
                FoodItem foodItem9 = new FoodItem("Hot Chicken", 4.5f, 3.99, R.drawable.grill_chicken_2);
                FoodItem foodItem10 = new FoodItem("Best Chicken", 3.5f, 3.99, R.drawable.grill_chicken_1);

                data.add(foodItem6);
                data.add(foodItem7);
                data.add(foodItem8);
                data.add(foodItem9);
                data.add(foodItem10);
                break;

        }





        FoodItemAdapter foodItemAdapter = new FoodItemAdapter(data);
        recyclerFoodItem.setLayoutManager(new LinearLayoutManager(Home.this, RecyclerView.HORIZONTAL, false));
        recyclerFoodItem.setAdapter(foodItemAdapter);

        foodItemAdapter.notifyDataSetChanged();

    }
}