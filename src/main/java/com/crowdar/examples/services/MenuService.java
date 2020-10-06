package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.constants.MenuConstants;
import com.crowdar.examples.constants.ProfileConstants;
import org.testng.Assert;

public class MenuService {

    public static void clickMenu(){
        MobileActionManager.click(MenuConstants.MENU_HAMBURGUESA_LOCATOR);
    }

    public static void clickProfileOption(){
        MobileActionManager.waitVisibility(MenuConstants.PROFILE_OPTION_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(MenuConstants.PROFILE_OPTION_LOCATOR));
        MobileActionManager.click(MenuConstants.PROFILE_OPTION_LOCATOR);
        //Validar Título del Perfil
        MobileActionManager.waitVisibility(ProfileConstants.TITLE_PROFILE_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ProfileConstants.TITLE_PROFILE_LOCATOR));
        //Validar Botón Guardar del Perfil
        MobileActionManager.waitVisibility(ProfileConstants.GUARDAR_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ProfileConstants.GUARDAR_BUTTON_LOCATOR));
    }
}
