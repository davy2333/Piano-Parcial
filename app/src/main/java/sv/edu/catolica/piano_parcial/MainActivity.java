package sv.edu.catolica.piano_parcial;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnDo, btnRe, btnMi, btnFa, btnSo, btnLa, btnSi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnDo = (Button) findViewById(R.id.btnDO);
        btnRe = (Button) findViewById(R.id.btnRE);
        btnMi = (Button) findViewById(R.id.btnMI);
        btnFa = (Button) findViewById(R.id.btnFA);
        btnSo = (Button) findViewById(R.id.btnSO);
        btnLa = (Button) findViewById(R.id.btnLA);
        btnSi = (Button) findViewById(R.id.btnSI);

        MediaPlayer teclaRe = MediaPlayer.create(this, R.raw.re);
        MediaPlayer teclaMi = MediaPlayer.create(this, R.raw.mi);
        MediaPlayer teclaFa = MediaPlayer.create(this, R.raw.fa);
        MediaPlayer teclaSo = MediaPlayer.create(this, R.raw.sol);
        MediaPlayer teclaLa = MediaPlayer.create(this, R.raw.la);
        MediaPlayer teclaSi = MediaPlayer.create(this, R.raw.si);



        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla RE", Toast.LENGTH_SHORT).show();
                teclaRe.start();
            }
        });

        btnMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla MI", Toast.LENGTH_SHORT).show();
                teclaMi.start();
            }
        });

        btnFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla FA", Toast.LENGTH_SHORT).show();
                teclaFa.start();
            }
        });

        btnSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla SO", Toast.LENGTH_SHORT).show();
                teclaSo.start();
            }
        });

        btnLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla LA", Toast.LENGTH_SHORT).show();
                teclaLa.start();
            }
        });

        btnSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla SI", Toast.LENGTH_SHORT).show();
                teclaSi.start();
            }
        });

    }
}