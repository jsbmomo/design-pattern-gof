package j_observer;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame {
  private Random random = new Random();

  @Override
  public void play() {
    int diceNumber = random.nextInt(6) + 1;

    Iterator<Player> iter = playersList.iterator();

    while (iter.hasNext()) {
      iter.next().update(diceNumber);
    }
  }
}
