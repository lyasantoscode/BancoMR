package com.lya.bancomr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.lya.bancomr.databinding.ActivityPoupancaBinding;

public class Poupanca extends AppCompatActivity {


    private ActivityPoupancaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPoupancaBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        binding.toolbarPoupanca.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();  // adicionei e removi o codigo de baixo.
              //  Intent voltarTelaPrincipal = new Intent(Poupanca.this, MainActivity.class);
             //   startActivity(voltarTelaPrincipal);
            }
        });




    }
}