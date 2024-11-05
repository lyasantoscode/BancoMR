package com.lya.bancomr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.lya.bancomr.databinding.ActivitySaldoBinding;

public class Saldo extends AppCompatActivity {

    //definir evento de click no toolbar, para isso precisa configurar viewbinding
  // para cada tela precisa configurar o viewbinding, para ele conseguir pegar a referencia dos componentes daquele layout específico
    private ActivitySaldoBinding binding;  // como  a tela é de saldo, fica assim, e nao mainactvity igual da tela principal

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySaldoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // nisso, vai poder pegar todos o layout e todas as referencias que estão nele

        getSupportActionBar().hide(); //esconder a barra de ação que vem por defull


        //feito isso, la em cima.Quero recuperar o toolbar de saldo

        binding.toolbarSaldo.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                // entao quando clicar no icone de voltar, vamos navegar para proxima tela. Porque definimos o evento de clique para o item do nosso toolbar
                //nesse caso vamos usar o intent para voltar para a proxima tela (intent é uma classe)

            //    Intent voltarTelaPrincipal = new Intent(Saldo.this, MainActivity.class); // dentro de intent (aqui, passe qual é a atividade atual , é a "minha atividade de Saldo'. this e a atividade na qual eu quero voltar que é a MainActi , ou seja a tela principal)
               //resumindo, nesse caso criei uma intenção onde quero voltar para minha main activity quando eu clicar na minha toolbar de saldo

           //     startActivity(voltarTelaPrincipal); // aqui vou inicializar a minha intenção que é voltar para minha tela principal

                // 1) como nao finalizou o contexto, ainda conseguimos voltar pelo proprio botao do celular.... ou seja aquele 'finish()'
                // assim cabe o dev escolhe qual a melhor, apenas uma observação
                // 2) como queremos que o usuário nao volte pelo botao do celular, entao adicionamos o finish(), assim o usuario volta pelo toolbar <
                finish(); //finilizar o contexto atual, mainActivity

            }
        });


    }
}