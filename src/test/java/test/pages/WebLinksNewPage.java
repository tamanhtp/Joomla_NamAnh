package test.pages;

import org.openqa.selenium.By;

import test.utils.Utilities;

public class WebLinksNewPage extends GeneralPage {
	public void createNew(String title, String alias, String url,
			String content, By status) throws InterruptedException {
		Utilities.sendkeys(_txtTitle, title);
		Utilities.sendkeys(_txtAlias, alias);
		Utilities.sendkeys(_txtUrl, url);
		Utilities.findElementInIframe(txtarea_iframe,txtarea_content, content);
		Utilities.click(dropdownlist_Status);
		Utilities.click(status);
	}
}
