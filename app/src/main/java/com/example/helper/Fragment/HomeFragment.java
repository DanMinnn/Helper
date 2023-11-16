package com.example.helper.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.helper.Adapter.HomeAdapter;
import com.example.helper.Adapter.SearchAdapter;
import com.example.helper.Model.Data;
import com.example.helper.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    ImageSlider imgSlider;
    RecyclerView recyclerView;
    HomeAdapter dataAdapter;

    View view;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.layout_home, container, false);
        imgSlider = view.findViewById(R.id.imgSlider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.img_1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.img_2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.img_3, ScaleTypes.FIT));

        imgSlider.setImageList(slideModels, ScaleTypes.FIT);

        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data("ASP", ".NET", "da-cda-cgr","3.000.000đ", R.drawable.img_1));
        dataList.add(new Data("adfwe", "ac", "ds-gvd-eg","3.000.000đ", R.drawable.img_2));
        dataList.add(new Data("gvv", "wqqe", "sc-ve-be","3.000.000đ", R.drawable.img_3));
        dataList.add(new Data("fwef", "vdfvdfb", "wq-g-dgs","3.000.000đ", R.drawable.img_1));

        setDataRecycle(dataList);
        return view;
    }

    private void setDataRecycle(List<Data> listData){
        recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new HomeAdapter(getContext(), listData);
        recyclerView.setAdapter(dataAdapter);
    }
}
