package j_observer;

/**
 * 상태 변경 시, 상태 변경에 관심이 있는 관찰자(Observer)에게 알려준다.
 */
public class Main {
  public static void main(String[] args) {
    DiceGame diceGame = new FairDiceGame();

    Player player1 = new EvenBetingPlayer("첫 번째 사용자");
    Player player2 = new EvenBetingPlayer("제이슨");
    Player player3 = new EvenBetingPlayer("본");

    diceGame.addPlayer(player1);
    diceGame.addPlayer(player2);
    diceGame.addPlayer(player3);

    for (int i = 0; i < 5; i++) {
      diceGame.play();
      System.out.println();
    }
  }
}
