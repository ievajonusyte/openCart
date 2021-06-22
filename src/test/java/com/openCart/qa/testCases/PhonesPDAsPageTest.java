package com.openCart.qa.testCases;
import com.openCart.qa.base.BaseTest;
import com.openCart.qa.pages.PhonesPDAsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhonesPDAsPageTest extends BaseTest {
    public PhonesPDAsPageTest() {
        super();}
    @Test
    public void isAvailabilityDisplayed() {
        PhonesPDAsPage phone = new PhonesPDAsPage(driver);
        phone.pressPhones();
        phone.pressPhone1();
        phone.pressBack();
        phone.pressPhone2();
        phone.pressBack();
        phone.pressPhone3();
        phone.pressBack();
        Assert.assertEquals(true, phone.isAvailabilityDisplayed());
        System.out.println("Availability: In Stock");}}


