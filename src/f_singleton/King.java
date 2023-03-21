package f_singleton;

public class King {
  private King() {}

  // 자기자신만 해당 필드에 접근가능.
  // 클래스의 이름으로만 접근할 수 있도록 static 선언
  private static King self = null;

  // 멀티스레드에서 동기화를 확보하기 위해 synchronized 사용
  public synchronized static King getInstance() {
    if (self == null) {
      self = new King();
    }
    return self;
  }

  public void say() {
    System.out.println("I am only one...");
  }
}
