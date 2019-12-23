package test.pages;

import org.openqa.selenium.By;

import test.utils.Utilities;

public class WebLinksNewPage extends GeneralPage {
	public  void createNew(String title, String alias, String url,
			String content, By status) throws InterruptedException {

		Utilities.sendkeys(GeneralPage._txtTitle, title);
		Utilities.sendkeys(GeneralPage._txtAlias, alias);
		Utilities.sendkeys(GeneralPage._txtUrl, url);
		Utilities.findElementInIframe(GeneralPage.txtarea_iframe,
				GeneralPage.txtarea_content, content);
		Utilities.click(GeneralPage.dropdownlist_Status);
		Utilities.click(status);
	}
}
