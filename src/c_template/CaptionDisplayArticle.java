package c_template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate {
  public CaptionDisplayArticle(Article article) {
    super(article);
  }

  @Override
  protected void title() {
    System.out.println("TITLE : " + article.getTitle());
  }

  @Override
  protected void content() {
    System.out.println("CONTENT : ");

    ArrayList<String> content = article.getContent();

    for (String line : content) {
      System.out.println("   " + line);
    }
  }

  @Override
  protected void footer() {
    System.out.println("FOOTER : " + article.getFooter());
  }
}
