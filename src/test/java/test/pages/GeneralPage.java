package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.utils.Constants;

public class GeneralPage {
	private By _btnSearchTools = By.xpath("//button[normalize-space(text())='Search Tools']");
	private By _divStatus = By.xpath("//select[@id='filter_state']/../div");
	private By _btnClear = By.xpath("//button[normalize-space(text())='Clear']");
	private By _divFilter = By.xpath("div[class^='js-stools-container-filters']");
	private String _liStatus = "//div[contains(@id,'filter_state')]//li[text()='%s']";
	public By _btnNew = By.id("toolbar-new");
	public By _btnEdit = By.id("toolbar-edit");
	public By _btnPublish = By.id("toolbsar-publish");
	public By _btnUnpublish = By.id("toolbar-unpublish");
	public By _btnArchive = By.id("toolbar-archive");
	public By _btnCheckin = By.id("toolbar-checkin");
	public By _btnTrash = By.id("toolbar-trash");
	public By _btnBatch = By.id("toolbar-batch");
	public By _btnOptions = By.id("toolbar-options");
	public By _btnHelp = By.id("toolbar-help");
	public By _btnRefresh = By.id("toolbar-refresh");
	public By _btnSave = By.id("toolbar-apply");
	public By _btnSaveAndClose = By.id("toolbar-save");
	public By _btnSaveAndNew = By.id("toolbar-save-new");
	public By _btnCancel = By.id("toolbar-cancel");

	public By _txtTitle = By.id("jform_title");
	public By _txtAlias = By.id("jform_alias");
	public By _txtUrl = By.id("jform_url");
	public By _txtFilterSearch = By.id("filter_search");
	public By _btnSearch = By.xpath("//span[@class='icon-search']");

	public By _dropdownlist_Status = By.xpath("//label[contains(text(),'Status')]/../..//b");
	
	// items in dropdownlist
	public By status_Published = By.xpath("//li[text()='Published']");
	public By status_Unpublished = By.xpath("//li[text()='Unpublished']");
	public By status_Archived = By.xpath("//li[text()='Archived']");
	public By status_Trashed = By.xpath("//li[text()='Trashed']");

	public By category_Uncategorised = By.xpath("//li[text()='Uncategorised']");
	public By category_SampleDataArticles = By.xpath("//li[text()='Sample Data-Articles']");

	public By feature_yes = By.id("jform_featured0");
	public By feature_no = By.id("jform_featured1");

	// content in iframe
	public By txtarea_iframe = By.id("jform_description_ifr");
	public By txtarea_content = By.xpath("//body[@id='tinymce']");

	// menu bar
	private static By menu_ControlPanel = By.xpath("//a[contains(@class,'admin-logo')]");
	private static By menu_System = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'System')]");
	private static By menu_Users = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Users')]");
	private static By menu_Menus = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Menus')]");
	private static By menu_Content = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Content')]");
	private static By menu_Components = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Components')]");
	private static By menu_Extensions = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Extensions')]");
	private static By menu_Help = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Help')]");
	// left menu Control Panel
	private static By menu_NewArticle = By.xpath("//span[contains(text(),'New Article')]/..");
	private static By menu_Articles = By.xpath("//span[contains(text(),'Articles')]/..");
	private static By menu_Categories = By.xpath("//span[contains(text(),'Categories')]/..");
	private static By menu_Media = By.xpath("//span[contains(text(),'Media')]/..");
	private static By menu_Menu_s = By.xpath("//span[contains(text(),'Menu(s)')]/..");
	private static By menu_Modules = By.xpath("//span[contains(text(),'Modules')]/..");
	private static By menu_NoUrgentRequests = By.xpath("//span[contains(text(),'No Urgent Requests')]/..");
	private static By menu_Global = By.xpath("//span[contains(text(),'Global')]/..");
	private static By menu_Templates = By.xpath("//span[contains(text(),'Templates')]/..");
	private static By menu_Languages = By.xpath("//span[contains(text(),'Languages')]/..");
	private static By menu_IntallExtensions = By.xpath("//span[contains(text(),'Intall Extensions')]/..");
	// sub menu 
	public static By _linkWebLinks = By.xpath("//a[@class='dropdown-toggle menu-weblinks']");
	public static By _linkBanners = By.xpath("//a[@class='dropdown-toggle menu-banners']");

	//alert message
	
	private static By mess_Saved = By.xpath("//div[@class='alert-message' and contains(text(),'saved')]");
	private static By mess_Published = By.xpath("//div[@class='alert-message' and contains(text(),'published')]");
	private static By mess_Trashed = By.xpath("//div[@class='alert-message' and contains(text(),'trashed')]");
	private static By mess_Archived = By.xpath("//div[@class='alert-message' and contains(text(),'archived')]");
	private static By mess_Checkedin = By.xpath("//div[@class='alert-message' and contains(text(),'checked in')]");
	private static By mess_Unpublished = By.xpath("//div[@class='alert-message' and contains(text(),'unpublished')]");
	//Logout
	private static By user_menu = By.xpath("//div[contains(text(),'User Menu')]");
	private static By logout_menu = By.linkText("Logout");
	
	private String _iconPublish = "//a[normalize-space(text())='%s']/../..//span[@class='icon-publish']";
	private String _iconUnpublish = "//a[normalize-space(text())='%s']/../..//span[@class='icon-unpublish']";
	
	
	
	public boolean checkIconPublishDisplayed(String title) {
		return Constants.DRIVER.findElement(By.xpath(String.format(_iconPublish, title))).isDisplayed();
	}
	public boolean checkIconUnpublishDisplayed(String title) {
		return Constants.DRIVER.findElement(By.xpath(String.format(_iconUnpublish, title))).isDisplayed(); 
	}
	
	public void click_button(By btn) {
		Constants.DRIVER.findElement(btn).click();
	}
	public void clickBtnNew() {
		Constants.DRIVER.findElement(_btnNew).click();
	}

	public void clickBtnEdit() {
		Constants.DRIVER.findElement(_btnEdit).click();
	}

	public void clickBtnPublish() {
		Constants.DRIVER.findElement(_btnPublish).click();
	}

	public void clickBtnUnpublish() {
		Constants.DRIVER.findElement(_btnUnpublish).click();
	}

	public void clickBtnArchive() {

		Constants.DRIVER.findElement(_btnArchive).click();
	}

	public void clickBtnCheckin() {
		Constants.DRIVER.findElement(_btnCheckin).click();
	}

	public void clickBtnTrash() {

		Constants.DRIVER.findElement(_btnTrash).click();
	}

	public void clickBtnBatch() {
		Constants.DRIVER.findElement(_btnBatch).click();
	}

	public void clickBtnOptions() {
		Constants.DRIVER.findElement(_btnOptions).click();
	}

	public void clickBtnHelp() {
		Constants.DRIVER.findElement(_btnHelp).click();
	}

	public void clickBtnRebuild() {
		Constants.DRIVER.findElement(_btnRefresh).click();
	}

	public void clickBtnSave() {
		Constants.DRIVER.findElement(_btnSave).click();
	}

	public void clickBtnSaveAndClose() {
		Constants.DRIVER.findElement(_btnSaveAndClose).click();
	}

	public void clickSaveAndNew() {
		Constants.DRIVER.findElement(_btnSaveAndNew).click();
	}

	public void clickBtnCancel() {
		Constants.DRIVER.findElement(_btnCancel).click();
	}

	public void gotoHome() {
		Constants.DRIVER.findElement(menu_ControlPanel).click();
	}

	public void gotoSystem() {
		Constants.DRIVER.findElement(menu_System).click();
	}

	public void clickUsers() {
		Constants.DRIVER.findElement(menu_Users).click();
	}

	public void clickMenus() {
		Constants.DRIVER.findElement(menu_Menus).click();
	}

	public void clickContent() {
		Constants.DRIVER.findElement(menu_Content).click();
	}

	public void clickComponents() {
		Constants.DRIVER.findElement(menu_Components).click();
	}

	public void clickExtensions() {
		Constants.DRIVER.findElement(menu_Extensions).click();
	}

	public void clickHelp() {
		Constants.DRIVER.findElement(menu_Help).click();
	}

	public void gotoNewArticle() {
		Constants.DRIVER.findElement(menu_NewArticle).click();
	}

	public void gotoArticles() {
		Constants.DRIVER.findElement(menu_Articles).click();
	}

	public void gotoCategories() {
		Constants.DRIVER.findElement(menu_Categories).click();
	}

	public void gotoMedia() {
		Constants.DRIVER.findElement(menu_Media).click();
	}

	public void gotoMenus_menubar() {
		Constants.DRIVER.findElement(menu_Menu_s).click();
	}

	public void gotoModules() {
		Constants.DRIVER.findElement(menu_Modules).click();
	}

	public void gotoUsers() {
		Constants.DRIVER.findElement(menu_Users).click();
	}

	public void gotoNoUrgent() {
		Constants.DRIVER.findElement(menu_NoUrgentRequests).click();
	}

	public void gotoGlobal() {
		Constants.DRIVER.findElement(menu_Global).click();
	}

	public void gotoTemplates() {
		Constants.DRIVER.findElement(menu_Templates).click();
	}

	public void gotoLanguage() {
		Constants.DRIVER.findElement(menu_Languages).click();
	}

	public void gotoIntallExtensions() {
		Constants.DRIVER.findElement(menu_IntallExtensions).click();
	}

	public void clickBanner() {
		Constants.DRIVER.findElement(_linkBanners).click();
	}

	public void clickWeblinks() {
		Constants.DRIVER.findElement(_linkWebLinks).click();
	}

	//check after create an entry with alert message 
	public boolean checkSaved() {
		return Constants.DRIVER.findElement(mess_Saved).isDisplayed();
	}
	public boolean checkPublished() {
		return Constants.DRIVER.findElement(mess_Published).isDisplayed();
	}
	public boolean checkTrashed() {
		return Constants.DRIVER.findElement(mess_Trashed).isDisplayed();
	}
	public boolean checkArchived() {
		return Constants.DRIVER.findElement(mess_Archived).isDisplayed();
	}
	public  boolean checkCheckedin() {
		return Constants.DRIVER.findElement(mess_Checkedin).isDisplayed();
	}
	public boolean checkUnpublished() {
		return Constants.DRIVER.findElement(mess_Unpublished).isDisplayed();
	}
	
	//check if an entry created
	public boolean checkCreationByTitle(String title) {
		Constants.DRIVER.findElement(_txtFilterSearch).clear();
		Constants.DRIVER.findElement(_txtFilterSearch).sendKeys(title);
		Constants.DRIVER.findElement(_btnSearch).click();
		
		String xpath = String.format("//table//a[contains(text(),'%s')]", title);
		return Constants.DRIVER.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public boolean checkCheckinIconbyTitle(String title) {
		String xpath = String.format("//a[normalize-space(text())='%s']/..//span[@class=\"icon-checkedout\"]", title);
		return Constants.DRIVER.findElements(By.xpath(xpath)).size()==1;
	}
	
	
	public void clickAnEntryWithTitle(String title) {
		
		Constants.DRIVER.findElement(_txtFilterSearch).sendKeys(title);
		Constants.DRIVER.findElement(_btnSearch).click();
		
		String xpath = String.format("//table//a[contains(text(),'%s')]", title);
		Constants.DRIVER.findElement(By.xpath(xpath)).click();
		
	}
	public void selectCheckboxWithTitle(String title) throws InterruptedException {
		
		Constants.DRIVER.findElement(_txtFilterSearch).clear();
		Constants.DRIVER.findElement(_txtFilterSearch).sendKeys(title);
		Constants.DRIVER.findElement(_btnSearch).click();
		String xpath = String.format("//table//a[contains(text(),'%s')]/../..//input", title);
		if(!Constants.DRIVER.findElement(By.xpath(xpath)).isSelected())
		{
			Constants.DRIVER.findElement(By.xpath(xpath)).click();
		}
	}
		
	public void waitForFilter(int seconds){
		WebDriverWait wait = new WebDriverWait(Constants.DRIVER, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(_divFilter));
	}
	
	public static void logout() {
		Constants.DRIVER.findElement(user_menu).click();
		Constants.DRIVER.findElement(logout_menu).click();
	}
	
	public void clickBtnSearchTools() throws InterruptedException{
		Constants.DRIVER.findElement(_btnSearchTools).click();
		Thread.sleep(1000);
	}
	
	public void clickBtnClear(){
		Constants.DRIVER.findElement(_btnClear).click();
	}
	
	public void selectStatus(String status){
		Constants.DRIVER.findElement(_divStatus).click();
		Constants.DRIVER.findElement(By.xpath(String.format(_liStatus, status))).click();
	}
}
