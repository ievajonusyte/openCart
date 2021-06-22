package com.openCart.qa.pages;
import com.openCart.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MP3PlayersPage extends PageObject {

    @FindBy(linkText = "MP3 Players")
    private WebElement mp3;

    @FindBy(linkText = "Show All MP3 Players")
    private WebElement mp3showAll;

    @FindBy(partialLinkText = "iPod Class")
    private WebElement mp3first;

    @FindBy (css =".dropdown-toggle[href='https://demo.opencart.com/index.php?route=product/category&path=34']")
    private WebElement back;

    @FindBy (partialLinkText = "iPod Na")
    private WebElement mp3second;

    @FindBy (partialLinkText = "iPod Shuff")
    private WebElement mp3third;

    @FindBy (partialLinkText = "iPod Shuff")
    private WebElement mp3forth;

    @FindBy (xpath = "//*[text()='In Stock']")
    private WebElement availability;

    public MP3PlayersPage(WebDriver driver) {
        super(driver); }

    public void pressMp3() {
        this.mp3.click();}

    public void pressShowAll() {
        this.mp3showAll.click();}

    public void pressMp3first() {
        this.mp3first.click();}

    public void pressBack() {
        this.back.click();}

    public void pressMp3second() {
        this.mp3second.click();}

    public void pressMp3third() {
        this.mp3third.click();}

    public void pressMp3forth() {
        this.mp3forth.click();}

    public boolean isAvailabilityDisplayed() {
        this.availability.isDisplayed();
        return true;}}
