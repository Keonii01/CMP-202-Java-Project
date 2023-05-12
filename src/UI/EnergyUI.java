package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import PhysicsOOP.Energy;
public class EnergyUI {
    JFrame frame = new JFrame("PhysicsUI Calc");
    JButton kineticEnergyBtn = new JButton("Kinetic Energy");
    JButton potentialEnergyBtn = new JButton("Potential Energy");

    public void MainUI() {
        kineticEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawKineticEnergyUI();
            }
        });

        potentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPotentialEnergyUI();
            }
        });

        frame.add(kineticEnergyBtn);
        frame.add(potentialEnergyBtn);
        frame.setSize(200, 400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    JFrame kineticEnergyFrame = new JFrame("Kinetic Energy");
    JLabel massLabel = new JLabel("Enter mass (kg):");
    JLabel velocityLabel = new JLabel("Enter velocity (m/s):");
    JTextField massTextField = new JTextField();
    JTextField velocityTextField = new JTextField();
    JButton calculateKineticEnergyBtn = new JButton("Calculate");

    public void drawKineticEnergyUI() {
        Energy myObj = new Energy();
        kineticEnergyFrame.setLayout(new GridLayout(3, 2));
        kineticEnergyFrame.setSize(300, 150);

        kineticEnergyFrame.add(massLabel);
        kineticEnergyFrame.add(massTextField);
        kineticEnergyFrame.add(velocityLabel);
        kineticEnergyFrame.add(velocityTextField);
        kineticEnergyFrame.add(calculateKineticEnergyBtn);

        calculateKineticEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double mass = Float.parseFloat(massTextField.getText());
                    double velocity = Float.parseFloat(velocityTextField.getText());
                    double result = myObj.kineticEnergy(mass, velocity);
                    JOptionPane.showMessageDialog(null, "Kinetic Energy = " + result + "kgm^2/s^2");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
            }
        });

        kineticEnergyFrame.setVisible(true);
    }

    JFrame potentialEnergyFrame = new JFrame("Potential Energy");
    JLabel massLabel2 = new JLabel("Enter mass (kg):");
    JLabel heightLabel = new JLabel("Enter height (m):");
    JTextField massTextField2 = new JTextField();
    JTextField heightTextField = new JTextField();
    JButton calculatePotentialEnergyBtn = new JButton("Calculate");

    public void drawPotentialEnergyUI() {
        Energy myObj = new Energy();
        potentialEnergyFrame.setLayout(new GridLayout(3, 2));
        potentialEnergyFrame.setSize(300, 150);
        potentialEnergyFrame.add(massLabel2);
        potentialEnergyFrame.add(massTextField2);
        potentialEnergyFrame.add(heightLabel);
        potentialEnergyFrame.add(heightTextField);
        potentialEnergyFrame.add(calculatePotentialEnergyBtn);

        calculatePotentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double mass = Float.parseFloat(massTextField2.getText());
                    double height = Float.parseFloat(heightTextField.getText());
                    double result = myObj.potentialEnergy(mass, height);
                    JOptionPane.showMessageDialog(null, "Potential Energy = " + result + "J");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
            }
        });

        potentialEnergyFrame.setVisible(true);
    }
}



