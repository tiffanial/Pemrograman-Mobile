package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHal2 extends AppCompatActivity {

    TextView View;
    String Data1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);

        View = findViewById(R.id.Muncul);
        Data1 = getIntent().getStringExtra("Hasil");

        View.setText(Data1);
    }
}
