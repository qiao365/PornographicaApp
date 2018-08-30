package views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.unkown.xoapp.R;

import java.util.List;

/**
 * Created by duhongxing on 2018/8/30.
 */

public class MyOrderListAdapter extends BaseAdapter {
    private List orderList;
    private Context orderContext;
    private LayoutInflater inflater;

    public MyOrderListAdapter(Context context,List list){
        orderList = list;
        orderContext = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return orderList.size();
    }

    @Override
    public Object getItem(int position) {
        return orderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(R.layout.order_item,null);
        }
        return convertView;
    }
}
