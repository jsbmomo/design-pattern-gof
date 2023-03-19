package e_bridge;

/**
 * 기능 계층과 구현 계층의 분리로 시스템 확장성과 유지보수성을 높이는 패턴
 * 기능 계층 (메서드의 추가 계층) ---- 연결 (Bridge) ---- 구현 계층 (인터페이스의 구현 계층)
 */
public class Main {
  public static void main(String[] args) {
    String title = "복원된 지구";
    String author = "김형준";
    String[] content = {
        "플라스틱 사용의 감소와",
        "바다 생물 어획량 감소로 인하여",
        "지구는 복원되었다."
    };

    Draft draft = new Draft(title, author, content);

    Display display1 = new SimpleDisplay();
    draft.print(display1);

    Display display2 = new CaptionDisplay();
    draft.print(display2);

    String publisher = "출판사";
    int cost = 100;

    /*
     * 새로운 기능에 대해서, 기존의 클래스의 변경없이 추가가능.
     */
    Publication publication = new Publication(title, author, content, publisher, cost);
    publication.print(display1);
  }
}
