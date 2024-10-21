package com.codeforvictory.superimageview.samples.rounded_corners;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.codeforvictory.android.superimageview.SuperImageView;
import com.codeforvictory.android.superimageview.crop.CroppedImage;
import com.codeforvictory.android.superimageview.roundedcorners.RoundedCornersImage;
import com.codeforvictory.superimageview.samples.R;
import com.codeforvictory.superimageview.samples.shared.NetworkImage;

import java.util.List;
import java.util.Objects;

final class ImagesRecyclerAdapter extends RecyclerView.Adapter<ImagesRecyclerAdapter.ItemImageViewHolder> {
        
        private final List<NetworkImage> networkImages;
        
        ImagesRecyclerAdapter (List<NetworkImage> networkImages) {
                this.networkImages = networkImages;
        }
        
        @NonNull
        @Override
        public ItemImageViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
                return new ImagesRecyclerAdapter.ItemImageViewHolder(LayoutInflater.from(
                        parent.getContext()).inflate(R.layout.item_network_rounded_image, parent, false)
                );
        }
        
        @Override
        public void onBindViewHolder (@NonNull ItemImageViewHolder holder, int position) {
                holder.bind(networkImages.get(position));
        }
        
        @Override
        public int getItemCount () {
                return networkImages.size();
        }
        
        static final class ItemImageViewHolder extends RecyclerView.ViewHolder {
                
                private final SuperImageView superImageView;
                
                ItemImageViewHolder (@NonNull View itemView) {
                        super(itemView);
                        this.superImageView = (SuperImageView) itemView;
                }
                
                void bind (NetworkImage networkImage) {
                        Glide.with(itemView.getContext()).load(networkImage.imageUrl()).into(superImageView);
                }
        }
}
