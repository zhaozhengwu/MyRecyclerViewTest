package zhao.com.myrecyclerviewtest;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Bean> listBean=new ArrayList<>();
    private  MyRecyclerViewAdapter myRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,4);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        initData();

        myRecyclerViewAdapter=new MyRecyclerViewAdapter(listBean);
        recyclerView.setAdapter(myRecyclerViewAdapter);

    }
    public void initData(){
        for (int i=0;i<100;i++){
            Bean bean=new Bean();
            bean.setName("recycler");
            Bean bean1=new Bean();
            bean1.setName("recyclerffffdddddddddddddddfffffffffffffffffffffffffffffffffffffffrsfffffffffffffffff");
            listBean.add(bean);
            listBean.add(bean1);
        }
    }
}
