package sg.edu.rp.c346.id20028828.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswerInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswerInt = findViewById(R.id.textViewInt);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        tvAnswerInt.setText("Integer Value received is: " + value);
    }
}