package j_observer;

import java.util.LinkedList;

public abstract class DiceGame {
  protected LinkedList<Player> playersList = new LinkedList<Player>(); // 자식 클래스에서 접근 가능

  public void addPlayer(Player player) {
    playersList.add(player);
  }

  // 주사위를 던져 주사위의 수를 변경 가능
  public abstract void play();
}
