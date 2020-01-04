package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithData extends AppCompatActivity {

    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";

    TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TvDataReceived = findViewById(R.id.tv_data_recieved);

        int umur = getIntent().getIntExtra(EXTRA_AGE,0);
        String nama = getIntent().getStringExtra(EXTRA_NAME);

        String text = "Nama : "+nama+ ",\nUmur : "+umur;
        TvDataReceived.setText(text);
    }
}
