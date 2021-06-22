package com.openCart.qa.testCases;
import com.openCart.qa.base.BaseTest;
import com.openCart.qa.pages.TabletsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabletsPageTest extends BaseTest {
    public TabletsPageTest() {
        super();}

    @Test
    public void isAvailabilityDisplayed() {
        TabletsPage tablet = new TabletsPage(driver);
        tablet.pressTablets();
        tablet.pressTablet1();
        Assert.assertEquals(true, tablet.isAvailabilityDisplayed());
        System.out.println("Availability: In Stock");}}

