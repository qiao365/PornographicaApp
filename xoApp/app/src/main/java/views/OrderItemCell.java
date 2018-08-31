package views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.example.unkown.xoapp.R;

import java.util.zip.Inflater;

/**
 * Created by duhongxing on 2018/8/30.
 */

public class OrderItemCell extends View {
    private View rootView;
    private ImageView headerImgView;
    public OrderItemCell(Context context){
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        rootView = inflater.inflate(R.layout.order_item,null);
//        headerImgView = (ImageView)rootView.findViewById(R.id.id_order_header);


    }
}
