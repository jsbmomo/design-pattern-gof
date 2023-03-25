package j_observer;

public class EvenBetingPlayer extends Player {
  public EvenBetingPlayer(String name) {
    super(name);
  }

  @Override
  public void update(int diceNumber) {
    if (diceNumber % 2 == 0) {
      System.out.println(getName() + " win!");
    }
  }
}
