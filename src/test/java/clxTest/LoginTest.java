package clxTest;
import utilities.Base;
import clxPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base
{

    @Test(priority = 0)
    public void verifyTitleAndPresence()  {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Welcome to CloudLex");
        LoginPage lp = new LoginPage();

        boolean flag = lp.checkSSOButton();
        Assert.assertTrue(flag);

        boolean flag1= lp.checkUsername();
        Assert.assertTrue(flag1);

        boolean flag2 =lp.checkPassword();
        Assert.assertTrue(flag2);

        boolean flag3= lp.checkVisibilityIcon();
        Assert.assertTrue(flag3);

        boolean flag4 = lp.checkLoginButton();
        Assert.assertTrue(flag4);
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        LoginPage lp = new LoginPage();

        lp.login();
    }

}
