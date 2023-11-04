package com.guerrazzi.trainreservation.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.util.Strings;
import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.databinding.SolutionListItemBinding;
import com.guerrazzi.trainreservation.model.SoluzioniBean;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class SolutionsAdapter extends RecyclerView.Adapter<SolutionsAdapter.SolutionViewHolder>{


    private List<SoluzioniBean> list = new ArrayList<>();
    private String origin , destination;
    private SolutionsAdapterInterface actionInterface;


    @NonNull
    @Override
    public SolutionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SolutionListItemBinding solutionListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.solution_list_item, parent, false);
        return new SolutionViewHolder(solutionListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull SolutionViewHolder holder, int position) {
        SoluzioniBean s = list.get(position);
        if (Strings.isEmptyOrWhitespace(origin) || Strings.isEmptyOrWhitespace(destination)){
            holder.listItemBinding.setOrigin(s.getOrigine());
            holder.listItemBinding.setDestination(s.getDestinazione());
        }else{
            holder.listItemBinding.setOrigin(origin);
            holder.listItemBinding.setDestination(destination);
        }
        holder.listItemBinding.setSolutions(s);

    }

    public void setSolutionList(List<SoluzioniBean> list, String origin, String destination) {
        this.list = list;
        this.origin = origin;
        this.destination = destination;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (list != null) {
            return list.size();
        } else {
            return 0;
        }
    }




    class SolutionViewHolder extends RecyclerView.ViewHolder {

        private SolutionListItemBinding listItemBinding;

        public SolutionViewHolder(@NonNull SolutionListItemBinding listItemBinding) {
            super(listItemBinding.getRoot());
            this.listItemBinding = listItemBinding;

            listItemBinding.solutionItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                if (actionInterface != null){
                    actionInterface.onItemClick(list.get(getAdapterPosition()));
                }
                }
            });
        }
    }

    public void setActionInterface(SolutionsAdapterInterface actionInterface){

        this.actionInterface = actionInterface;
    }


    public interface SolutionsAdapterInterface {
        void onItemClick(SoluzioniBean sb);
    }
}
