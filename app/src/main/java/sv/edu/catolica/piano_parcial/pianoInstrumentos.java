package sv.edu.catolica.piano_parcial;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pianoInstrumentos extends AppCompatActivity {

    private Button btnBongo, btnGuitarra, btnMaraca, btnPlatillo, btnTambor, btnTrompeta, btnViolin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_piano_instrumentos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnBongo = (Button) findViewById(R.id.btnBongo);
        btnGuitarra = (Button) findViewById(R.id.btnGuitarra);
        btnMaraca = (Button) findViewById(R.id.btnMaraca);
        btnPlatillo = (Button) findViewById(R.id.btnPlatillo);
        btnTambor = (Button) findViewById(R.id.btnTambor);
        btnTrompeta = (Button) findViewById(R.id.btnTrompeta);
        btnViolin = (Button) findViewById(R.id.btnViolin);

        MediaPlayer bongo = MediaPlayer.create(this, R.raw.bongo);
        MediaPlayer guitarra = MediaPlayer.create(this, R.raw.guitarra);
        MediaPlayer maraca = MediaPlayer.create(this, R.raw.maracas);
        MediaPlayer platillo = MediaPlayer.create(this, R.raw.platillos);
        MediaPlayer tambor = MediaPlayer.create(this, R.raw.tambor);
        MediaPlayer trompeta = MediaPlayer.create(this, R.raw.trompeta);
        MediaPlayer violin = MediaPlayer.create(this, R.raw.violin);

        btnBongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bongo", Toast.LENGTH_SHORT).show();
                bongo.start();
            }
        });

        btnGuitarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Guitarra",Toast.LENGTH_SHORT).show();
                guitarra.start();
            }
        });

        btnMaraca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Maraca",Toast.LENGTH_SHORT).show();
                maraca.start();
            }
        });

        btnPlatillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Platillo",Toast.LENGTH_SHORT).show();
                platillo.start();
            }
        });

        btnTambor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Tambor",Toast.LENGTH_SHORT).show();
                tambor.start();
            }
        });

        btnTrompeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Trompeta",Toast.LENGTH_SHORT).show();
                trompeta.start();
            }
        });

        btnViolin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Violin",Toast.LENGTH_SHORT).show();
                violin.start();
            }
        });

    }
}