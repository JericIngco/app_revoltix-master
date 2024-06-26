package com.revolt;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button btnMath,btnElect,btnGenEn,btnElectTech;
    ImageView goHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnMath = findViewById(R.id.btnMath);
        btnElect = findViewById(R.id.btnElect);
        btnGenEn = findViewById(R.id.btnGenEn);
        btnElectTech = findViewById(R.id.btnElectTech);
        goHome = findViewById(R.id.goHome);

        Intent intent = getIntent();
        String Mode = intent.getStringExtra("Mode");
        String data = intent.getStringExtra("UserId");

        goHome.setOnClickListener(v -> finish());

        btnMath.setOnClickListener(v -> {
            Intent TopicSubjects = new Intent(getApplicationContext(), TopicSubjects.class);
            TopicSubjects.putExtra("textToGet", btnMath.getText().toString());
            TopicSubjects.putExtra("Mode", Mode);
            TopicSubjects.putExtra("UserId",data);
            startActivity(TopicSubjects);


        });

        btnElect.setOnClickListener(v -> {
            Intent TopicSubjects = new Intent(getApplicationContext(), TopicSubjects.class);
            TopicSubjects.putExtra("textToGet", btnElect.getText().toString());
            TopicSubjects.putExtra("Mode", Mode);
            TopicSubjects.putExtra("UserId",data);
            startActivity(TopicSubjects);


        });

        btnGenEn.setOnClickListener(v -> {
            Intent TopicSubjects = new Intent(getApplicationContext(), TopicSubjects.class);
            TopicSubjects.putExtra("textToGet", btnGenEn.getText().toString());
            TopicSubjects.putExtra("Mode", Mode);
            TopicSubjects.putExtra("UserId",data);
            startActivity(TopicSubjects);


        });

        btnElectTech.setOnClickListener(v -> {
            Intent TopicSubjects = new Intent(getApplicationContext(), TopicSubjects.class);
            TopicSubjects.putExtra("textToGet", btnElectTech.getText().toString());
            TopicSubjects.putExtra("Mode", Mode);
            TopicSubjects.putExtra("UserId",data);
            startActivity(TopicSubjects);

        });

    }

    @Override
    public void onBackPressed() {
        // Call finish to close the current activity when the back button is pressed
        super.onBackPressed();
        Toast.makeText(Home.this, "Back", Toast.LENGTH_LONG).show();
        finish();
    }
}