package sg.edu.rp.c346.id20028828.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswerChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswerChar = findViewById(R.id.textViewChar);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'a');
        tvAnswerChar.setText("Character Value received is: " + value);

    }
}