package com.codeforvictory.superimageview.samples.superimageview;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.codeforvictory.android.superimageview.samples.R;
import com.codeforvictory.superimageview.samples.superimageview.image_cropping.ImageCroppingActivity;
import com.codeforvictory.superimageview.samples.superimageview.image_cropping.NetworkImageCroppingActivity;
import com.codeforvictory.superimageview.samples.superimageview.rounded_corners.RoundedCornerImagesActivity;

public class HomeActivity extends AppCompatActivity {
        
        @Override
        protected void onCreate (Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_home);
                findViewById(R.id.image_cropping).setOnClickListener(view ->
                        startActivity(new Intent(this, ImageCroppingActivity.class))
                );
                findViewById(R.id.image_cropping_network).setOnClickListener(view ->
                        startActivity(new Intent(this, NetworkImageCroppingActivity.class))
                );
                findViewById(R.id.rounded_corners).setOnClickListener(view ->
                        startActivity(new Intent(this, RoundedCornerImagesActivity.class))
                );
//    findViewById(R.id.rounded_corners_image_cropping).setOnClickListener(view ->
//        startActivity(new Intent(this, RoundedCornerImagesActivity.class))
//    );
        
        }
}
