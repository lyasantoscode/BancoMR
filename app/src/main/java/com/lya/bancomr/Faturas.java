package com.lya.bancomr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.lya.bancomr.databinding.ActivityFaturasBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Faturas extends AppCompatActivity {

    private ActivityFaturasBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //retirar a barra action bar
        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // removi la da main principal, e coloquei aqui, nisso podemos remover o Intent abaixo, irei so comentar.
               // Intent voltarTelaPrincipal = new Intent(Faturas.this, MainActivity.class);
                //startActivity(voltarTelaPrincipal);  se for descomentar, deve remover o finish(); irei fazer isso para os outros
            }
        });

        //configurar o cartao
        CreditCardView cartaoDeCredito = binding.cartaoDeCredito;
        cartaoDeCredito.setCardNumber("4587 6565 2255 5680");
        cartaoDeCredito.setCardName("Lya B Santos");
        cartaoDeCredito.setExpiryDate("11/25");
        cartaoDeCredito.setType(CardType.MASTERCARD);




    }
}