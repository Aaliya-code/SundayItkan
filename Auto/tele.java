@Autonomous

public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor motorLeft;
    DcMotor motorRight;
    ColorSensor color1;
    DistanceSensor distance1;
    BNO055IMU imu;

@Override
    public void runOpMode() {
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
      motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
      motorRight = hardwareMap.get(DcMotor.class, "motorRight");
      
      motorLeft.setDirection(DcMotor.Direction.REVERSE);
      waitForStart();
      // Put run blocks here
      while (opModeIsActive()) {
        frontLeft.setPower(0.7);
        frontRight.setPower(0.7);
        motorLeft.setPower(0.7);
        motorRight.setPower(0.7);
        sleep(1000);
        
        frontLeft.setPower(0.0);
        frontRight.setPower(0.0);
        motorLeft.setPower(0.0);
        motorRight.setPower(0.0);
      }
    }
    
}




@TeleOp')

public class PJTest extends LinearOpMode {



	DcMotor backLeft;
	DcMotor backRight;
	DcMotor frontLeft;
	DcMotor frontRight;


@Override
	public void runOpMode() {
	

	backLeft = hardwareMap.get(DcMotor.class, "bl");
	backRight = hardwareMap.get(DcMotor.class, "br");
	frontLeft = hardwareMap.get(DcMotor.class, "fl");
	frontRight = hardwareMap.get(DcMotor.class, "fr");

	// motorLeft.setDirection(DcMotor.Direction.REVERSE);
	// Put initialization blocks here
	waitForStart();
	// Put run blocks here
	while (opModeIsActive()) {

	//test_motor.setPower(this.gamepad1.left_stick_y);

	float x = this.gamepad1.left_stick_x * -1;
	float y = this.gamepad1.right_stick_y * -1;

		telemetry.addData("Status, "x: " + x + "y: " + y);
		telemetry.update();
		
		// if(y >= 0.8 || y <= 1.0


	    
	    frontLeft.setPower(x - y);
            frontRight.setPower(x + y);
            backLeft.setPower(x + y);
            backRight.setPower(x - y);
            
