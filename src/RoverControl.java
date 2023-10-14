public class RoverControl {

    State state; 
    CameraState cameraState; 

    enum State {
         ACCELERATING_FORWARD, ACCELERATING_BACK, CONSTANT, DE_ACCELERATING, REST,
    }

    enum CameraState {
        CAMERA_COLOR, 
        CAMERA_16MM, 
        IDLE, 
        DRILL_STATE,
    }

    public RoverControl() {
        System.out.println("");
        state = State.REST;
    }

    public void leftPedalOnce() {
        state = State.ACCELERATING_FORWARD;
        System.out.println("Accelerating Forward");
    }

    public void leftPedalTrice() {
        state = State.ACCELERATING_BACK;
        System.out.println("Accelerating Back");
    }

    public void maxSpeedReached(){
        state = State.CONSTANT;
        System.out.println("Constant");
    }

    public void rightPedalTrice(){
        state = State.CONSTANT;
        System.out.println("Constant");
    } 

    public void rightPedalOnce(){
        state = State.DE_ACCELERATING;
        System.out.println("De-Accelerating");
    }

    public void speedReachedZero() {
        state = State.REST; 
        System.out.println("Rest");
    }

    public State getState() {
        return state;
    }
    
}
