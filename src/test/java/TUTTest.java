import framework.BaseEntity;
import framework.User;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class TUTTest extends BaseEntity {

    @DataProvider(name = "getUser")
    public Object[][] getUser() {
        return new Object[][]{
                {
                        new User("rotf10corp@tut.by", "qq3858122"),
                        new User("rotf20corp@tut.by", "qq3858122")
                }
        };
    }


    @Test(dataProvider = "getUser")
    public void run(User acc1, User acc2) {
        MainPage mainPage = new MainPage();
        mainPage.authorization(acc1.getUserName(), acc1.getPassword());
        LoginPage loginPage = new LoginPage();
        loginPage.logOut();


    }

}
