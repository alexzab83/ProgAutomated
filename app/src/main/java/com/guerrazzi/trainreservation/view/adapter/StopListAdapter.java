package com.guerrazzi.trainreservation.view.adapter;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.databinding.StopListItemBinding;
import com.guerrazzi.trainreservation.model.FermateBean;

import java.util.ArrayList;
import java.util.List;

public class StopListAdapter  extends RecyclerView.Adapter<StopListAdapter.StopViewHolder> {

    private List<FermateBean> list = new ArrayList<>();

    @NonNull
    @Override
    public StopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        StopListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.stop_list_item, parent, false);
        return new StopViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StopViewHolder holder, int position) {
        FermateBean fb = list.get(position);
        holder.listItemBinding.setFermata(fb);
        if(fb.getTipoFermata().equals("P")) {
            holder.listItemBinding.imageStop.setImageResource(R.drawable.departure_stop);
        }else if (fb.getTipoFermata().equals("A")){
            holder.listItemBinding.imageStop.setImageResource(R.drawable.arrive_stop);
        }else {
            holder.listItemBinding.imageStop.setImageResource(R.drawable.intermediate_stop);
        }
        if (fb.isDeparture()){
            holder.listItemBinding.llStop.setBackgroundColor(holder.listItemBinding.getRoot().getResources().getColor(android.R.color.holo_green_light));
        }else if(fb.isArrive()){
            holder.listItemBinding.llStop.setBackgroundColor(holder.listItemBinding.getRoot().getResources().getColor(android.R.color.holo_red_light));
        } else holder.listItemBinding.llStop.setBackgroundColor(holder.listItemBinding.getRoot().getResources().getColor(android.R.color.white));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(List<FermateBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    class StopViewHolder extends RecyclerView.ViewHolder {

        private StopListItemBinding listItemBinding;

        public StopViewHolder(@NonNull StopListItemBinding listItemBinding) {
            super(listItemBinding.getRoot());
            this.listItemBinding = listItemBinding;

        }
    }
}
