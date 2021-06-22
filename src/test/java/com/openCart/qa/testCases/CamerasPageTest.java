package com.openCart.qa.testCases;
import com.openCart.qa.base.BaseTest;
import com.openCart.qa.pages.CamerasPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CamerasPageTest extends BaseTest {
    public CamerasPageTest() {
        super();}

    @Test
    public void isAvailabilityDisplayed() {
        CamerasPage camera = new CamerasPage(driver);
        camera.pressCameras();
        camera.pressCamera1();
        camera.pressBack();
        camera.pressCamera2();
        Assert.assertEquals(true, camera.isAvailabilityDisplayed());
        System.out.println("Availability: In Stock");}}



