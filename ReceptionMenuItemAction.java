package fr.gouv.agriculture.dag.agorha.action;

import fr.gouv.agriculture.orion.action.navigation.MenuItemAction;
import fr.gouv.agriculture.orion.controller.PageController;
import fr.gouv.agriculture.orion.controller.tab.TabPanelsController;

import java.util.Map;

/**
 * Cette classe action permet la navigation vers l'onglet "Boite de recption" du tabpanel
 *
 * @author david.breant
 */
public class ReceptionMenuItemAction extends MenuItemAction {

    @Override
    public Object execute() throws Exception {

        PageController pageController = (PageController) getController().getContainer();
        Map map =  pageController.getControllers();

        TabPanelsController indexTabPanelsCtrl = (TabPanelsController) map.get("messagerieTPC");
        indexTabPanelsCtrl.selectPanel("reception");

        return super.execute();
    }
}