package oopGitTasks;

public class CarMainMethod {

	public static void main(String[] args) {
		CarSubclass car1=new CarSubclass();
		
		//Set the values of the car
		car1.setBrand("Toyota");
		car1.setChassiNo(2546321);
		car1.setEngineCapacity(1000);
		car1.setModel("KSP9");
		car1.setSpeed(100);
		
		//get the output of the car value
		System.out.println("Brand name:" +car1.getBrand());
		System.out.println("Chassi number of the vehicle:" +car1.getChassiNo());
		System.out.println("Engine capacity : " +car1.getEngineCapacity());
		System.out.println("Vehicle model:" +car1.getModel());
		System.out.println("Current speed :" +car1.getSpeed());
		
		car1.accelerate();
		System.out.println("Speed after accelerate : "+car1.speed);
		car1.accelerate();
		System.out.println("Speed after accelerate : "+car1.speed);
		
		System.out.println("Vehicle is going to stop.");
		car1.deccelerate();
		System.out.println("Speed after deccelerate : "+car1.speed);
		car1.deccelerate();
		System.out.println("Speed after deccelerate : "+car1.speed);
		car1.deccelerate();
		System.out.println("Speed after deccelerate : "+car1.speed);
		car1.deccelerate();
		System.out.println("Speed after deccelerate : "+car1.speed);
		car1.deccelerate();
		System.out.println("Speed after deccelerate : "+car1.speed);
		car1.deccelerate();
		System.out.println("Speed after deccelerate : "+car1.speed);
		System.out.println("Vehicle stop.");
		System.out.println("End journey");
	}

}
