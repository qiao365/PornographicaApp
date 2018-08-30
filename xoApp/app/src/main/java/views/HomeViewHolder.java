package views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.unkown.xoapp.R;

/**
 * Created by duhongxing on 2018/8/28.
 */

public class HomeViewHolder extends RecyclerView.ViewHolder {
    private ImageView headerImg;
    private TextView  desText;
    private Button praiseBtn;
    private TextView priceText;
    private View contentView;
    public  HomeViewHolder(Context context, View itemView, ViewGroup group){
        super(itemView);
        contentView = itemView;
        desText = contentView.findViewById(R.id.id_item_text);
        headerImg = contentView.findViewById(R.id.id_item_header);
        praiseBtn = contentView.findViewById(R.id.id_item_praise);
        priceText = contentView.findViewById(R.id.id_item_price);
    }

    public  static HomeViewHolder get(Context context, ViewGroup group){
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_list,group,false);
        HomeViewHolder holder = new HomeViewHolder(context,itemView,group);
        return holder;
    }

    public void fillHomeViewByData(String name){
        headerImg.setBackgroundColor(Color.parseColor("#6495ED"));
        priceText.setText("¥750/次起");
        desText.setText("美女会所嫩模学生白领护士御姐肤白貌美姐");
        System.out.println(name);
    }

    public void detailPage() {

    }
  }
