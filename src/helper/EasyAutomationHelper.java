package helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.Constant;
import utility.DriverUtil;

public class EasyAutomationHelper {

	public void openApp() {
		DriverUtil.setDriver();
		DriverUtil.navigateTo(Constant.URL);
	}
	
	public void closeApp() {
		DriverUtil.closeDriver();
	}
	
	public void getMenuList() {
		List<WebElement> listOfMenu = DriverUtil.getElements(By.xpath("//*[@id='treemenu']//a[contains(text(),'All Examples')]//li"));
		if(listOfMenu.size() > 0) {
			for(WebElement e : listOfMenu) {
				e.getText();
			}
		}
	}
}