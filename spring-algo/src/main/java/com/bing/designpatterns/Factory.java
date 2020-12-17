package com.bing.designpatterns;


/**
 * @Description: 工厂模式
 * @Author: gby_dev（耿兵洋）
 * @CreateDate: 2020/12/17 20:57
 * @Version: 1.0
 */
public class Factory {

    private static final String RECTANGLE = "rectangle";
    private static final String CIRCLE = "circle";

    // 接口
    interface Shape {
        void draw();
    }

    // 实现类1
    class Rectangle implements Shape{
        @Override
        public void draw() {
            System.out.println("Rectangle draw()方法");
        }
    }

    // 实现类2
    class Circle implements Shape{

        @Override
        public void draw() {
            System.out.println("Circle draw()方法");
        }
    }

    // 根据指定参数生成实体类对象 
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase(RECTANGLE)){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(CIRCLE)){
            return new Circle();
        }
        return null;
    }
}
