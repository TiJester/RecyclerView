package com.example.recyclerview;

import android.widget.RelativeLayout;

public class RecyclerViewItem { // создаем поля для каждого элемента RecyclerView
    private  int imageResource;
    private  String text1;
    private String text2;

    // создаем конструктор
    public RecyclerViewItem (int imageResource, String text1, String text2){
        // Инициализация полей данного класса
        this.imageResource = imageResource;
        this.text1 = text1;
        this.text2 = text1;
    }

    // Так как поля закрыты, создаем публичные методы
    public int getImageResource(){
        return imageResource;
    }
    public String getText1(){
        return text1;
    }
    public String getText2(){
        return text2;
    }
}
