package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodAdapter extends BaseAdapter {
    Context ctx;

    public CustomGoodAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    int layoutItem;
    ArrayList<Goods > arrayList;
    @Override
    public int getCount(){
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView txName = view.findViewById(R.id.textView);
        TextView tvShopName = view.findViewById(R.id.textView2);
        ImageView imgGoods = view.findViewById(R.id.imageView);
        txName.setText(arrayList.get(i).getName());
        tvShopName.setText(arrayList.get(i).getShopName());
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());
        return view;
    }
}
