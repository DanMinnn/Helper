package com.example.helper.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SignUpAdapter extends FragmentStateAdapter {

    public SignUpAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            return new SignUp_2_Fragment();
        }
        return new SignUp_1_Fragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
