package views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.unkown.xoapp.R;

import java.util.zip.Inflater;

/**
 * Created by duhongxing on 2018/8/30.
 */

public class OrderItemCell {
//    private View rootView;
    private ImageView headerImgView;
    private TextView nameText;
    private TextView addressText;
    private TextView priceText;
    private TextView telephoneText;

    public void setupViews(View parent){
        headerImgView = parent.findViewById(R.id.id_order_header);
        nameText = parent.findViewById(R.id.id_order_username);
        addressText = parent.findViewById(R.id.id_order_address);
        priceText = parent.findViewById(R.id.id_order_price);
        telephoneText = parent.findViewById(R.id.id_order_telephone);
    }

//    public OrderItemCell(Context context){
//        super(context);
////        LayoutInflater inflater = LayoutInflater.from(context);
////        rootView = inflater.inflate(R.layout.order_item,null);
////        headerImgView = rootView.findViewById(R.id.id_order_header);
////        nameText = rootView.findViewById(R.id.id_order_username);
////        addressText = rootView.findViewById(R.id.id_order_address);
////        priceText = rootView.findViewById(R.id.id_order_price);
////        telephoneText = rootView.findViewById(R.id.id_order_telephone);
//    }
    public void configOrderItem(Object itemData){

    }
 }
