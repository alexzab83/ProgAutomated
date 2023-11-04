package com.guerrazzi.trainreservation.view;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;

import com.google.gson.Gson;
import com.guerrazzi.trainreservation.R;
import com.guerrazzi.trainreservation.alarm.DepartureNotification;
import com.guerrazzi.trainreservation.databinding.ActivitySolutionDetailBinding;
import com.guerrazzi.trainreservation.model.SoluzioniBean;
import com.guerrazzi.trainreservation.view.fragment.CurrentReservationFragment;
import com.guerrazzi.trainreservation.view.viewmodel.SolutionDetailViewModel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
public class SolutionDetailActivity extends AppCompatActivity {
    private SolutionDetailViewModel viewModel;
    private ActivitySolutionDetailBinding bindingView;
    private SoluzioniBean soluzioniBean;
    private SoluzioniBean soluzioniBeanToModify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_detail);
        getDataIntent();
        viewModel = ViewModelProviders.of(this).get(SolutionDetailViewModel.class);
        bindingView = DataBindingUtil.setContentView(this, R.layout.activity_solution_detail);
        bindingView.setViewModel(viewModel);
        viewModel.setSolutionBean(soluzioniBean);
        viewModel.setSolutionBeanToModify(soluzioniBeanToModify);
        boolean btnVisibility = getIntent().getBooleanExtra(CurrentReservationFragment.ACTION_MODIFY, false);

        viewModel.initView(btnVisibility, !btnVisibility);
        bindingView.recycleStop.setAdapter(viewModel.getAdapter());
        bindingView.recycleStop.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL);
        bindingView.recycleStop.addItemDecoration(dividerItemDecoration);
        setSupportActionBar(bindingView.toolbarReservation);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        viewModel.getTrainInfo();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    public void getDataIntent(){
        soluzioniBean = new Gson().fromJson(getIntent().getStringExtra(ReservationActivity.STRING_SOLUTIONBEAN_INTENT), SoluzioniBean.class);
        soluzioniBeanToModify = new Gson().fromJson(getIntent().getStringExtra(ReservationActivity.STRING_SOLUTIONBEAN_TOMODIFY_INTENT), SoluzioniBean.class);
    }

    public void reserveSolution(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Prenotazione").setMessage("Vuoi prenotare il viaggio selezionato?").setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (soluzioniBeanToModify != null)
                    viewModel.modifySolution(soluzioniBeanToModify.getId());
                else{
                    viewModel.reserveSolution();
                    scheduleNotification(getNotification("Treno: "+soluzioniBean.getVehicles().get(0).getNumeroTreno()+" "+soluzioniBean.getOrigine()+" - "+soluzioniBean.getDestinazione()+ " partirà tra 30 minuti"), 10000);
                }
                setResult(Activity.RESULT_OK);
                finish();

            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show();
    }

    public void removeSolution(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Prenotazione").setMessage("Vuoi eliminare il viaggio selezionato?").setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                    viewModel.removeReservation();
                    dialogInterface.dismiss();
                    finish();

            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show();
    }

    public void modifySolution(View v){
        Intent i = new Intent(this, ReservationActivity.class);
        i.putExtra("solution", new Gson().toJson(soluzioniBean));
        startActivity(i);
        finish();
    }

    private void scheduleNotification(Notification notification, int delay) {

        Intent notificationIntent = new Intent(this, DepartureNotification.class);
        notificationIntent.putExtra(DepartureNotification.NOTIFICATION_ID, 1);
        notificationIntent.putExtra(DepartureNotification.NOTIFICATION, notification);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        long futureInMillis = SystemClock.elapsedRealtime() + delay;
        AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, futureInMillis, pendingIntent);
    }

    private Notification getNotification(String content) {
        Bitmap myLogo = BitmapFactory.decodeResource(getResources(), R.drawable.train_icon_not);
        Notification notification = new NotificationCompat.Builder(this, "train")
                .setSmallIcon(R.drawable.train_icon_not)
                .setContentTitle("Train Reservation")
                .setLargeIcon(myLogo)
                .setContentText("Avviso partenza")
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText(content)).build();
        return notification;
    }

}
