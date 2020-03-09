package stepdefinition;

import org.openqa.selenium.By;

public class BasePageSD {

    private By rooms = By.id("qf-0q-rooms");
    private By childrenMessage = By.xpath("//div[@class='widget-query-room-children-notice']");

    private By adults=By.id("qf-0q-room-0-adults");
    private By children=By.id("qf-0q-room-0-children");

    public void clickOn(){
        SharedSD.getDriver().findElement(rooms).click();

    }
    public String getMessage(){
       return SharedSD.getDriver().findElement(childrenMessage).getText();

    }
    public void clickOnAdult(){
        SharedSD.getDriver().findElement(adults).click();
    }
    public void clickOnChildren(){
        SharedSD.getDriver().findElement(children).click();
    }
}


