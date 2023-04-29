package edu.birzeit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView v;
    Button b ;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.hobby);
        b=(Button) findViewById(R.id.button);
        edit = findViewById(R.id.hobtext);
    }
    public void show(View view) {
  String vv = edit.getText().toString();
  v.setText(vv);


    }


}