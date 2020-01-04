package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityHal1 extends AppCompatActivity {

    Button hal2btn;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        input = findViewById(R.id.Input);

        hal2btn = findViewById(R.id.hal2btn);
        hal2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TextInput = input.getText().toString();
                startActivity(new Intent(ActivityHal1.this, ActivityHal2.class).putExtra("Hasil", TextInput));
            }
        });
    }
}
