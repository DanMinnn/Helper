package com.example.helper.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helper.Model.Data;
import com.example.helper.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.DataViewHolder> {
    Context context;
    List<Data> lstData;

    public HomeAdapter(Context context, List<Data> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_recycleview, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.tenTour.setText(lstData.get(position).getTenTour());
        holder.khoiHanh.setText(lstData.get(position).getKhoiHanh());
        holder.maTour.setText(lstData.get(position).getMaTour());
        holder.giaTour.setText(lstData.get(position).getGia());
        holder.imgView.setImageResource(lstData.get(position).getImgUrl());
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    public static final class DataViewHolder extends RecyclerView.ViewHolder{
        ImageView imgView;
        TextView tenTour, khoiHanh, maTour, giaTour;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imgView);
            tenTour = itemView.findViewById(R.id.tenTour);
            khoiHanh = itemView.findViewById(R.id.khoiHanh);
            maTour = itemView.findViewById(R.id.maTour);
            giaTour = itemView.findViewById(R.id.giaTour);
        }
    }
}
