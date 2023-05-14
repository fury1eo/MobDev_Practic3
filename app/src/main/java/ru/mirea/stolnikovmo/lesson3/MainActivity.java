package ru.mirea.stolnikovmo.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("message", "value");
        
        Intent intent2 = getIntent();
        String string = intent2.getStringExtra("message");
    }
}