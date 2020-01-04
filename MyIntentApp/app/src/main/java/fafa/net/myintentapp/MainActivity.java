package fafa.net.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveActivity;
    Button getBtnMoveActivityWithData;
    Button btnDial;
    Button btnWeb;
    Button btnpj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        getBtnMoveActivityWithData = findViewById(R.id.btn_move_data);
        getBtnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWeb = findViewById(R.id.btn_web);
        btnWeb.setOnClickListener(this);

        btnpj = findViewById(R.id.btn_PJ);
        btnpj.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                Intent moveActivityWithData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_NAME, "Tiffani Afiollalia Lorenza");
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveActivityWithData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "053250399998";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_web:
                Intent Link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polines.ac.id/id/"));
                startActivity(Link);
                break;
            case R.id.btn_PJ:
                Intent PJ = new Intent(MainActivity.this, ActivityHal1.class);
                startActivity(PJ);
        }
    }
}
