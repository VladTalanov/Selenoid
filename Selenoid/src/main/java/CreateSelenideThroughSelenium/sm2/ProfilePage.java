package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;

public class ProfilePage {
    public SelenideElement buttonProfile(){
        return Selenide.$x("//div[@class='mdc-menu mdc-menu-surface']/..");
    }

    public SelenideElement buttonInListFirst(){
        return Selenide.$x("//span[contains(text(),'Profile')]");
    }

    public SelenideElement buttonEdit(){
        return Selenide.$x("//button[@title='More options']");
    }

    public SelenideElement editProfile(){
        return Selenide.$x("//input[@type='file']");
    }

    public SelenideElement buttonSave(){
        return Selenide.$x("//button[@type='submit']");
    }

    public SelenideElement inputBirthday(){
        return Selenide.$x("//input[@type='date']");
    }

    public SelenideElement buttonCloseWindowFrame(){
        return Selenide.$x("//button[@data-mdc-dialog-action='close']");
    }


    public String getNewBirthdayDate() {
        return inputBirthday().shouldBe(visible).getText();
    }

    public void openProfilePage() {
        buttonProfile().shouldBe(visible).click();
        buttonInListFirst().click();
    }

    public void clickEditButtonInProfilePage(String path) {
        buttonEdit().shouldBe(visible).click();
        Selenide.sleep(5000);
        editProfile().shouldBe(visible).uploadFile(new File(path));
        Selenide.sleep(5000);
        buttonSave().shouldBe(visible).click();
    }

    public void changeBirthday(String newBirthday) {
        buttonEdit().shouldBe(visible).click();
        Selenide.sleep(5000L);
        inputBirthday().shouldBe(visible).sendKeys(newBirthday);
    }

    public void buttonSaveClick() {
        Selenide.sleep(5000L);
        buttonSave().click();
    }

    public void closeFrameWindow() {
        Selenide.sleep(5000L);
        buttonCloseWindowFrame().click();
    }
}
