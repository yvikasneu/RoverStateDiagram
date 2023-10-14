public class RovedControlWithCameraControl extends RoverControl {

    enum DrillMode {
        DRILL_ON, 
        DRILL_OFF
    }

    public DrillMode drillMode; 


    public RovedControlWithCameraControl() {
        System.out.println("");
    }

    public void clickButtonTwo() {
        this.cameraState = CameraState.IDLE;
        System.out.println("Camera State IDLE");
    }

    public void buttonOne5Sec(){
       if(this.cameraState == CameraState.CAMERA_COLOR || this.cameraState == CameraState.CAMERA_16MM){
        System.out.println("Active Temporizer");
       }else {
        this.cameraState = CameraState.CAMERA_COLOR;
        System.out.println("Color Camera Activate");
       }
    }

    public void buttonOne10Sec(){
        this.cameraState = CameraState.CAMERA_16MM; 
        System.out.println("16MM Camera Activate");
    }

    public void clickButtonOne(){
        if(this.cameraState == CameraState.CAMERA_COLOR || this.cameraState == CameraState.CAMERA_16MM){
           System.out.println("Takes A Picture");
        }
        else if(this.cameraState == CameraState.DRILL_STATE){
            if(drillMode == DrillMode.DRILL_ON){
                System.out.println("DrillingS  Off");
                drillMode = DrillMode.DRILL_OFF; 
            }else {
                System.out.println("Drilling Started");
                drillMode = DrillMode.DRILL_ON; 
            }
        }
    }

    public void buttonOneTwice(){
        this.drillMode = DrillMode.DRILL_ON; 
        this.cameraState = CameraState.DRILL_STATE; 
        System.out.println("Drilling Mode Activated");
    }

    


    
}
