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
package bookingSystem.gui;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JTable;

import bookingSystem.main.Contractor;
import bookingSystem.main.ControlSystem;

public class ContractorTable {

    public static final String[] columnNames = { "id", "Name", "Owner", "Address", "Rate" };
    public static Object[][] rowData;
    private static List<Contractor> contractors = ControlSystem.getContractors();
    private static JTable table;

    private ContractorTable() {
    }

    public static JTable create() {
        if (table != null) {
            return table;
        }
        return createTable();
    }

    private static JTable createTable() {
        int numberOfContractors = contractors.size();
        rowData = new Object[numberOfContractors][columnNames.length];
        for (int i = 1; i < numberOfContractors; i++) {
            Contractor contractor = contractors.get(i);
            populateRowData(rowData, contractor, i);
        }
        table = new JTable(rowData, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(100, 50));
        table.setFillsViewportHeight(true);
        table.setVisible(true);
        return table;
    }

    private static void populateRowData(Object[][] rowData, Contractor contractor, int row) {
        rowData[row][0] = contractor.getId();
        rowData[row][1] = contractor.getName();
        rowData[row][2] = contractor.getOwner();
        rowData[row][3] = contractor.getAddress();
        rowData[row][4] = contractor.getRate();
    }
}