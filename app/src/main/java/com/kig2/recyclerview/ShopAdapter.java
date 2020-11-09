package com.kig2.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShopAdapter {

    class ShopViewHolder extends RecyclerView.ViewHolder{
        ImageView mImgOnline,mImgBackgroud;
        TextView mTvName,mTvCountShop,mTvSaleOff,mTvPrice,mTvPromotion;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgBackgroud = itemView.findViewById(R.id.imageBackgroud);
            mImgOnline = itemView.findViewById(R.id.imageOnline);
            mTvName = itemView.findViewById(R.id.textViewNameShop);
            mTvCountShop = itemView.findViewById(R.id.textViewCountShops);
            mTvSaleOff= itemView.findViewById(R.id.textViewSaleOff);
            mTvPromotion = itemView.findViewById(R.id.textViewPromtion);
            mTvPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
