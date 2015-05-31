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

public class Contractor {

    private String id;
    private String name;
    private String owner;
    private String address;
    private String rate;

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param owner
     *            the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param rate
     *            the rate to set
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    public Contractor(String[] rawData) {
        //        id = Integer.parseInt(rawData[0]);
        id = rawData[0];
        name = rawData[1];
        owner = rawData[2];
        address = rawData[3];
        rate = rawData[4];
        //        rate = Integer.parseInt(rawData[4]);
    }

    public static List<Contractor> createContractors(List<String> rawData) {
        List<Contractor> contractors = new ArrayList<>();
        for (String line : rawData) {
            String[] contractorData = line.split(",");
            Contractor contractor = new Contractor(contractorData);
            contractors.add(contractor);
        }
        return contractors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }

    public String getRate() {
        return rate;
    }
}
