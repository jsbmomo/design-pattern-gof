package b_strategy;

/**
 * SumPrinter 는 SumStrategy 인터페이스만 알 뿐,
 * 실제 내부를 구현한 코드를 모른다는 것이다.
 */
public class SumPrinter {
  /**
   * @param strategy 총합을 계산
   * @param N 총합을 구하기 위한 값
   */
  void print(SumStrategy strategy, int N) {
    System.out.printf("The Sum of 1 - %d: ", N);
    System.out.println(strategy.get(N));
  }
}
