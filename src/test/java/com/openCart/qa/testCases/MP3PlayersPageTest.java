package com.openCart.qa.testCases;
import com.openCart.qa.base.BaseTest;
import com.openCart.qa.pages.MP3PlayersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MP3PlayersPageTest extends BaseTest {
    public MP3PlayersPageTest() {
        super();}
    @Test
    public void isAvailabilityDisplayed() {
        MP3PlayersPage mp3 = new MP3PlayersPage(driver);
        mp3.pressMp3();
        mp3.pressShowAll();
        mp3.pressMp3first();
        mp3.pressBack();
        mp3.pressMp3second();
        mp3.pressBack();
        mp3.pressMp3third();
        mp3.pressBack();
        mp3.pressMp3forth();
        Assert.assertEquals(true, mp3.isAvailabilityDisplayed());
        System.out.println("Availability: In Stock");}}

