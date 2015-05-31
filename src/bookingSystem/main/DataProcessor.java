/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package bookingSystem.main;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    /**
     * @param rawData
     *
     */
    public static List<Contractor> organiseData(List<String> rawData) {
        List<Contractor> contractors = new ArrayList<>();
        for (String line : rawData) {
            String[] contractorData = line.split(",");
            Contractor contractor = new Contractor(contractorData);
            contractors.add(contractor);
        }
        return contractors;
    }
}
