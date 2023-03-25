package j_observer;

public abstract class Player {
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // 주사위 수
  public abstract void update(int diceNumber);
}
