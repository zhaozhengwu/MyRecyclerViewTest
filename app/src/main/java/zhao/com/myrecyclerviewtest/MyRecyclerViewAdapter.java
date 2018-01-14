package zhao.com.myrecyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by zhaozhengwu on 2018/1/14.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{

    private List<Bean> item;
    public MyRecyclerViewAdapter(List<Bean> item){
        this.item=item;
    }
    @Override
    public MyRecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
       final MyViewHolder myViewHolder=new MyViewHolder(view);
        myViewHolder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text点击事件
                int positon=myViewHolder.getAdapterPosition();
                Toast.makeText(view.getContext(),item.get(positon).getName(),Toast.LENGTH_SHORT).show();
            }
        });
        myViewHolder.myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //item/点击事件
            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.text.setText(item.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        private View myView;
        public MyViewHolder(View itemView) {
            super(itemView);
            text= (TextView) itemView.findViewById(R.id.text);
            myView=itemView;
        }
    }
}
