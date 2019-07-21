package com.juniorrodrigues.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRock(View view){ this.optionSelected("Pedra"); }

    public void selectPaper(View view){
        this.optionSelected("Papel");
    }

    public void selectScissors(View view){
        this.optionSelected("Tesoura");
    }

    public void optionSelected(String optionUser){
        String [] options = {"Pedra", "Papel", "Tesoura"};

        ImageView imageResult = (ImageView) findViewById(R.id.imageResult);
        TextView textResult = (TextView) findViewById(R.id.textResult);

        String optionApp = options[new Random().nextInt(options.length)];

        switch( optionApp) {
            case "Pedra": imageResult.setImageResource(R.drawable.pedra); break;
            case "Pepel": imageResult.setImageResource(R.drawable.papel); break;
            case "Tesoura": imageResult.setImageResource(R.drawable.tesoura); break;
//            default: imageResult.setImageResource(R.drawable.padrao); break;
        }

        if(optionApp.equals("Pedra")&& optionUser.equals("Tesoura") ||
                optionApp.equals("Pepel")&& optionUser.equals("Pedra") ||
                    optionApp.equals("Tesoura")&& optionUser.equals("Pepel")){//app ganha

            textResult.setText("Você perdeu!");

        }else if(optionUser.equals("Pedra")&& optionApp.equals("Tesoura") ||
                    optionUser.equals("Pepel")&& optionApp.equals("Pedra") ||
                        optionUser.equals("Tesoura")&& optionApp.equals("Pepel")){//user ganha

            textResult.setText("Você Ganhou!");

        }else{//empate
            textResult.setText("Empate!");
        }

    }
}
