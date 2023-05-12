package PhysicsOOP;
import UI.EnergyUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnergyUI EngUI = new EnergyUI();
        EngUI.MainUI();

        System.out.println("Select what formulae you wish to calculate on");
        System.out.println("For Kinetic Energy, press 1");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Input Mass = ");
                double mass = sc.nextDouble();
                System.out.println("Input Velocity = ");
                double velocity = sc.nextDouble();
                System.out.println(Energy.kineticEnergy(mass, velocity));
                break;

        }
    }
}