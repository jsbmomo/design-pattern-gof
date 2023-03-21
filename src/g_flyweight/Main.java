package g_flyweight;

/**
 * 매번 생성하지 않고 한 번만 생성하고, 다시 필요할 때 이전에 생성된 객체를 재사용.
 * 객체 생성에 많은 자원이 소모될 때, Flyweight 패턴 사용을 고려가능.
 */
public class Main {
  public static void main(String[] args) {
    Number number = new Number(4343521);
    number.print(5, 5);

    System.out.println("\n\n\n");
  }
}
