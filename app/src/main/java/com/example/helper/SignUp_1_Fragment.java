package com.example.helper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignUp_1_Fragment extends Fragment implements View.OnClickListener{
    ImageButton img_btn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_dangky_1, container, false);
        img_btn = view.findViewById(R.id.img_btn);

        img_btn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(getActivity() instanceof OnTabButtonClickListener){
            ((OnTabButtonClickListener) getActivity()).onTabButtonClick(1);
        }
    }
}
