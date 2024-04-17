package com.jungmin;

import java.util.Scanner;

public class Kiosk {  //MenuItme 의 생성자 할당까지 ok
    private final MenuItem menuItem1 = new MenuItem("김밥", 1000);
    private final static MenuItem menuItem2 = new MenuItem("계란 김밥", 1500);
    private final static MenuItem menuItem3 = new MenuItem("충무 김밥", 1000);
    private final static MenuItem menuItem4 = new MenuItem("떡볶이", 2000);

//여기부터   게터로 메뉴아이템의 생성자에게 값을 MenuItem 의 값에 넣어주는 것

//    abstract class userInput {
//        abstract void userChoiceName();
//    }

//    String choiceName1 = menuItem1.getName();
//    String choiceName2 = menuItem2.getName();
//    String choiceName3 = menuItem3.getName();
//    String choiceName4 = menuItem4.getName();
//
//    int choicePrice1 = menuItem1.getPrice();
//    int choicePrice2 = menuItem2.getPrice();
//    int choicePrice3 = menuItem3.getPrice();
//    int choicePrice4 = menuItem4.getPrice();

//    public void userPrint() {
//
//        System.out.println(choiceName1 + choicePrice1 );
//    }


    // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
    public void print() {    //void 를 하면 반환만 되니까 print 할 거면 void 타입으로 만든다
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(40));
    }

    // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
    //입력받기 + 값 반환
    public int ChoiceMenu() {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
        Scanner scanner = new Scanner(System.in);
        int resultMenu;
        resultMenu = scanner.nextInt();
        return resultMenu;
    } //여기서 사용자가 입력한 값을 저장해야 나중에 호출 할 수 있을텐데 ..

    // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.

    void print2(){
        System.out.println("메뉴의 수량을 입력해주세요. 최대 주문 가능 수량은 99개입니다.");
    }
    public int ChoiceNum() {
        Scanner scanner = new Scanner(System.in);
        int resultAmount;
        resultAmount = scanner.nextInt();
        return resultAmount;

    }

    // 음식 주문을 위한 메서드를 정의할 수 있습니다.
    public int order(int menuNum, int count) {  //메서드 파라미터 시그니처
        int result = 0;
        switch (menuNum) {
            case 1:
                System.out.printf("김밥을 %d개를 선택했습니다.",count);
                // count = ChoiceNum() *1000 이렇게 했는데
                //ChoiceNum 이 입력값 받는 것까지 포함돼서 입력을 2번 해야 실행됐다
                //result 값 새로 만들어서 할당해주면 해결된다.
                //count 는 매개변수로 받아서 설정했으니 count = count * 1000 으로 하면 안 된다.
                result = count * 1000;
//                System.out.println(count);
                break;

            case 2:
                result = count * 1500;
                System.out.printf("계란 김밥을 %d개를 선택했습니다.",count);
//                System.out.println(count);
                break;

            case 3:
                result = count * 1000;
                System.out.printf("충무 김밥을 %d개를 선택했습니다.",count);
//                System.out.println(count);
                break;

            case 4:
                result = count * 2000;
                System.out.printf("떡볶이을 %d개를 선택했습니다.",count);
//                System.out.println(count);
                break;


            // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.



        }
        return result;
    }
}





//public int order(int menuNum, int count) {  //메서드 파라미터 시그니처
//    System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
//    System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
//    switch (menuNum) {
//        case 1:
//            System.out.println("김밥을 선택했습니다.");
//            System.out.println("가격을 입력해주세요");
//
//            break;
//
//    }
//
//
//    // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
//
//
//    return menuNum;
//}
//}
