package com.openCart.qa.pages;
import com.openCart.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabletsPage extends PageObject {

    @FindBy(partialLinkText= "Table")
    private WebElement tablets;

    @FindBy(partialLinkText = "Samsung Galaxy Tab 1")
    private WebElement tablet1;

    @FindBy (xpath = "//*[text()='In Stock']")
    private WebElement availability;

    public TabletsPage(WebDriver driver) {
        super(driver);
    }

    public void pressTablets() {
        this.tablets.click();}

    public void pressTablet1() {
        this.tablet1.click();}

    public boolean isAvailabilityDisplayed() {
        this.availability.isDisplayed();
        return true;}}
