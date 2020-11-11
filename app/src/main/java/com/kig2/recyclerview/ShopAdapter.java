package com.kig2.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {

    List<Shop> mShopList;
    OnItemClick onItemClick;

    public ShopAdapter(List<Shop> mShopList) {
        this.mShopList = mShopList;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.item_shop,parent,false);
        return new ShopViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        Shop shop = mShopList.get(position);
        if(shop.isOnline()){
            holder.mImgOnline.setImageResource(R.drawable.ic_online);
        }else{
            holder.mImgOnline.setImageResource(R.drawable.ic_offline);
        }
        holder.mImgBackgroud.setImageResource(shop.getImage());
        holder.mTvName.setText(shop.getName());
        if(shop.getCountShops()>1){
            holder.mTvCountShop.setText(shop.getCountShops() +" dia diem");
        }else{
            holder.mTvCountShop.setText(shop.getAddress());
        }

        holder.mTvSaleOff.setText(shop.getSaleOf());
        holder.mTvPrice.setText("Gia" + shop.getPrice());
        holder.mTvPromotion.setText(shop.getPromotion());

    }

    @Override
    public int getItemCount() {
        return mShopList !=null ? mShopList.size() : 0;

    }

    class ShopViewHolder extends RecyclerView.ViewHolder{
        ImageView mImgOnline,mImgBackgroud;
        TextView mTvName,mTvCountShop,mTvSaleOff,mTvPrice,mTvPromotion;

        public ShopViewHolder(@NonNull final View itemView) {
            super(itemView);
            mImgBackgroud = itemView.findViewById(R.id.imageBackgroud);
            mImgOnline = itemView.findViewById(R.id.imageOnline);
            mTvName = itemView.findViewById(R.id.textViewNameShop);
            mTvCountShop = itemView.findViewById(R.id.textViewCountShops);
            mTvSaleOff= itemView.findViewById(R.id.textViewSaleOff);
            mTvPromotion = itemView.findViewById(R.id.textViewPromtion);
            mTvPrice = itemView.findViewById(R.id.textViewPrice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClick.onClick(getAdapterPosition());
                }
            });
        }
    }
    public void setOnItemClick(OnItemClick onItemClick){
        this.onItemClick = onItemClick;
    }
}
