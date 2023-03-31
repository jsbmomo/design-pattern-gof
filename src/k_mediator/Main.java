package k_mediator;

import java.util.Scanner;

/**
 * Mediator 패턴은 중재자 라는 의미를 가지고 있다.
 * 중재자는 각 객체로 부터 상태 변경 통지를 받게 되며,
 * 중재자로부터 복잡한 관계를 단순화 시키는 것이 특징
 */
public class Main {
  public static void main(String[] args) {
    SmartHome home = new SmartHome();

    try (Scanner scan = new Scanner(System.in)) {
      do {
        home.report();

        System.out.println("1) 문 열기");
        System.out.println("2) 문 닫기");
        System.out.println("3) 창문 열기");
        System.out.println("4) 창문 닫기");
        System.out.println("5) 에어컨 켜기");
        System.out.println("6) 에어컨 끄기");
        System.out.println("7) 보일러 켜기");
        System.out.println("8) 보일러 끄기");
        System.out.println("0) 종료");

        System.out.print("명령: ");
        int i = scan.nextInt();

        if (i == 1) home.door.open();
        else if (i == 2) home.door.close();
        else if (i == 3) home.window.close();
        else if (i == 4) home.window.close();
        else if (i == 5) home.aircon.on();
        else if (i == 6) home.aircon.off();
        else if (i == 7) home.boiler.on();
        else if (i == 8) home.boiler.off();
        else break;
      } while (true);
    }
  }
}
