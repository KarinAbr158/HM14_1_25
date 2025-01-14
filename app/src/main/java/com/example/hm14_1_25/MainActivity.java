package com.example.hm14_1_25;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    Button click, next;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","OnCreate");
        Log.i("MainActivity","just to change colours");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        click = findViewById(R.id.button);
        next = findViewById(R.id.button2);
        text = findViewById(R.id.textView);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                text.setText(String.valueOf(count));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","OnRestart");
    }
}