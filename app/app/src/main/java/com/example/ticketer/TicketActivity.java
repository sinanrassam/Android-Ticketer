package com.example.ticketer;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

public class TicketActivity extends AppCompatActivity {
    private EditText mTitleView;
    private EditText mDescriptionView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Ticketer");

        mTitleView = findViewById(R.id.title);
        mDescriptionView = findViewById(R.id.desciption);
    }

}
