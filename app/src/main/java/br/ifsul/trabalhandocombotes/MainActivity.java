package br.ifsul.trabalhandocombotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    class Click implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            tv.setText("Mais um novo Texto");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        tv.setText("Novo Texto");

        Button btTrocaTexto = findViewById(R.id.btTrocaTexto);
        Click onClickListener = new Click();
        btTrocaTexto.setOnClickListener(onClickListener);

        Button bt2 = findViewById(R.id.bttrocaTexto2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Texto alterado pelo botão 2");
            }
        });
    }

    public void onClickNoXML(View v){
        tv.setText("3a forma de clicar!");
    }
}