
package fr.gouv.agriculture.dag.agorha.action;

import fr.gouv.agriculture.orion.controller.PageController;
import fr.gouv.agriculture.orion.controller.tab.TabPanelsController;
import fr.gouv.agriculture.orion.action.navigation.MenuItemAction;

import java.util.Map;

/**
 * Created by abir.hmida on 24/12/2015.
 * Cette classe action permet la navigation vers l'ongler "message envoyées" du tabpanel
 */
public class MessageEnvoyeesMenuItemAction extends MenuItemAction {

    @Override
        public Object execute() throws Exception {

            PageController pageController = (PageController) getController().getContainer();
            Map map =  pageController.getControllers();

            TabPanelsController indexTabPanelsCtrl = (TabPanelsController) map.get("messagerieTPC");
            indexTabPanelsCtrl.selectPanel("message envoyées");

            return super.execute();

        }
    }

