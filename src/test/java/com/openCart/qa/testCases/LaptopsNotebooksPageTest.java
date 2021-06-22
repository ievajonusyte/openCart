package com.openCart.qa.testCases;
import com.openCart.qa.base.BaseTest;
import com.openCart.qa.pages.LaptopsNotebooksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsNotebooksPageTest extends BaseTest {
    public LaptopsNotebooksPageTest() {
        super();}
    @Test
    public void isAvailabilityDisplayed() {
        LaptopsNotebooksPage laptop = new LaptopsNotebooksPage(driver);
        laptop.pressLaptops();
        laptop.pressShowAll();
        laptop.pressLapto1();
        laptop.pressBack();
        laptop.pressLaptop2();
        laptop.pressBack();
        laptop.pressLaptop3();
        laptop.pressBack();
        laptop.pressLaptop4();
        laptop.pressBack();
        laptop.pressLaptop5();
        Assert.assertEquals(true, laptop.isAvailabilityDisplayed());
        System.out.println("Availability: In Stock");}}
