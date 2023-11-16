package com.example.helper;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.helper.Fragment.HomeFragment;
import com.example.helper.Fragment.ProfileFragment;
import com.example.helper.Fragment.SearchFragment;
import com.example.helper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new SearchFragment());
        binding.bottomNav.setOnItemSelectedListener(item -> {
           int id = item.getItemId();
           if(id == R.id.home){
                replaceFragment(new SearchFragment());
           } else if (id == R.id.person) {
                replaceFragment(new ProfileFragment());
           }
           return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }
}
