package com.example.y0.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Y0 on 2017/11/6.
 */

public class FruitAdapter extends ArrayAdapter<Fruit>
{
    private int resourseId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super (context,textViewResourceId,objects);
        resourseId = textViewResourceId;
    }
    @Override

    public View getView(int position,View convertView, ViewGroup parent){
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourseId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_name);
            viewHolder.fruitShijian = (TextView) view.findViewById(R.id.shijian);
            viewHolder.fruitXiaoliang = (TextView) view.findViewById(R.id.xiaoliang) ;
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        viewHolder.fruitShijian.setText(fruit.getShijian());
        viewHolder.fruitXiaoliang.setText(fruit.getXiaoliang());
        return view;
    }

    class ViewHolder{

        ImageView fruitImage;
        TextView fruitName;
        TextView fruitShijian;
        TextView fruitXiaoliang;

    }

}
