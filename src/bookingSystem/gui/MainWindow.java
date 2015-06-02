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

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        createTable();
        //        initQuitButton();
        setTitle("Contractor Booking System");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createTable() {
        JTable contractorTable = ContractorTable.create();
        JScrollPane scrollPane = new JScrollPane(contractorTable);
        add(scrollPane);
    }

    //    private void createLayout(JComponent... arg) {
    //        Container pane = getContentPane();
    //        GroupLayout gl = new GroupLayout(pane);
    //        pane.setLayout(gl);
    //        gl.setAutoCreateContainerGaps(true);
    //        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
    //        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
    //    }

    //    private void initQuitButton() {
    //        JButton quitButton = new JButton("Quit");
    //        quitButton.addActionListener(new ActionListener() {
    //            @Override
    //            public void actionPerformed(ActionEvent event) {
    //                System.exit(0);
    //            }
    //        });
    //        createLayout(quitButton);
    //    }
}