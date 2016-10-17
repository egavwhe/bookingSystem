package bookingSystem.gui;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        //        createTable();
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

}