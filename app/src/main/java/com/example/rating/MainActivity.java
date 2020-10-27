package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView like_count;
    TextView dislike_count;
    private int like_counter = 0;
    private int dislike_counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLike (View view)  {
        TextView alert = (TextView)findViewById(R.id.alert);
        alert.setText("Вам понравилась картинка");
        TextView like_count = (TextView)findViewById(R.id.like_count);
        like_counter++;
        like_count.setText(String.valueOf(like_counter));
    }

    public void onClickDislike (View view)  {
        TextView alert = (TextView)findViewById(R.id.alert);
        alert.setText("Вам не понравилась картинка");
        TextView dislike_count = (TextView)findViewById(R.id.dislike_count);
        dislike_counter++;
        dislike_count.setText(String.valueOf(dislike_counter));
    }
}