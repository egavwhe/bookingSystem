package bookingSystem.main;

import java.awt.*;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import bookingSystem.gui.MainWindow;

public class ControlSystem {

    // RMI tutorial!! - https://docs.oracle.com/javase/tutorial/rmi/implementing.html

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
        JPanel panel = new JPanel(new GridLayout(1, 1, 1, 1));
        for (int i = 0; i < 16; i++) {
            JButton btn = new JButton("test");
            btn.setPreferredSize(new Dimension(20, 20));
            panel.add(btn);
        }
        //        mainWindow.pack();
        mainWindow.getContentPane().add(panel);
    }
}