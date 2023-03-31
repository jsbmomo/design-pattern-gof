package l_momento;

import java.util.Random;
import java.util.StringTokenizer;

/**
 * Memento : 추억, 과거의 기억
 * 객체의 상태를 기억해 두었다가 필요할 때 기억해둔 상태로 객체를 되돌린다.
 * 객체의 상태에 대한 기억은 다른 객체에서도 읽기 전용으로 접근 가능.
 * 객체의 상태를 기억하기 위한 객체 생성은 오직 해당 객체만 가능하다.
 */
public class Main {
  public static void main(String[] args) {
    Walker walker = new Walker(0,0,10,10);
    String[] actions = { "UP", "RIGHT", "DOWN", "LEFT"};
    Random random = new Random();
    double minDistance = Double.MAX_VALUE;
    Walker.Memento memento = null;

    while(true) {
      String action = actions[random.nextInt(4)];
      double distance = walker.walk(action);

      System.out.println(action + " " + distance);

      if (distance == 0.0) {
        break;
      }

      if (minDistance > distance) {
        minDistance = distance;
        memento = walker.createMemento();
      } else {
        if (memento != null) {
          walker.restoreMemento(memento);
        }
      }
    }

    System.out.println("Walker's path: " + walker);
  }
}
