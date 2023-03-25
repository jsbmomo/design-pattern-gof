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

    Item item2 = factory.create("sword");
    if (item2 != null) item2.use();

    Item item3 = factory.create("sword");
    if (item3 != null) item3.use();

    // 칼의 최대 생성 개수가 3개이므로, 여기서부터는 생성 실패
    Item item4 = factory.create("sword");
    if (item4 != null) item4.use();

    Item item5 = factory.create("sword");
    if (item5 != null) item5.use();

    factory.create("shield");
    factory.create("shield");
    factory.create("shield");
    factory.create("shield");

    factory.create("bow");
    factory.create("bow");
    factory.create("bow");
  }
}
