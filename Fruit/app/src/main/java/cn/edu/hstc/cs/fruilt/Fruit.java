package cn.edu.hstc.cs.fruilt;
//为实体类，作为ListView适配器的适配类型
public class Fruit{
    private String name;   //水果的名字
    private int imageId;   //水果对应图片的资源id    图片存放于res/drawable
    public Fruit(String name,int imageId){
        this.name =name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
