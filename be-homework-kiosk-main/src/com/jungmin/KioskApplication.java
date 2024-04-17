package com.jungmin;

import java.util.Scanner;

public class KioskApplication {
    public static void main(String[] args) {
        //메뉴를 입력하면 그메뉴 선택된다
        //
        // 그 후 수량을 체크하면 선택한 메뉴와 수량이 뜨고 총 금액은 얼마인지 뜬다
        // 만약 수량이 99이상이면 최대 수량 선택은 99개 입니다 라고 뜨고 다시 수량선택으로 돌아간다
        //안내 문구 끝낸다
        //콘솔로 입력받는 class 를 따로만들어서 하기


        Kiosk kiosk = new Kiosk();
        kiosk.print();   //void 타입 호출 할 때 앞에 타입이랑 변수명 넣지 않고 호출 가능
        int menuNum = kiosk.ChoiceMenu();
        kiosk.print2();
        int count = kiosk.ChoiceNum();
        int price = kiosk.order(menuNum, count);
        System.out.printf("총 가격은 %d 입니다",price);







        //다른 class 인 Kiosk 값 가져오는 법
        //생성자 만들고
        // 메뉴 번호를 몇 번 눌렀고 / 몇 개를 산건지 숫자 받아오는 법
        // price 는 마지막 가격







        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.

//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
//        System.out.println("-".repeat(40));
//        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
//        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
//        String inputMenu =scanner.nextLine();
//          String result = "";
//          switch (inputMenu){
//              case "1" :
//                  String userChoice =




//            switch (inputMenu ){
//                case "1" : result   =
//






//            String inputNum =scanner.nextLine();
//        System.out.println();




        }


        }


        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.



