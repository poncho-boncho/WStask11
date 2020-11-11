package com.example.wstask1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        EditText editText = (EditText) findViewById(R.id.edit_message2);
        editText.setTextSize(40);
        editText.setText(message);

      //  setContentView(editText);
    }

    public void sendMassage2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}