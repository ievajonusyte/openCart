package com.openCart.qa.pages;
import com.openCart.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesPDAsPage extends PageObject {

    @FindBy(partialLinkText = "Phones & PD")
    private WebElement phones;

    @FindBy(partialLinkText = "HTC Touch")
    private WebElement phone1;

    @FindBy(partialLinkText = "iPho")
    private WebElement phone2;

    @FindBy(partialLinkText = "Palm Treo P")
    private WebElement phone3;

    @FindBy (xpath = "//*[text()='In Stock']")
    private WebElement availability;

    @FindBy (partialLinkText = "Phones & PD")
    private WebElement back;

    public PhonesPDAsPage(WebDriver driver) {
        super(driver);
    }

    public void pressPhones() {
        this.phones.click();}

    public void pressPhone1() {
        this.phone1.click();}

    public void pressBack() {
        this.back.click();}

    public void pressPhone2() {
        this.phone1.click();}

    public void pressPhone3() {
        this.phone1.click();}

    public boolean isAvailabilityDisplayed() {
        this.availability.isDisplayed();
        return true;}}
