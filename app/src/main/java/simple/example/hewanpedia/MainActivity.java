package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPria,btnWanita;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnPria = findViewById(R.id.btn_buka_buah_hijau);
        btnWanita = findViewById(R.id.btn_buka_buah_kuning);
        btnPria.setOnClickListener(view -> bukaGaleri("Buah Hijau"));
        btnWanita.setOnClickListener(view -> bukaGaleri("Buah Kuning"));
    }

    private void bukaGaleri(String jenisPakaian) {
        Log.d("MAIN","Buka activity baju pria");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisPakaian);
        startActivity(intent);
    }

}