package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class GeneralPage {

	private static By btn_new = By.id("toolbar-new");
	private static By btn_edit = By.id("toolbar-edit");
	private static By btn_publish = By.id("toolbar-publish");
	private static By btn_unpublish = By.id("toolbar-unpublish");
	private static By btn_archive = By.id("toolbar-archive");
	private static By btn_checkin = By.id("toolbar-checkin");
	private static By btn_trash = By.id("toolbar-trash");
	private static By btn_batch = By.id("toolbar-batch");
	private static By btn_options = By.id("toolbar-options");
	private static By btn_help = By.id("toolbar-help");
	private static By btn_refresh = By.id("toolbar-refresh");
	private static By btn_apply = By.id("toolbar-apply");
	private static By btn_save = By.id("toolbar-save");
	private static By btn_save_new = By.id("toolbar-save-new");
	private static By btn_cancel = By.id("toolbar-cancel");

	public static By txt_title = By.id("jform_title");
	public static By txt_alias = By.id("jform_alias");
	public static By txt_url = By.id("jform_url");
	public static By txt_filter_search = By.id("filter_search");
	public static By btn_search = By.xpath("//span[@class='icon-search']");

	public static By dropdownlist_Parent = By.xpath("//label[contains(text(),'Parent')]/../..//b");
	public static By dropdownlist_Status = By.xpath("//label[contains(text(),'Status')]/../..//b");
	public static By dropdownlist_Access = By.xpath("//label[contains(text(),'Access')]/../..//b");
	public static By dropdownlist_Language = By.xpath("//label[contains(text(),'Language')]/../..//b");
	public static By dropdownlist_Layout = By.xpath("//label[contains(text(),'Layout')]/../..//b");
	public static By dropdownlist_Robots = By.xpath("//label[contains(text(),'Robots')]/../..//b");
	public static By dropdownlist_Create = By.xpath("//label[contains(text(),'Create')]/../..//b");
	public static By dropdownlist_Delete = By.xpath("//label[contains(text(),'Delete')]/../..//b");
	public static By dropdownlist_Edit = By.xpath("//label[contains(text(),'Edit')]/../..//b");
	public static By dropdownlist_Edit_State = By.xpath("//label[contains(text(),'Edit State')]/../..//b");
	public static By dropdownlist_Edit_Own = By.xpath("//label[contains(text(),'Edit Own')]/../..//b");
	public static By dropdownlist_Category = By.xpath("//label[contains(text(),'Category')]/../..//b");
	public static By dropdownlist_Image_Float = By.xpath("//label[contains(text(),'Image Float')]/../..//b");
	public static By dropdownlist_Show_Title = By.xpath("//label[contains(text(),'Show Title')]/../..//b");
	public static By dropdownlist_Linked_Titles = By.xpath("//label[contains(text(),'Linked Titles')]/../..//b");
	public static By dropdownlist_Show_Tags = By.xpath("//label[contains(text(),'Show Tags')]/../..//b");
	public static By dropdownlist_ShowIntroText = By.xpath("//label[contains(text(),'Show Intro Text')]/../..//b");
	public static By dropdownlist_PositionofArticleInfo = By
			.xpath("//label[contains(text(),'Position of Article Info')]/../..//b");
	public static By dropdownlist_ArticleInfoTitle = By
			.xpath("//label[contains(text(),'Article Info Title')]/../..//b");
	public static By dropdownlist_ShowCategory = By.xpath("//label[contains(text(),'Show Category')]/../..//b");
	public static By dropdownlist_LinkCategory = By.xpath("//label[contains(text(),'Link Category')]/../..//b");
	public static By dropdownlist_ShowParent = By.xpath("//label[contains(text(),'Show Parent')]/../..//b");
	public static By dropdownlist_LinkParent = By.xpath("//label[contains(text(),'Link Parent')]/../..//b");
	public static By dropdownlist_ShowAssociations = By.xpath("//label[contains(text(),'Show Associations')]/../..//b");
	public static By dropdownlist_ShowAuthor = By.xpath("//label[contains(text(),'Show Author')]/../..//b");
	public static By dropdownlist_LinkAuthor = By.xpath("//label[contains(text(),'Link Author')]/../..//b");
	public static By dropdownlist_ShowCreateDate = By.xpath("//label[contains(text(),'Show Create Date')]/../..//b");
	public static By dropdownlist_ShowModifyDate = By.xpath("//label[contains(text(),'Show Modify Date')]/../..//b");
	public static By dropdownlist_ShowPublishDate = By.xpath("//label[contains(text(),'Show Publish Date')]/../..//b");
	public static By dropdownlist_ShowNavigation = By.xpath("//label[contains(text(),'Show Navigation')]/../..//b");
	public static By dropdownlist_ShowIcons = By.xpath("//label[contains(text(),'Show Icons')]/../..//b");
	public static By dropdownlist_ShowPrint = By.xpath("//label[contains(text(),'Show Print')]/../..//b");
	public static By dropdownlist_ShowEmail = By.xpath("//label[contains(text(),'Show Email')]/../..//b");
	public static By dropdownlist_ShowVoting = By.xpath("//label[contains(text(),'Show Voting')]/../..//b");
	public static By dropdownlist_ShowHits = By.xpath("//label[contains(text(),'Show Hits')]/../..//b");
	public static By dropdownlist_ShowUnauthorisedLinks = By
			.xpath("//label[contains(text(),'Show Unauthorised Links')]/../..//b");
	public static By dropdownlist_PositioningoftheLinks = By
			.xpath("//label[contains(text(),'Positioning of the Links')]/../..//b");
	public static By dropdownlist_ShowPublishingOptions = By
			.xpath("//label[contains(text(),'Show Publishing Options')]/../..//b");
	public static By dropdownlist_ShowArticleOptions = By
			.xpath("//label[contains(text(),'Show Article Options')]/../..//b");
	public static By dropdownlist_AdministratorImagesandLinks = By
			.xpath("//label[contains(text(),'Administrator Images and Links')]/../..//b");
	public static By dropdownlist_FrontendImagesandLinks = By
			.xpath("//label[contains(text(),'Frontend Images and Links')]/../..//b");

	// items in dropdownlist
	public static By status_Published = By.xpath("//li[text()='Published']");
	public static By status_Unpublished = By.xpath("//li[text()='Unpublished']");
	public static By status_Archived = By.xpath("//li[text()='Archived']");
	public static By status_Trashed = By.xpath("//li[text()='Trashed']");

	public static By category_Uncategorised = By.xpath("//li[text()='Uncategorised']");
	public static By category_SampleDataArticles = By.xpath("//li[text()='Sample Data-Articles']");

	public static By feature_yes = By.id("jform_featured0");
	public static By feature_no = By.id("jform_featured1");

	// content in iframe
	public static By txtarea_iframe = By.id("jform_description_ifr");
	public static By txtarea_content = By.xpath("//body[@id='tinymce']");

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
	private static By submenu_WebLinks = By.xpath("//a[@class='dropdown-toggle menu-weblinks']");
	private static By submenu_Banners = By.xpath("//a[@class='dropdown-toggle menu-banners']");

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
	
	public static void createnew() {
		BrowserHelper.driver.findElement(btn_new).click();
	}

	public static void edit() {
		BrowserHelper.driver.findElement(btn_edit).click();
	}

	public static void publish() {
		BrowserHelper.driver.findElement(btn_publish).click();
	}

	public static void unpublish() {
		BrowserHelper.driver.findElement(btn_unpublish).click();
	}

	public static void archive() {
		BrowserHelper.driver.findElement(btn_archive).click();
	}

	public static void checkin() {
		BrowserHelper.driver.findElement(btn_checkin).click();
	}

	public static void trash() {
		BrowserHelper.driver.findElement(btn_trash).click();
	}

	public static void batch() {
		BrowserHelper.driver.findElement(btn_batch).click();
	}

	public static void options() {
		BrowserHelper.driver.findElement(btn_options).click();
	}

	public static void help() {
		BrowserHelper.driver.findElement(btn_help).click();
	}

	public static void rebuild() {
		BrowserHelper.driver.findElement(btn_refresh).click();
	}

	public static void save() {
		BrowserHelper.driver.findElement(btn_apply).click();
	}

	public static void saveAndClose() {
		BrowserHelper.driver.findElement(btn_save).click();
	}

	public static void saveAndNew() {
		BrowserHelper.driver.findElement(btn_save_new).click();
	}

	public static void cancel() {
		BrowserHelper.driver.findElement(btn_cancel).click();
	}

	public static void goto_home() {
		BrowserHelper.driver.findElement(menu_ControlPanel).click();
	}

	public static void goto_system() {
		BrowserHelper.driver.findElement(menu_System).click();
	}

	public static void goto_users() {
		BrowserHelper.driver.findElement(menu_Users).click();
	}

	public static void goto_menus() {
		BrowserHelper.driver.findElement(menu_Menus).click();
	}

	public static void goto_content() {
		BrowserHelper.driver.findElement(menu_Content).click();
	}

	public static void goto_components() {
		BrowserHelper.driver.findElement(menu_Components).click();
	}

	public static void goto_extensions() {
		BrowserHelper.driver.findElement(menu_Extensions).click();
	}

	public static void goto_help() {
		BrowserHelper.driver.findElement(menu_Help).click();
	}

	public static void goto_newArticle_leftmenu() {
		BrowserHelper.driver.findElement(menu_NewArticle).click();
	}

	public static void goto_articles_leftmenu() {
		BrowserHelper.driver.findElement(menu_Articles).click();
	}

	public static void goto_categories_leftmenu() {
		BrowserHelper.driver.findElement(menu_Categories).click();
	}

	public static void goto_media_leftmenu() {
		BrowserHelper.driver.findElement(menu_Media).click();
	}

	public static void goto_menus_leftmenu() {
		BrowserHelper.driver.findElement(menu_Menu_s).click();
	}

	public static void goto_modules_leftmenu() {
		BrowserHelper.driver.findElement(menu_Modules).click();
	}

	public static void goto_users_leftmenu() {
		BrowserHelper.driver.findElement(menu_Users).click();
	}

	public static void goto_noUrgent_leftmenu() {
		BrowserHelper.driver.findElement(menu_NoUrgentRequests).click();
	}

	public static void goto_global_leftmenu() {
		BrowserHelper.driver.findElement(menu_Global).click();
	}

	public static void goto_templates_leftmenu() {
		BrowserHelper.driver.findElement(menu_Templates).click();
	}

	public static void goto_language_leftmenu() {
		BrowserHelper.driver.findElement(menu_Languages).click();
	}

	public static void goto_intallExtensions_leftmenu() {
		BrowserHelper.driver.findElement(menu_IntallExtensions).click();
	}

	///// sub menu
	public static void goto_submenu_weblinks() {
		BrowserHelper.driver.findElement(submenu_WebLinks).click();
	}
	public static void goto_submenu_Banner() {
		BrowserHelper.driver.findElement(submenu_Banners).click();
	}

	public static void goto_weblinks() {
		goto_components();
		BrowserHelper.driver.findElement(submenu_WebLinks).click();
	}

	
	//check after create an entry with alert message 
	public static boolean checkSaved() {
		return BrowserHelper.driver.findElement(mess_Saved).isDisplayed();
	}
	public static boolean checkPublished() {
		return BrowserHelper.driver.findElement(mess_Published).isDisplayed();
	}
	public static boolean checkTrashed() {
		return BrowserHelper.driver.findElement(mess_Trashed).isDisplayed();
	}
	public static boolean checkArchived() {
		return BrowserHelper.driver.findElement(mess_Archived).isDisplayed();
	}
	public static boolean checkCheckedin() {
		return BrowserHelper.driver.findElement(mess_Checkedin).isDisplayed();
	}
	public static boolean checkUnpublished() {
		return BrowserHelper.driver.findElement(mess_Unpublished).isDisplayed();
	}
	
	//check if an entry created
	public static boolean checkCreationByTitle(String title) {

		BrowserHelper.driver.findElement(GeneralPage.txt_filter_search).sendKeys(title);
		BrowserHelper.driver.findElement(GeneralPage.btn_search).click();
		
		String xpath = String.format("//table//a[contains(text(),'%s')]", title);
		return BrowserHelper.driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	//logout from any page by menubar
	public static void logout() {
		BrowserHelper.driver.findElement(user_menu).click();
		BrowserHelper.driver.findElement(logout_menu).click();
	}

}
