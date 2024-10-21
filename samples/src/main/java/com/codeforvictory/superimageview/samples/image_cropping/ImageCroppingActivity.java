package com.codeforvictory.superimageview.samples.image_cropping;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.codeforvictory.superimageview.samples.R;
import com.codeforvictory.superimageview.samples.shared.ImageLocalDataSource;

public final class ImageCroppingActivity extends AppCompatActivity {
        
        @Override
        protected void onCreate (Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_image_cropping);
                ((ViewPager) findViewById(R.id.cropped_images)).setAdapter(new ImagesPagerAdapter(ImageLocalDataSource.localImages()));
        }
}
