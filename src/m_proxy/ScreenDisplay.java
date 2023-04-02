package m_proxy;

public class ScreenDisplay implements Display {

  /**
   * 문자를 출력하기 위해 작업이 필요하다고 가정
   * 출력할 데이터를 최대한 모아서, print 메서드를 최소한 호출할 것을 고려해야한다.
   * @param content
   */
  @Override
  public void print(String content) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
