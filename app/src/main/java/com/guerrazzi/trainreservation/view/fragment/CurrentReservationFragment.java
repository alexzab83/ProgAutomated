package com.guerrazzi.trainreservation.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.gson.Gson;
import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.databinding.ContentMainBinding;
import com.guerrazzi.trainreservation.model.SoluzioniBean;
import com.guerrazzi.trainreservation.view.ReservationActivity;
import com.guerrazzi.trainreservation.view.SolutionDetailActivity;
import com.guerrazzi.trainreservation.view.adapter.SolutionsAdapter;
import com.guerrazzi.trainreservation.view.viewmodel.CurrentReservationViewmodel;

public class CurrentReservationFragment extends Fragment implements SolutionsAdapter.SolutionsAdapterInterface{


    ContentMainBinding binding;
    CurrentReservationViewmodel viewmodel;
    public static final String ACTION_MODIFY = "action_modify";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.content_main, container, false);
        if (viewmodel == null){
            viewmodel = new CurrentReservationViewmodel(getActivity().getApplication());
        }
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewmodel.initAdapter(this);
        binding.setViewModel(viewmodel);
        binding.currentReservationRecycle.setAdapter(viewmodel.getSolutionsAdapter());
        binding.currentReservationRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    public void onItemClick(SoluzioniBean sb) {
        Intent i = new Intent(getActivity(), SolutionDetailActivity.class);
        i.putExtra(ReservationActivity.STRING_SOLUTIONBEAN_INTENT, new Gson().toJson(sb));
        i.putExtra(ACTION_MODIFY, true);
        startActivity(i);
    }
}
