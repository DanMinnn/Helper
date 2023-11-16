package com.example.helper.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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

public class SearchFragment extends Fragment {
    RecyclerView recyclerViewSearch;
    SearchAdapter searchAdapter;
    View view;
    Spinner spinner;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_search, container, false);
        spinner = view.findViewById(R.id.spinner);
        String[] items = {"giá tăng", "giá giảm", "phổ biến"};

        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data("ASP", ".NET", "da-cda-cgr","3.000.000đ", R.drawable.img_1));
        dataList.add(new Data("adfwe", "ac", "ds-gvd-eg","3.000.000đ", R.drawable.img_2));
        dataList.add(new Data("gvv", "wqqe", "sc-ve-be","3.000.000đ", R.drawable.img_3));
        dataList.add(new Data("fwef", "vdfvdfb", "wq-g-dgs","3.000.000đ", R.drawable.img_1));

        setDataRecycleSearch(dataList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        return view;
    }

    private void setDataRecycleSearch(List<Data> listData){
        recyclerViewSearch = view.findViewById(R.id.recyclerView_Search);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerViewSearch.setLayoutManager(layoutManager);
        searchAdapter = new SearchAdapter(getContext(), listData);
        recyclerViewSearch.setAdapter(searchAdapter);
    }
}
