package id.ac.poliban.dts.indra.latihan13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvResult = findViewById(R.id.tvResult);
        String file = "indra";
        SharedPreferences sp = getSharedPreferences(file,MODE_PRIVATE);
        String lname = sp.getString("lname","na");
        String fname = sp.getString("fname","na");

        tvResult.setText(String.format("%s %s",fname,lname));
    }
}
