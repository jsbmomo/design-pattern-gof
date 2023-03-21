package f_singleton;

/**
 * 다른 클래스에서 접근은 가능하지만 생성이 불가능.
 */
public class Main {
  public static void main(String[] args) {
    // King king = new King(); // 신규 생성 불가
    King king = King.getInstance();

    king.say();

    King king2 = King.getInstance();

    if (king == king2) { // 메모리 주소 비교
      System.out.println("같은 객체입니다.");
    }

    System.out.println(king.equals(King.getInstance()));
  }
}
