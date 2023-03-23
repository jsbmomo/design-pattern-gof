package i_factory;

public class Bow implements Item {
  @Override
  public void use() {
    System.out.println("화살을 멀리서 쐈습니다.");
  }
}
