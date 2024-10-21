package com.codeforvictory.superimageview.samples.shared;

import androidx.annotation.DrawableRes;

import com.codeforvictory.android.superimageview.crop.CropType;

public final class LocalImage {
        
        @CropType
        private final int cropType;
        private final String title;
        @DrawableRes
        private final int drawableResource;
        
        LocalImage (@CropType int cropType, String title, @DrawableRes int drawableResource) {
                this.cropType = cropType;
                this.title = title;
                this.drawableResource = drawableResource;
        }
        
        @CropType
        public int getCropType () {
                return cropType;
        }
        
        public String getTitle () {
                return title;
        }
        
        @DrawableRes
        public int getDrawableResource () {
                return drawableResource;
        }
}
