package pom;


import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class FacebookPagePO<WebElement> extends BasePage {

	public FacebookPagePO(WebDriver driver) {
		super(driver);
	
	}
@FindBy(xpath="//a")
private List<WebElement> allLinks;
public int allLinksSize() {
	return allLinks.size();
}
}
