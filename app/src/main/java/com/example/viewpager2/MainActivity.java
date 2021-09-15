package com.example.viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  OnboardingAdapter onboardingAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupOnboardingItems();
        ViewPager2 viewPager2 = findViewById(R.id.onboardingViewPager);
        viewPager2.setAdapter(onboardingAdapter);

    }

    private void setupOnboardingItems() {
        List<OnboardingItem> onboardingItems = new ArrayList<>();
        OnboardingItem item1, item2, item3;
        item1 = new OnboardingItem();
        item2 = new OnboardingItem();
        item3 = new OnboardingItem();
        item1.setTitle("1111");
        item2.setTitle("2222");
        item3.setTitle("3333");
        item1.setDescription("jgfdkljglkfjglkjdfgklf");
        item2.setDescription("nvm,n,xnv,mxz");
        item3.setDescription("ytuetyiuew");
        onboardingItems.add(item1);
        onboardingItems.add(item2);
        onboardingItems.add(item3);

        onboardingAdapter = new OnboardingAdapter(onboardingItems);


    }
}