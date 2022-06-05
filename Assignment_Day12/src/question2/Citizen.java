package question2;

public class Citizen {
	private String name; 
	private String aadharNumber;
	private String mobileNumber;
	public Citizen() {
	}
	public Citizen(String name, String aadharNumber, String mobileNumber) {
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void showDetails() {
		System.out.println("Name : " + name);
		System.out.println("Aadhar Number : "+ aadharNumber);
		System.out.println("Mobile : "+mobileNumber);
	}
}
