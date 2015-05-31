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

import java.awt.EventQueue;
import java.util.List;

import bookingSystem.gui.MainWindow;

public class ControlSystem {

    private static List<Contractor> contractors;

    public static void main(String[] args) {
        UI ui = new UI();
        EventQueue.invokeLater(ui);
        List<String> rawData = FileReader.readFile();
        contractors = Contractor.createContractors(rawData);
    }

    public static List<Contractor> getContractors() {
        return contractors;
    }
}

class UI implements Runnable {
    @Override
    public void run() {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }
}