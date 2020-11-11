package com.kig2.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRcvShop;
    ShopAdapter mShopAdapter;
    List<Shop> mListShop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvShop =  findViewById(R.id.recyclerView);
        mListShop = new ArrayList<>();
        mListShop = Shop.getMock();

        mListShop.add(new Shop("7 -  eleven : Cua hang tien loi",50,"","Toi thieu 20k",10,"Deal giam toi 15k",R.drawable.h,false));
        mListShop.add(new Shop("Big C",30 ,"" ,"Tối thiểu 20k",15,"Deal giảm tới 15k",R.drawable.a,false));
        mListShop.add(new Shop("Circle K",20 ,"" ,"Tối thiểu 10k",20,"Deal giảm tới 15k",R.drawable.b,true));
        mListShop.add(new Shop("Cooky market",1 ,"198 Nguyễn Văn Nghi, P.7, Gò Vấp, TP. HCM" ,"Tối thiểu 20k",10,"Deal giảm tới 15k",R.drawable.b,true));
        mListShop.add(new Shop("Coop - food",15 ,"" ,"Tối thiểu 30k",10,"Deal giảm tới 15k",R.drawable.d,false));
        mListShop.add(new Shop("7 -  eleven : Cua hang tien loi",50,"","Toi thieu 20k",10,"Deal giam toi 15k",R.drawable.h,false));
        mListShop.add(new Shop("Big C",30 ,"" ,"Tối thiểu 20k",15,"Deal giảm tới 15k",R.drawable.a,false));
        mListShop.add(new Shop("Circle K",20 ,"" ,"Tối thiểu 10k",20,"Deal giảm tới 15k",R.drawable.b,true));
        mListShop.add(new Shop("Cooky market",1 ,"198 Nguyễn Văn Nghi, P.7, Gò Vấp, TP. HCM" ,"Tối thiểu 20k",10,"Deal giảm tới 15k",R.drawable.b,true));
        mListShop.add(new Shop("Coop - food",15 ,"" ,"Tối thiểu 30k",10,"Deal giảm tới 15k",R.drawable.d,false));

        mShopAdapter = new ShopAdapter(mListShop);
        mRcvShop.setAdapter(mShopAdapter);
        mRcvShop.setHasFixedSize(true);
        mRcvShop.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mShopAdapter.setOnItemClick(new OnItemClick() {
            @Override
            public void onClick(int position) {
                mListShop.remove(position);
                mShopAdapter.notifyItemRemoved(position);
            }
        });
    }
}