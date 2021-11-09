package ru.geekbrains.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String firstTimeRun;
        if (savedInstanceState == null){
            firstTimeRun = "Первый запуск";
        } else {
            firstTimeRun = "Повторный запуск";
        }
        Toast.makeText(this, firstTimeRun + " - onCreate()", Toast.LENGTH_SHORT).show();
    }
}