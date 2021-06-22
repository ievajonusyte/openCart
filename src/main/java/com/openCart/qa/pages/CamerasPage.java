package com.openCart.qa.pages;
import com.openCart.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CamerasPage extends PageObject {
    @FindBy(linkText = "Cameras")
    private WebElement cameras;

    @FindBy(linkText= "Canon EOS 5D")
    private WebElement camera1;

    @FindBy (xpath = "//div[@id='product-category']//li[2]//a[1]")
    private WebElement back;

    @FindBy (linkText = "Nikon D300")
    private WebElement camera2;

    @FindBy (xpath = "//*[text()='In Stock']")
    private WebElement availability;

    public CamerasPage(WebDriver driver) {
        super(driver);
    }
    public void pressCameras() {
        this.cameras.click();}

    public void pressCamera1() {
        this.camera1.click();}

    public void pressBack() {
        this.back.click();}

    public void pressCamera2() {
        this.camera2.click();}

    public boolean isAvailabilityDisplayed() {
        this.availability.isDisplayed();
        return true;}}
