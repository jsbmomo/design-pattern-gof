package l_momento;

import java.util.ArrayList;

public class Walker {
  private int currentX, currentY;
  private int targetX, targetY;
  private ArrayList<String> actionList = new ArrayList<String>(); // 가는 길을 기억

  public Walker(int currentX, int currentY, int targetX, int targetY) {
    this.currentX = currentX;
    this.currentY = currentY;
    this.targetX = targetX;
    this.targetY = targetY;
  }

  public double walk(String action) {
    actionList.add(action);

    switch (action) {
      case "UP":
        currentY += 1;
        break;
      case "RIGHT":
        currentX += 1;
        break;
      case "DOWN":
        currentY -= 1;
        break;
      case "LEFT":
        currentX -= 1;
        break;
    }

    return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
  }

  public class Memento {
    private int x, y;
    private ArrayList<String> actionList;
    private Memento() {}
  }

  public Memento createMemento() {
    Memento memento = new Memento();

    memento.x = this.currentX;
    memento.y = this.currentY;
    memento.actionList = (ArrayList<String>) this.actionList.clone(); // 깊은 복사

    return memento;
  }

  public void restoreMemento(Memento memento) {
    this.currentX = memento.x;
    this.currentY = memento.y;
    this.actionList = (ArrayList<String>) this.actionList.clone(); // 깊은 복사
  }

  @Override
  public String toString() {
    return actionList.toString();
  }
}
