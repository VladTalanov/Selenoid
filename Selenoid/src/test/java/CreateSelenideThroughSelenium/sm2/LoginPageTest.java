package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends AbstractTest {


    @Test
    @DisplayName("Change Birthday to new")
    void changeNameToNew() {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.loginInSystem(getLogin(), getPassword());
        ProfilePage profilePage = Selenide.page(ProfilePage.class);
        profilePage.openProfilePage();
        profilePage.changeBirthday("08.02.2024");
        profilePage.buttonSaveClick();
        profilePage.closeFrameWindow();
        Assertions.assertEquals("08.02.2024",profilePage.getNewBirthdayDate());
    }
}