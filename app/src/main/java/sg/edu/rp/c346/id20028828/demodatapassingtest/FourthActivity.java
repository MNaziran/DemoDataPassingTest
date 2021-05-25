package sg.edu.rp.c346.id20028828.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvDouble = findViewById(R.id.textViewDouble);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0.0);
        tvDouble.setText("Double Value received is: " + value);

    }
}