package com.guerrazzi.trainreservation.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.databinding.StationsListItemBinding;
import com.guerrazzi.trainreservation.model.Stations;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

public class StationsAdapter extends ArrayAdapter<Stations> {

    private Context context;
    private List<Stations> dataSet;

    public StationsAdapter(@NonNull Context context, int resource, List<Stations> dataSet) {
        super(context, resource);
        this.context = context;
        this.dataSet = dataSet;
    }

    public void setDataSet(List<Stations> list){
        this.dataSet = list;
        notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Stations getItem(int position) {
        return dataSet.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        StationsListItemBinding itemBinding = DataBindingUtil.inflate(inflater, R.layout.stations_list_item, null, false);
        itemBinding.setStation(dataSet.get(position));
        return itemBinding.getRoot();
    }


}
