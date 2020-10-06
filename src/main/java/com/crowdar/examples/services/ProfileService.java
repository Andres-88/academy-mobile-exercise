package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.constants.ProfileConstants;
import org.testng.Assert;

public class ProfileService {

    public static void addEmailAndAddress(String email, String address){
        MobileActionManager.setInput(ProfileConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(ProfileConstants.ADDRESS_INPUT_LOCATOR, address);
    }

    public static void clickAgregarButton(){
        MobileActionManager.click(ProfileConstants.GUARDAR_BUTTON_LOCATOR);
    }

    public static void clickOkAviso(){
        MobileActionManager.waitVisibility(ProfileConstants.OK_AVISO_BUTTON);
        Assert.assertTrue(MobileActionManager.isVisible(ProfileConstants.OK_AVISO_BUTTON));
        MobileActionManager.click(ProfileConstants.OK_AVISO_BUTTON);
    }

    public static void verifyChanges(String email, String address){
        Assert.assertEquals(MobileActionManager.getText(ProfileConstants.EMAIL_INPUT_LOCATOR), email);

        Assert.assertEquals(MobileActionManager.getText(ProfileConstants.ADDRESS_INPUT_LOCATOR), address);
    }
}
