package views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

/**
 * Created by duhongxing on 2018/8/28.
 */

public abstract class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<String> homeDataList;//要显示的数据
    private Context homeContext;
    private RecyclerView bindRecycle;
    private AdapterView.OnItemClickListener homeItemClickListener;

    public HomeAdapter(Context context,List list){
        homeContext = context;
        homeDataList = list;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomeViewHolder holder = HomeViewHolder.get(homeContext,parent);
        return holder;
    }


    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            convert((HomeViewHolder)holder,homeDataList.get(position));
    }
    @Override
    public int getItemCount() {
        return homeDataList.size();
    }

    public void convert(HomeViewHolder holder,String s){
        holder.fillHomeViewByData(s);
    }

}
