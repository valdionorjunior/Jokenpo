package com.juniorrodrigues.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRock(View view){
        this.optionSelected("Pedra");
    }

    public void selectPaper(View view){
        this.optionSelected("Papel");
    }

    public void selectScissors(View view){
        this.optionSelected("Tesoura");
    }

    public void optionSelected(String optionUser){
        String [] options = {"Pedra", "Papel", "Tesoura"};

        ImageView imageResult = (ImageView) findViewById(R.id.imageResult);

        switch( options[new Random().nextInt(options.length)]) {
            case "Pedra": imageResult.setImageResource(R.drawable.pedra); break;
            case "Pepel": imageResult.setImageResource(R.drawable.papel); break;
            case "Tesoura": imageResult.setImageResource(R.drawable.tesoura); break;
//            default: imageResult.setImageResource(R.drawable.padrao); break;
        }
    }
}
