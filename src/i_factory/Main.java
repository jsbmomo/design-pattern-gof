package i_factory;

/**
 * 객체 생성을 위한 패턴으로,
 * 객체 생성에 필요한 과정을 템플릿처럼 정해놓고 각 과정을 다양하게 구현.
 * 생성할 클래스를 유연하게 정할 수 있고
 */
public class Main {
  public static void main(String[] args) {
    Factory factory = new ItemFactory();

    Item item1 = factory.create("sword");
    if (item1 != null) item1.use();
  }
}
