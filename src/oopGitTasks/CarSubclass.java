package oopGitTasks;

public class CarSubclass {

	int speed, engineCapacity;
	String brand, color, model;
	int chassiNo;
	
	//defining set methods
	
	public  void setSpeed(int speed){
		this.speed=speed;
	}
	
	public  void setEngineCapacity(int engCapacity){
		this.engineCapacity=engCapacity;
	}
	
	public  void setBrand(String brand){
		this.brand=brand;
	}
	
	public  void setModel(String color){
		this.color=color;
	}
	public  void setChassiNo(int ChasNo){
		this.chassiNo=ChasNo;
	}
	
	//defining get methods
	
	public  int getSpeed(){
		return this.speed;
	}
	
	public int getEngineCapacity() {
	return this.engineCapacity;
	}
	
	public  String getBrand(){
		return this.brand;
	}
	
	public  String getModel(){
		return this.color;
	}
	public  int getChassiNo(){
		return this.chassiNo;
	}
	
	public void accelerate() {
		speed=speed+10;
	}
	public void deccelerate() {
		speed=speed-20;
	}
	
	
}
