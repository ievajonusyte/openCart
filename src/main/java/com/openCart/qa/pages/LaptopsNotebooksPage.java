package com.openCart.qa.pages;
import com.openCart.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopsNotebooksPage extends PageObject {

    @FindBy(partialLinkText = "Laptops & Notebooks")
    private WebElement laptops;

    @FindBy(partialLinkText = "Show All Laptops & Notebooks")
    private WebElement showAll;

    @FindBy(linkText= "HP LP30")
    private WebElement laptop1;

    @FindBy (css= "body div[id='product-category'] ul[class='breadcrumb'] li:nth-child(2) a:nth-child(1)")
    private WebElement back;

    @FindBy(linkText= "MacBook")
    private WebElement laptop2;

    @FindBy(partialLinkText= "MacBook A")
    private WebElement laptop3;

    @FindBy(partialLinkText= "MacBook P")
    private WebElement laptop4;

    @FindBy(partialLinkText= "Sony VA")
    private WebElement laptop5;

    @FindBy (xpath = "//*[text()='In Stock']")
    private WebElement availability;

    public LaptopsNotebooksPage(WebDriver driver) {
        super(driver);
    }

    public void pressLaptops() {
        this.laptops.click();}

    public void pressShowAll() {
        this.showAll.click();}

    public void pressLapto1() {
        this.laptop1.click();}

    public void pressBack() {
        this.back.click();}

    public void pressLaptop2() {
        this.laptop2.click();}

    public void pressLaptop3() {
        this.laptop3.click();}

    public void pressLaptop4() {
        this.laptop4.click();}

    public void pressLaptop5() {
        this.laptop5.click();}

    public boolean isAvailabilityDisplayed() {
        this.availability.isDisplayed();
        return true;}}
