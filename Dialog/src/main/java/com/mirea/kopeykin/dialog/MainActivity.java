package com.mirea.kopeykin.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowTime(View view) {
        MyTimeDialogFragment newFragment = new MyTimeDialogFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void onClickShowDate(View view) {
        MyDateDialogFragment newFragment = new MyDateDialogFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void onClickShowProgress(View view) {
        MyProgressDialogFragment myDialog = new MyProgressDialogFragment();
        myDialog.show(getSupportFragmentManager(), "Progress");
    }
}