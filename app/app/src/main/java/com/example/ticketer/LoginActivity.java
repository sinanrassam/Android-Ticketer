package com.example.ticketer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    // public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
    //     super.onViewCreated(view, savedInstanceState);

    //     view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
    //         @Override
    //         public void onClick(View view) {
    //             NavHostFragment.findNavController(LoginActivity.this)
    //                     .navigate(R.id.action_LoginFragment_to_MainFragment);
    //         }
    //     });
    // }
}
