package cn.edu.hstc.cs.fruilt;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//创建一个自定义的适配器，继承自ArrayAdapter,并将泛型指定为Fruit类
public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    //该方法用于将上下文、ListView子项布局的id和数据都传递进来
    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
        }
        @Override
        //该方法在每个子项被滚动到屏幕内的时候会被调用
        public View getView(int position, View convertView, ViewGroup parent){
            Fruit fruit=getItem(position);
            View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);//false表示只让我们在父布局中声明的layout属性生效
            ImageView fruitImage=(ImageView) view.findViewById(R.id. fruit_image);
            TextView fruitName=(TextView) view.findViewById(R.id.fruit_name);
            fruitImage.setImageResource(fruit.getImageId());
            fruitName.setText(fruit.getName());
            return view;
        }
}
