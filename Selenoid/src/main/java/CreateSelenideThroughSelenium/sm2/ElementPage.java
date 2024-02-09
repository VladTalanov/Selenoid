package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * @params ElementPage - отдельный случай PageObject;
 */
public class ElementPage {
    public ElementsCollection elementsPage(){
        return $$x("//button");
    }

    public void deletePost() {
        elementsPage().get(1).click();
    }
    public void editButton(){
        elementsPage().first().click();
    }
}