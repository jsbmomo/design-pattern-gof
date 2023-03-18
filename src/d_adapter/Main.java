package d_adapter;

import java.util.ArrayList;

/**
 * 클래스에 대한 코드를 변경할 수 없는 상태에서 적용하는 것을 고려할 수 있다.
 * 코드 변경이 불가능한 Tiger 클래스를 변경하는 예ㅣ
 */
public class Main {
  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Dog("강아지"));
    animals.add(new Cat("털뭉치"));
    animals.add(new Cat("도도"));
    // animals.add(new Tiger("타이온")); // Tiger는 기본 생성자 밖에 없는 상태.
    animals.add(new TigerAdapter("타이온"));

    animals.forEach(Animal::sound);
  }
}
