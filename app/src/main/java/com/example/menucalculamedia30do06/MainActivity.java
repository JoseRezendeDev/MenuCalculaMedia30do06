package com.example.menucalculamedia30do06;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.calcularMedia:
                abrirCalculaMedia();
                return true;
            case R.id.finalizarApp:
                finalizarApp();
                return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
        }
    }

    private void abrirCalculaMedia() {
        Intent intent = new Intent(getApplicationContext(), CalcularMediaActivity.class);
        startActivity(intent);
    }

    private void finalizarApp() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("FINALIZAR O APP");
        dialog.setIcon(R.drawable.ifsp_logo);
        dialog.setMessage("Tem certeza que deseja finalizar o app?");
        dialog.setCancelable(false);
        dialog.setPositiveButton("FINALIZAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "FINALIZANDO...", Toast.LENGTH_SHORT).show();
                System.exit(1);
            }
        });
        dialog.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "RETORNANDO AO APP...", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.create();
        dialog.show();
    }
}
