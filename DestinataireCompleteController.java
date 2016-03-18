package fr.gouv.agriculture.dag.agorha.controller;

import fr.gouv.agriculture.dag.agorha.business.CourrierDestinataire;
import fr.gouv.agriculture.orion.controller.complete.AbstractCompleteController;
import fr.gouv.agriculture.orion.dao.defaults.DefaultBusinessDAO;
import fr.gouv.agriculture.orion.model.CompletionItem;
import fr.gouv.agriculture.orion.security.authentication.spi.RoleForPrincipal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by abir.hmida on 29/12/2015.
 */
public class DestinataireCompleteController extends AbstractCompleteController {
    static List<String> destinataires = new ArrayList<String>();



    @Override
    protected void populateModel() throws Exception {

        String queryString = getQuery().toString();

        DefaultBusinessDAO defaultBusinessDAO = new DefaultBusinessDAO();

        Collection<RoleForPrincipal> resultats = defaultBusinessDAO.getPersistenceService().find("from RoleForPrincipal where orionCredentials.lastName like %" + queryString, false);

        for (RoleForPrincipal roleForPrincipal : resultats) {
            CompletionItem completionItem = new CompletionItem(roleForPrincipal);
            getCompletionData().add(completionItem);
        }

    }

    @Override
    public void  0endCompletion(Object value) {


    }
}
