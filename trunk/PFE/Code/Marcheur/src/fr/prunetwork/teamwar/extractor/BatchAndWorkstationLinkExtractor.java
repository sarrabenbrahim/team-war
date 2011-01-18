/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.prunetwork.teamwar.extractor;

import fr.prunetwork.teamwar.Constants;
import fr.prunetwork.teamwar.entities.Batch;
import fr.prunetwork.teamwar.entities.StoreEntities;
import fr.prunetwork.teamwar.entities.Tracability;
import java.util.Collection;

/**
 *
 * @author garciaf
 */
public class BatchAndWorkstationLinkExtractor {

    public void link() {
        Collection<Batch> batchs = StoreEntities.getBatchs();
        Tracability previous = null;
        for (Batch batch : batchs) {
            for (Tracability tracability : batch.getTracabilitys()) {
                if (tracability.getEvent().equalsIgnoreCase(Constants.BATCH_CONTROL)
                        && (previous != null)) {
                    StoreEntities.getWorkstation(previous.getWorkstationID()).getListOfControls().add(tracability);
                }
                if((tracability.getEvent().equalsIgnoreCase(Constants.QUALITYTASK))){
                    StoreEntities.getWorkstation(tracability.getWorkstationID()).getListOfControls().add(tracability);
                }
                previous = tracability;
            }
        }

    }
}
