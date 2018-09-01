package com.s.d.a.a.menuflutuante;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

public class MenuFlutuante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_flutuante);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_flutuante, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
         ConstraintLayout menuFlutuante = findViewById(R.id.layMenuFlutuante);
        TextView edtMensagem = menuFlutuante.findViewById(R.id.edtMensagem);

        switch (item.getItemId()) {
            case R.id.menu_item_vermelho:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                menuFlutuante.setBackgroundColor(android.graphics.Color.RED);
                edtMensagem.setText("Cor de fundo do layout alterada para vermelho depois da seleção do menu flutuante!!!");
                return true;
            case R.id.menu_item_verde:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                menuFlutuante.setBackgroundColor(android.graphics.Color.GREEN);
                edtMensagem.setText("Cor de fundo do layout alterada para verde depois da seleção do menu flutuante!!!");
                return true;
            case R.id.menu_item_amarelo:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                menuFlutuante.setBackgroundColor(android.graphics.Color.YELLOW);
                edtMensagem.setText("Cor de fundo do layout alterada para amarelo depois da seleção do menu flutuante!!!");
                return true;
            case R.id.menu_item_azul:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                menuFlutuante.setBackgroundColor(android.graphics.Color.BLUE);
                edtMensagem.setText("Cor de fundo do layout alterada para azul depois da seleção do menu flutuante!!!");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
