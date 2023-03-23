package i_factory;

public class Sword implements Item {

  @Override
  public void use() {
    System.out.println("칼로 공격을 했습니다.");
  }
}
