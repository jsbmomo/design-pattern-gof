package b_strategy;

/**
 * Strategy 패턴은 하나의 기능을 구성하는 특정 부분을
 * 실행 중 다른 부분으로 바꿀 수 있는 방법.
 */
public class Main {
  public static void main(String[] args) {
    SumPrinter cal = new SumPrinter();

    cal.print(new SimpleSumStrategy(), 10);
    cal.print(new GaussSumStrategy(), 10);
  }
}
