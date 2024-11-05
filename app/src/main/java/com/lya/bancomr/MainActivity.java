package com.lya.bancomr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.lya.bancomr.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //obs: Deixar essa opção depois de finaizar o app todos > Outra forma de definir o click da imagem, alem do setOnClick.. é implementando uma interface de click depois de AppCompatActivity
    //na frente de AppCompatAc ali em cima, adicinamos implements OnClickListener, que é uma interface (I)
    // vai ficar vermelho ai clica na lampada para aceitar o metodo

    // essa interface de click é bom quando tem mais de dois botões cliaveis na tela.... senao, continua o codigo antes.

    private ActivityMainBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());  //aqui consigo rcuperar meus IDs do xml
        setContentView(binding.getRoot());
        //
       // binding.imgSaldo.setOnClickListener(new View.OnClickListener() {  comentado, explique em baixo o porque, devido a redução

        //   @Override
         //   public void onClick(View view) {
                //navegar de uma tela para outra, por isso intent (classe)

              // irei comentar, depois de usar outro metodo, passamos esse pra baixo:  Intent navegarTelaDeSaldo = new Intent(MainActivity.this,Saldo.class); // vou passar qual é atual atividade que estou e qual que eu quero passar
             // passado pra baixo:   startActivity(navegarTelaDeSaldo); // precisa iniciar a nossa intenção, la em cima apenas criamos a intenção
              //  finish(); // finalizar o contexto atual, então ele nao volta, fecha o app, fazendo finalizar atividade, nao dando mais para acessar.
                // nisso, se deixaro finish, precisaria colocar um botão para voltar
          //  }
      //  });

        binding.imgSaldo.setOnClickListener(this);   //reduzido para ca.... fazendo isso essa imSaldo ela esta escutando o evento de click atraves da minha interface
        binding.imgFaturas.setOnClickListener(this);   //reduzido para ca.... fazendo isso essa imSaldo ela esta escutando o evento de click atraves da minha interface
        binding.imgTransferencia.setOnClickListener(this);   //reduzido para ca.... fazendo isso essa imSaldo ela esta escutando o evento de click atraves da minha interface
        binding.imgPoupanca.setOnClickListener(this);   //reduzido para ca.... fazendo isso essa imSaldo ela esta escutando o evento de click atraves da minha interface

        //recuperar o id da nossa im fatura, e definir o evento clique
      //  binding.imgFaturas.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View view) {

             //   Intent navegarTelaDeFaturas = new Intent(MainActivity.this, Faturas.class);
             //   startActivity(navegarTelaDeFaturas);

              //  finish();  // se remover aqui, podemos adicionar la de cada factures, nisso,reduzirá o codigo la, removendo INTENT ETC..., e adicionando finish() no final .
//
       //     }
      //  });

      //  binding.imgTransferencia.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View view) {
                //Intent navegarTelaDeTransferencia = new Intent(MainActivity.this, Transferencia.class);
               // startActivity(navegarTelaDeTransferencia);
              //  finish();
       //     }
      //  });

      //  binding.imgPoupanca.setOnClickListener(new View.OnClickListener() {
      //      @Override
       //     public void onClick(View view) {
            //    Intent navegarTelaDePoupanca = new Intent(MainActivity.this, Poupanca.class);
             //   startActivity(navegarTelaDePoupanca);
                // finish();
      //      }
     //   });
    }

    @Override   // sobreescrita de metodo chamado de OnClick, veio da aceitação da Interface ViewOnClickListener que foi adicionado depois de AppCompactActivity .....
    public void onClick(View view) {

        // aqui dentro vamos fazer todo o processo de imagens, click, botoes etc

       int id = view.getId();

       if (id == R.id.imgSaldo) {  // obs: se quiser navegar para a tela de saldo, fazendo isso, teremos que passar o INTENT para ca, tirado-o la de cima
           Intent navegarTelaDeSaldo = new Intent(MainActivity.this,Saldo.class); // vou passar qual é atual atividade que estou e qual que eu quero passar
           startActivity(navegarTelaDeSaldo); // precisa iniciar a nossa intenção, la em cima apenas criamos a intenção
           //  finish(); // finalizar o contexto atual, então ele nao volta, fecha o app, fazendo finalizar atividade, nao dando mais para acessar.
           // nisso, se deixaro finish, precisaria colocar um botão para voltar


           //depois disso, para escutar o evento de click, devemos reduzir o codigo acima em binding.imaSlado.setOON... meio que apagamos isso aqui:

           //  binding.imgSaldo.setOnClickListener(new View.OnClickListener() {
           //            @Override
           //            public void onClick(View view) {
           //                //navegar de uma tela para outra, por isso intent (classe)
           //
           //              // irei comentar, depois de usar outro metodo, passamos esse pra baixo:  Intent navegarTelaDeSaldo = new Intent(MainActivity.this,Saldo.class); // vou passar qual é atual atividade que estou e qual que eu quero passar
           //             // passado pra baixo:   startActivity(navegarTelaDeSaldo); // precisa iniciar a nossa intenção, la em cima apenas criamos a intenção
           //              //  finish(); // finalizar o contexto atual, então ele nao volta, fecha o app, fazendo finalizar atividade, nao dando mais para acessar.
           //                // nisso, se deixaro finish, precisaria colocar um botão para voltar
           //            }
           //        });


           // e reduzimos para
          // binding.imgSaldo.setOnClickListener(this);  so irei comentar em cima



       } else if (id == R.id.imgFaturas) {
           Intent navegarTelaDeFaturas = new Intent(MainActivity.this, Faturas.class);
           startActivity(navegarTelaDeFaturas);

       } else if (id == R.id.imgTransferencia) {
           Intent navegarTelaDeTransferencia = new Intent(MainActivity.this, Transferencia.class);
           startActivity(navegarTelaDeTransferencia);


       }else {
           Intent navegarTelaDePoupanca = new Intent(MainActivity.this, Poupanca.class);
           startActivity(navegarTelaDePoupanca);

       }

    }
}

//scroll view é barra de rolagem