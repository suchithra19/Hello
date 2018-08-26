package testscript;

import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;

public class FacebookTest1 extends BaseTest {

	@Test
	public void facebookTest() {
		GooglePagePO googlePO=new GooglePagePO(driver);
		 googlePO.googleSrch("facebook");
		 Facebook
	}
}
