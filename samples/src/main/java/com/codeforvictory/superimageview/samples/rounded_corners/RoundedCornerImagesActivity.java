package com.codeforvictory.superimageview.samples.rounded_corners;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.codeforvictory.superimageview.samples.R;
import com.codeforvictory.superimageview.samples.shared.ImageLocalDataSource;
import com.codeforvictory.superimageview.samples.shared.widget.VerticalTransparentItemDecorator;

public final class RoundedCornerImagesActivity extends AppCompatActivity {
        
        @Override
        protected void onCreate (Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_images);
                setupViews();
        }
        
        private void setupViews () {
                RecyclerView images = findViewById(R.id.images);
                images.addItemDecoration(new VerticalTransparentItemDecorator(getResources().getDimensionPixelOffset(R.dimen.activity_horizontal_margin)));
                images.setAdapter(new ImagesRecyclerAdapter(ImageLocalDataSource.networkImages()));
        }
        
}
