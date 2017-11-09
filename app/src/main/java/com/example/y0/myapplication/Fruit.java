package com.example.y0.myapplication;

/**
 * Created by Y0 on 2017/11/6.
 */

public class Fruit {

    private String name;
    private String shijian;
    private String xiaoliang;
    private  int imageId;

    public Fruit(String name,String shijian,String xiaoliang,int imageId){
        this.name=name;
        this.shijian=shijian;
        this.xiaoliang=xiaoliang;
        this.imageId=imageId;
    }

    public String getName(){
        return name;
    }
    public String getShijian(){
        return shijian;
    }
    public String getXiaoliang(){return xiaoliang;}
    public int getImageId(){
        return imageId;
    }
}
