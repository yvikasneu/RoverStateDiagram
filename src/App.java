public class App {
    public static void main(String[] args) throws Exception {
        RovedControlWithCameraControl control = new RovedControlWithCameraControl(); 

        System.out.println("\n*** navigation controls ***\n");

        control.leftPedalTrice(); // Accelerating Back
        control.maxSpeedReached(); // Constant Acceleration
        control.rightPedalOnce(); // De-Accelerating Rover
        control.speedReachedZero(); // Rest

        System.out.println("\n*** camera controls ***\n");
        // CAMERA CONTROLS
        control.buttonOne5Sec(); // Color Camera Activate
        control.clickButtonOne(); // Takes A Picture
        control.buttonOneTwice(); // Drilling Mode Activated
        control.clickButtonOne(); // DrillingS  Off
        control.clickButtonOne(); // Drilling Started

        System.out.println("");


    }
}
