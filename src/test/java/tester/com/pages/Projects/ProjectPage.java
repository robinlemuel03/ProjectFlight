package tester.com.pages.Projects;

import tester.com.pages.CommonPage;
import tester.com.utils.WebUI;
import org.openqa.selenium.By;

public class ProjectPage extends CommonPage {

    public ProjectPage() {
    }

    private String pageText = "Projects";

    //Project Page Element
    private By projectMenu = By.xpath("//span[normalize-space()='Projects']");
    private By searchInput = By.xpath("//input[@type='search']");

    public void searchByValue(String value) {
        WebUI.clearText(searchInput);
        WebUI.setText(searchInput, value);
        WebUI.sleep(1);
    }

}
