package com.example.arrayandroid.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.arrayandroid.R;
import com.example.arrayandroid.model.KelompokDua;
import com.example.arrayandroid.ui.adapter.ListKelompokDuaAdapter.KelompokDuaViewHolder;

import java.util.ArrayList;

public class ListKelompokDuaAdapter extends RecyclerView.Adapter<KelompokDuaViewHolder> {

    private ArrayList<KelompokDua> kelompokDua;
    private Context context;

    public ListKelompokDuaAdapter(Context ctx, ArrayList<KelompokDua> kelompokDuaArrayList) {
        context = ctx;
        kelompokDua = kelompokDuaArrayList;
    }

    @NonNull
    @Override
    public KelompokDuaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new KelompokDuaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KelompokDuaViewHolder holder, int position) {
        holder.nimTxt.setText(kelompokDua.get(position).getNim());
        holder.namaTxt.setText(kelompokDua.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return kelompokDua.size();
    }

    class KelompokDuaViewHolder extends RecyclerView.ViewHolder {

        TextView nimTxt, namaTxt;

        public KelompokDuaViewHolder(@NonNull View itemView) {
            super(itemView);

            nimTxt = itemView.findViewById(R.id.nim);
            namaTxt = itemView.findViewById(R.id.nama);
        }
    }
}
