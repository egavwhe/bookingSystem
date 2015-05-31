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

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

import bookingSystem.main.Contractor;
import bookingSystem.main.ControlSystem;

public class MainWindow extends JFrame {

    public JTable table;
    public JScrollPane scrollPane;
    public static final String[] columnNames = { "ID", "Name", "Owner", "Address", "Rate" };
    public Object[][] rowData;

    public void populateRowData(Object[][] rowData, Contractor contractor, int row) {
        rowData[row][0] = contractor.getId();
        rowData[row][1] = contractor.getName();
        rowData[row][2] = contractor.getOwner();
        rowData[row][3] = contractor.getAddress();
        rowData[row][4] = contractor.getRate();
    }

    public void createTable() {
        List<Contractor> contractors = ControlSystem.getContractors();
        int numberOfContractors = contractors.size();
        rowData = new Object[numberOfContractors][5];

        for (int i = 1; i < numberOfContractors; i++) {
            Contractor contractor = contractors.get(i);
            populateRowData(rowData, contractor, i);
        }

        table = new JTable(rowData, columnNames);

        table.setPreferredScrollableViewportSize(new Dimension(100, 50));
        table.setFillsViewportHeight(true);
        table.setVisible(true);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    public MainWindow() {
        //        ContractorTable.create();
        createTable();
        //        initQuitButton();
        setTitle("Traffic System");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initQuitButton() {
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        createLayout(quitButton);
    }

    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));

        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
    }

}
