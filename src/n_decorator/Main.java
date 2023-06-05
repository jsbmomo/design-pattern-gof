package n_decorator;

/**
 * Decorator : 장식하는 사람
 * 기능을 마치 장식처럼 계속 추가할 수 있는 패턴
 * 기능을 실행 중에 동적으로 변경 또는 확장할 수 있는 패턴
 */
public class Main {

  public static void main(String[] args) {
    Strings strings = new Strings();

    strings.add("Hello~");
    strings.add("Side Decorator");
    strings.add("Line Number Decorator");
    strings.add("Box Decorator");

    // strings.print();

    Item decorator = new SideDecorator(strings, '\"');
    decorator = new LineNumberDecorator(decorator);
    decorator = new BoxDecorator(decorator);

    decorator.print();
  }
}
