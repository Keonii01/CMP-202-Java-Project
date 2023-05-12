package PhysicsOOP;
public class Energy extends Physics {
    public static double kineticEnergy(double mass, double velocity){
        return 0.5 * mass * raypow(velocity);
    }

    public static double potentialEnergy(double mass, double height){
        return mass * getGravity() * height;
    }

}
