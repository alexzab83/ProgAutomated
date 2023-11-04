package com.guerrazzi.trainreservation.view.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.guerrazzi.trainreservation.data.manager.DataManagerPrefs;
import com.guerrazzi.trainreservation.model.SoluzioniBean;
import com.guerrazzi.trainreservation.view.adapter.SolutionsAdapter;

import java.util.List;

public class CurrentReservationViewmodel extends BaseViewModel {

    private SolutionsAdapter solutionsAdapter;

    public ObservableField<Boolean> obsNoResult = new ObservableField<>(false);
    public ObservableField<Boolean> obsListSolution = new ObservableField<>(false);

    public CurrentReservationViewmodel(@NonNull Application application) {
        super(application);
    }

    public void initAdapter(SolutionsAdapter.SolutionsAdapterInterface actionInterface) {
        solutionsAdapter = new SolutionsAdapter();
        solutionsAdapter.setActionInterface(actionInterface);
        List<SoluzioniBean> listSolution = DataManagerPrefs.getAllReservation(getApplication());
        if (listSolution == null || listSolution.isEmpty()) {
            obsNoResult.set(true);
            obsListSolution.set(false);
        }
        else {
            obsNoResult.set(false);
            obsListSolution.set(true);
            solutionsAdapter.setSolutionList(listSolution, "", "");
        }

    }

    public SolutionsAdapter getSolutionsAdapter() {
        return solutionsAdapter;
    }
}
