package id.ac.poliban.dts.indra.latihan13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etFirstName = findViewById(R.id.etFirstName);
        EditText etLastName = findViewById(R.id.etLastName);
        Button btLoad = findViewById(R.id.btLoad);
        Button btSave = findViewById(R.id.btSave);

        btLoad.setOnClickListener(v -> startActivity(new Intent(this,Second.class)));
        btSave.setOnClickListener(v -> {
            String file = "indra";
            SharedPreferences sp = getSharedPreferences(file, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            String lname ,fname;
            lname = etLastName.getText().toString();
            fname = etFirstName.getText().toString();

            editor.putString("lname",lname);
            editor.putString("fname",fname);
            editor.apply();

            Toast.makeText(this, "Data Disimpan", Toast.LENGTH_SHORT).show();
        });
    }
}
