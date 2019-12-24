package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.utils.BrowserHelper;

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

	public By dropdownlist_Parent = By.xpath("//label[contains(text(),'Parent')]/../..//b");
	public By dropdownlist_Status = By.xpath("//label[contains(text(),'Status')]/../..//b");
	public By dropdownlist_Access = By.xpath("//label[contains(text(),'Access')]/../..//b");
	public By dropdownlist_Language = By.xpath("//label[contains(text(),'Language')]/../..//b");
	public By dropdownlist_Layout = By.xpath("//label[contains(text(),'Layout')]/../..//b");
	public By dropdownlist_Robots = By.xpath("//label[contains(text(),'Robots')]/../..//b");
	public By dropdownlist_Create = By.xpath("//label[contains(text(),'Create')]/../..//b");
	public By dropdownlist_Delete = By.xpath("//label[contains(text(),'Delete')]/../..//b");
	public By dropdownlist_Edit = By.xpath("//label[contains(text(),'Edit')]/../..//b");
	public By dropdownlist_Edit_State = By.xpath("//label[contains(text(),'Edit State')]/../..//b");
	public By dropdownlist_Edit_Own = By.xpath("//label[contains(text(),'Edit Own')]/../..//b");
	public By dropdownlist_Category = By.xpath("//label[contains(text(),'Category')]/../..//b");
	public By dropdownlist_Image_Float = By.xpath("//label[contains(text(),'Image Float')]/../..//b");
	public By dropdownlist_Show_Title = By.xpath("//label[contains(text(),'Show Title')]/../..//b");
	public By dropdownlist_Linked_Titles = By.xpath("//label[contains(text(),'Linked Titles')]/../..//b");
	public By dropdownlist_Show_Tags = By.xpath("//label[contains(text(),'Show Tags')]/../..//b");
	public By dropdownlist_ShowIntroText = By.xpath("//label[contains(text(),'Show Intro Text')]/../..//b");
	public By dropdownlist_PositionofArticleInfo = By.xpath("//label[contains(text(),'Position of Article Info')]/../..//b");
	public By dropdownlist_ArticleInfoTitle = By.xpath("//label[contains(text(),'Article Info Title')]/../..//b");
	public By dropdownlist_ShowCategory = By.xpath("//label[contains(text(),'Show Category')]/../..//b");
	public By dropdownlist_LinkCategory = By.xpath("//label[contains(text(),'Link Category')]/../..//b");
	public By dropdownlist_ShowParent = By.xpath("//label[contains(text(),'Show Parent')]/../..//b");
	public By dropdownlist_LinkParent = By.xpath("//label[contains(text(),'Link Parent')]/../..//b");
	public By dropdownlist_ShowAssociations = By.xpath("//label[contains(text(),'Show Associations')]/../..//b");
	public By dropdownlist_ShowAuthor = By.xpath("//label[contains(text(),'Show Author')]/../..//b");
	public By dropdownlist_LinkAuthor = By.xpath("//label[contains(text(),'Link Author')]/../..//b");
	public By dropdownlist_ShowCreateDate = By.xpath("//label[contains(text(),'Show Create Date')]/../..//b");
	public By dropdownlist_ShowModifyDate = By.xpath("//label[contains(text(),'Show Modify Date')]/../..//b");
	public By dropdownlist_ShowPublishDate = By.xpath("//label[contains(text(),'Show Publish Date')]/../..//b");
	public By dropdownlist_ShowNavigation = By.xpath("//label[contains(text(),'Show Navigation')]/../..//b");
	public By dropdownlist_ShowIcons = By.xpath("//label[contains(text(),'Show Icons')]/../..//b");
	public By dropdownlist_ShowPrint = By.xpath("//label[contains(text(),'Show Print')]/../..//b");
	public By dropdownlist_ShowEmail = By.xpath("//label[contains(text(),'Show Email')]/../..//b");
	public By dropdownlist_ShowVoting = By.xpath("//label[contains(text(),'Show Voting')]/../..//b");
	public By dropdownlist_ShowHits = By.xpath("//label[contains(text(),'Show Hits')]/../..//b");
	public By dropdownlist_ShowUnauthorisedLinks = By.xpath("//label[contains(text(),'Show Unauthorised Links')]/../..//b");
	public By dropdownlist_PositioningoftheLinks = By.xpath("//label[contains(text(),'Positioning of the Links')]/../..//b");
	public By dropdownlist_ShowPublishingOptions = By.xpath("//label[contains(text(),'Show Publishing Options')]/../..//b");
	public By dropdownlist_ShowArticleOptions = By.xpath("//label[contains(text(),'Show Article Options')]/../..//b");
	public By dropdownlist_AdministratorImagesandLinks = By.xpath("//label[contains(text(),'Administrator Images and Links')]/../..//b");
	public By dropdownlist_FrontendImagesandLinks = By.xpath("//label[contains(text(),'Frontend Images and Links')]/../..//b");


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
		return BrowserHelper.driver.findElement(By.xpath(String.format(_iconPublish, title))).isDisplayed();
	}
	public boolean checkIconUnpublishDisplayed(String title) {
		return BrowserHelper.driver.findElement(By.xpath(String.format(_iconUnpublish, title))).isDisplayed(); 
	}
	
	public void click_button(By btn) {
		BrowserHelper.driver.findElement(btn).click();
	}
	public void clickBtnNew() {
		BrowserHelper.driver.findElement(_btnNew).click();
	}

	public void edit() {
		BrowserHelper.driver.findElement(_btnEdit).click();
	}

	public void clickBtnPublish() {
		BrowserHelper.driver.findElement(_btnPublish).click();
	}

	public void clickBtnUnpublish() {
		BrowserHelper.driver.findElement(_btnUnpublish).click();
	}

	public void clickBtnArchive() {

		BrowserHelper.driver.findElement(_btnArchive).click();
	}

	public void checkin() {
		BrowserHelper.driver.findElement(_btnCheckin).click();
	}

	public void clickBtnTrash() {

		BrowserHelper.driver.findElement(_btnTrash).click();
	}

	public void batch() {
		BrowserHelper.driver.findElement(_btnBatch).click();
	}

	public void options() {
		BrowserHelper.driver.findElement(_btnOptions).click();
	}

	public void help() {
		BrowserHelper.driver.findElement(_btnHelp).click();
	}

	public void rebuild() {
		BrowserHelper.driver.findElement(_btnRefresh).click();
	}

	public void clickBtnSave() {
		BrowserHelper.driver.findElement(_btnSave).click();
	}

	public void clickBtnSaveAndClose() {
		BrowserHelper.driver.findElement(_btnSaveAndClose).click();
	}

	public void clickSaveAndNew() {
		BrowserHelper.driver.findElement(_btnSaveAndNew).click();
	}

	public void cancel() {
		BrowserHelper.driver.findElement(_btnCancel).click();
	}

	public void gotoHome() {
		BrowserHelper.driver.findElement(menu_ControlPanel).click();
	}

	public void gotoSystem() {
		BrowserHelper.driver.findElement(menu_System).click();
	}

	public void clickUsers() {
		BrowserHelper.driver.findElement(menu_Users).click();
	}

	public void clickMenus() {
		BrowserHelper.driver.findElement(menu_Menus).click();
	}

	public void clickContent() {
		BrowserHelper.driver.findElement(menu_Content).click();
	}

	public void clickComponents() {
		BrowserHelper.driver.findElement(menu_Components).click();
	}

	public void clickExtensions() {
		BrowserHelper.driver.findElement(menu_Extensions).click();
	}

	public void clickHelp() {
		BrowserHelper.driver.findElement(menu_Help).click();
	}

	public void gotoNewArticle() {
		BrowserHelper.driver.findElement(menu_NewArticle).click();
	}

	public void gotoArticles() {
		BrowserHelper.driver.findElement(menu_Articles).click();
	}

	public void gotoCategories() {
		BrowserHelper.driver.findElement(menu_Categories).click();
	}

	public void gotoMedia() {
		BrowserHelper.driver.findElement(menu_Media).click();
	}

	public void gotoMenus_menubar() {
		BrowserHelper.driver.findElement(menu_Menu_s).click();
	}

	public void gotoModules() {
		BrowserHelper.driver.findElement(menu_Modules).click();
	}

	public void gotoUsers() {
		BrowserHelper.driver.findElement(menu_Users).click();
	}

	public void gotoNoUrgent() {
		BrowserHelper.driver.findElement(menu_NoUrgentRequests).click();
	}

	public void gotoGlobal() {
		BrowserHelper.driver.findElement(menu_Global).click();
	}

	public void gotoTemplates() {
		BrowserHelper.driver.findElement(menu_Templates).click();
	}

	public void gotoLanguage() {
		BrowserHelper.driver.findElement(menu_Languages).click();
	}

	public void gotoIntallExtensions() {
		BrowserHelper.driver.findElement(menu_IntallExtensions).click();
	}

	public void clickBanner() {
		BrowserHelper.driver.findElement(_linkBanners).click();
	}

	public void clickWeblinks() {
		BrowserHelper.driver.findElement(_linkWebLinks).click();
	}

	//check after create an entry with alert message 
	public boolean checkSaved() {
		return BrowserHelper.driver.findElement(mess_Saved).isDisplayed();
	}
	public boolean checkPublished() {
		return BrowserHelper.driver.findElement(mess_Published).isDisplayed();
	}
	public boolean checkTrashed() {
		return BrowserHelper.driver.findElement(mess_Trashed).isDisplayed();
	}
	public boolean checkArchived() {
		return BrowserHelper.driver.findElement(mess_Archived).isDisplayed();
	}
	public  boolean checkCheckedin() {
		return BrowserHelper.driver.findElement(mess_Checkedin).isDisplayed();
	}
	public boolean checkUnpublished() {
		return BrowserHelper.driver.findElement(mess_Unpublished).isDisplayed();
	}
	
	//check if an entry created
	public boolean checkCreationByTitle(String title) {
		BrowserHelper.driver.findElement(_txtFilterSearch).clear();
		BrowserHelper.driver.findElement(_txtFilterSearch).sendKeys(title);
		BrowserHelper.driver.findElement(_btnSearch).click();
		
		String xpath = String.format("//table//a[contains(text(),'%s')]", title);
		return BrowserHelper.driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	public void clickAnEntryWithTitle(String title) {
		
		BrowserHelper.driver.findElement(_txtFilterSearch).sendKeys(title);
		BrowserHelper.driver.findElement(_btnSearch).click();
		
		String xpath = String.format("//table//a[contains(text(),'%s')]", title);
		BrowserHelper.driver.findElement(By.xpath(xpath)).click();
		
	}
	public void selectCheckboxWithTitle(String title) {
		
		BrowserHelper.driver.findElement(_txtFilterSearch).clear();
		BrowserHelper.driver.findElement(_txtFilterSearch).sendKeys(title);
		BrowserHelper.driver.findElement(_btnSearch).click();
		
		String xpath = String.format("//table//a[contains(text(),'%s')]/../..//input", title);
		if(!BrowserHelper.driver.findElement(By.xpath(xpath)).isSelected())
		{
			BrowserHelper.driver.findElement(By.xpath(xpath)).click();
		}
	}
	
	//a[normalize-space(text())='A Time to Kill']
	
	public void waitForFilter(int seconds){
		WebDriverWait wait = new WebDriverWait(BrowserHelper.driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated
		              (_divFilter));
	}
	
	public static void logout() {
		BrowserHelper.driver.findElement(user_menu).click();
		BrowserHelper.driver.findElement(logout_menu).click();
	}
	
	public void clickBtnSearchTools() throws InterruptedException{
		BrowserHelper.driver.findElement(_btnSearchTools).click();
		Thread.sleep(1000);
	}
	
	public void clickBtnClear(){
		BrowserHelper.driver.findElement(_btnClear).click();
	}
	
	public void selectStatus(String status){
		BrowserHelper.driver.findElement(_divStatus).click();
		BrowserHelper.driver.findElement(By.xpath(String.format(_liStatus, status))).click();
	}
}
