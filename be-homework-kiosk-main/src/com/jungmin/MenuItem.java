package com.jungmin;

public class MenuItem {   //메뉴아이템의 필드
    private String name;
    private int price;

    public MenuItem(String name, int price) { //생성자 MenuItem  //this 로 필드 name price 받아옴
        this.name = name;
        this.price = price;
    }

    //반환 메서드
    void user() {
        System.out.println(name + price);
    }
    //getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}



