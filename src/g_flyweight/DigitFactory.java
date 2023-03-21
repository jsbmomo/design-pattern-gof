package g_flyweight;

/**
 * 원하는 숫자에 대한 Digit 객체를 요청하면,
 * 해당 객체를 전달하는 기능 담당.
 */
public class DigitFactory {
  private Digit[] pool = new Digit[] {
      null, null, null, null, null, null, null
  };

  public Digit getDigit(int n) {
    if (pool[n] != null) { // 생성된 적이 있다면 해당 객체를 반환
      return pool[n];
    } else {

      String fileName = String.format("./src/g_flyweight/data/%d.txt", n);
      Digit digit = new Digit(fileName);
      pool[n] = digit;
      return digit;
    }
  }
}
