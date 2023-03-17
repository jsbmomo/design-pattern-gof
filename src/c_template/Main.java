package c_template;

import java.util.ArrayList;

/**
 * Template 패턴은 어떤 기능에 대해 실행되어야할 각 단계에 대한 순서만 정의
 * 각 단계에 대한 세부 구현을 상황에 맞게 다르게 구현할 수 있도록 한다.
 */
public class Main {
  public static void main(String[] args) {
    String title = "디자인 패턴";

    ArrayList<String> content = new ArrayList<>();
    content.add("디자인 패턴은 클래스 간의 효츌적이고 최적화된 관계를 설계하는 것입니다.");
    content.add("각 패턴은 외우기 보다 이해하는 것이 중요합니다.");
    content.add("다양한 패턴을 접하고 반복적으로 이해할수록");
    content.add("각 디자인 패턴에 대한 응용의 폭이 넓어질 것입니다.");

    String footer = "2023.3.17, Developer";

    Article article = new Article(title, content, footer);

    System.out.println("[CASE-1]");
    DisplayArticleTemplate firstCase = new SimpleDisplayArcticle(article);
    firstCase.display();

    System.out.println();

    System.out.println("[CASE-2]");
    DisplayArticleTemplate secondCase = new CaptionDisplayArticle(article);
    secondCase.display();
  }
}
