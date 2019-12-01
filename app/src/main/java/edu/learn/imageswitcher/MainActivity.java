package edu.learn.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void clickFunc(View view){

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.baby);

        //Log.i("it clicked", "it is working");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
