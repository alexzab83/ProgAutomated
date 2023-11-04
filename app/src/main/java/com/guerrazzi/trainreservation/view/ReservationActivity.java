package com.guerrazzi.trainreservation.view;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;
import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.data.manager.DataManagerPrefs;
import com.guerrazzi.trainreservation.databinding.ActivityReservationBinding;
import com.guerrazzi.trainreservation.model.Soluzioni;
import com.guerrazzi.trainreservation.model.SoluzioniBean;
import com.guerrazzi.trainreservation.model.Stations;
import com.guerrazzi.trainreservation.utils.DateConverter;
import com.guerrazzi.trainreservation.view.adapter.SolutionsAdapter;
import com.guerrazzi.trainreservation.view.viewmodel.ReservationViewModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ReservationActivity extends AppCompatActivity implements SolutionsAdapter.SolutionsAdapterInterface {

    public static final String STRING_SOLUTIONBEAN_TOMODIFY_INTENT = "SOLUTION_BEAN_TOMODIFY";
    private ReservationViewModel viewModel;
    private ActivityReservationBinding bindingView;
    public static final String STRING_SOLUTIONBEAN_INTENT = "SOLUTION_BEAN";
    public static final String SOLUTION_PARAM = "solution";
    private SoluzioniBean soluzioniBean;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDataIntent();
        viewModel = ViewModelProviders.of(this).get(ReservationViewModel.class);
        bindingView = DataBindingUtil.setContentView(this, R.layout.activity_reservation);
        bindingView.setViewModel(viewModel);
        setSupportActionBar(bindingView.toolbarReservation);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        DateFormat format2 = new SimpleDateFormat("EEE MMM dd yyyy HH:MM:ss", Locale.ENGLISH);
        Log.i("CALENDAR TODAY", (format2.format(new Date()) + " GMT+0100").replace(" ", "%20"));

    }

    private void getDataIntent() {
        String jsonSolution = getIntent().getExtras() != null ? getIntent().getExtras().getString(SOLUTION_PARAM, "") : null;
        soluzioniBean = Strings.isEmptyOrWhitespace(jsonSolution) ? null : new Gson().fromJson(jsonSolution, SoluzioniBean.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (soluzioniBean == null) {
            viewModel.initAdapterSolution(this);
            viewModel.initAdapterStations();
            bindingView.edAutoOrigin.setAdapter(viewModel.getStationAdapter());
            bindingView.edAutoDest.setAdapter(viewModel.getStationAdapter());
            bindingView.edAutoOrigin.addTextChangedListener(viewModel.getTextWatcher());
            bindingView.edAutoDest.addTextChangedListener(viewModel.getTextWatcher());
            bindingView.edDateDeparture.setText(DateConverter.convertCalendarToViewDate(Calendar.getInstance()));
            bindingView.edAutoOrigin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    viewModel.setOriginStation((Stations) bindingView.edAutoOrigin.getAdapter().getItem(position));
                }
            });
            bindingView.edAutoDest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    viewModel.setDestStation((Stations) bindingView.edAutoDest.getAdapter().getItem(position));
                }
            });

        }else {
            viewModel.initAdapterSolution(this);
            Stations originStation = new Stations();
            originStation.setId(soluzioniBean.getOriginCode());
            if (soluzioniBean.getOriginCode().startsWith("S0"))
                originStation.setShotId(soluzioniBean.getOriginCode().substring(2));
            else originStation.setShotId(soluzioniBean.getOriginCode().substring(1));
            originStation.setDescription(soluzioniBean.getOrigine());

            Stations destStation = new Stations();
            originStation.setId(soluzioniBean.getDestCode());
            if (soluzioniBean.getOriginCode().startsWith("S0"))
                destStation.setShotId(soluzioniBean.getDestCode().substring(2));
            else destStation.setShotId(soluzioniBean.getDestCode().substring(1));
            destStation.setDescription(soluzioniBean.getDestinazione());
            viewModel.setDestStation(destStation);
            viewModel.setOriginStation(originStation);
            bindingView.edAutoOrigin.setText(soluzioniBean.getOrigine());
            bindingView.edAutoDest.setText(soluzioniBean.getDestinazione());
            bindingView.edAutoOrigin.setEnabled(false);
            bindingView.edAutoDest.setEnabled(false);
        }
        viewModel.setDateDeparture(Calendar.getInstance());
        bindingView.solutionRecycle.setAdapter(viewModel.getSolutionsAdapter());
        bindingView.solutionRecycle.setLayoutManager(new LinearLayoutManager(this));

    }



    private Calendar date;

    public void showDateTimePicker(View v) {
        final Calendar currentDate = Calendar.getInstance();
        date = Calendar.getInstance();
        DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date.set(year, monthOfYear, dayOfMonth);
                new TimePickerDialog(view.getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        date.set(Calendar.HOUR_OF_DAY, hourOfDay);
                        date.set(Calendar.MINUTE, minute);
                        bindingView.edDateDeparture.setText(DateConverter.convertCalendarToViewDate(date));
                        viewModel.setDateDeparture(date);
                    }
                }, currentDate.get(Calendar.HOUR_OF_DAY), currentDate.get(Calendar.MINUTE), false).show();
            }
        }, currentDate.get(Calendar.YEAR), currentDate.get(Calendar.MONTH), currentDate.get(Calendar.DATE));
        dpd.getDatePicker().setMinDate(currentDate.getTimeInMillis());
        dpd.show();
    }

    public void getSolutions(View v) {
        hideKeyboard();
        if (viewModel.getOriginStation() == null || viewModel.getDestStation() == null){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Attenzione").setMessage("Devi selezionare le stazioni dai suggerimenti").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }else
            viewModel.getSolutions();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(SoluzioniBean sb) {
        sb.setOriginCode(viewModel.getOriginStation().getId());
        sb.setDestCode(viewModel.getDestStation().getId());
        sb.setDestinazione(viewModel.getDestStation().getDescription());
        sb.setOrigine(viewModel.getOriginStation().getDescription());
        Toast.makeText(this, "SolutionClick", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, SolutionDetailActivity.class);
        i.putExtra(STRING_SOLUTIONBEAN_INTENT, new Gson().toJson(sb));
        if (soluzioniBean != null)
            i.putExtra(STRING_SOLUTIONBEAN_TOMODIFY_INTENT, new Gson().toJson(soluzioniBean));
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) finish();
        else getSolutions(null);
    }

    public void hideKeyboard(){
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
