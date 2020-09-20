package com.dumichelle.texts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edit_text;
    TextView text_name;
    Resources res;
    String[] greetings;
    Button greetings_btn;
    TextView greetings_text_view;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = getResources();
        greetings = res.getStringArray(R.array.greetings_array);
        btn = (Button) findViewById(R.id.btn);
        text_name = (TextView) findViewById(R.id.text_name);
        edit_text = (EditText) findViewById(R.id.edit_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit_text.getText().toString();
                Log.i("clickResponse", "I love CS");
                text_name.setText("Hi " + name  + "! Let's learn different languages!");
            }
        });
        greetings_btn = (Button) findViewById(R.id.greetings_button);
        greetings_text_view = (TextView) findViewById(R.id.greeting_text_view);
        greetings_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                greetings_text_view.setText(greetings[i % greetings.length]);
                i++;
                Log.i("clickResponse", "I love CS");
            }
        });
    }

}
