package Models;

public class Weitress {
	
	public String pinCode;
	public String fname;
	public String lname;
	
	public Weitress(String pinCode, String fname, String lname) {
		this.pinCode = pinCode;
		this.fname = fname;
		this.lname = lname;
	}
	
	public String toString() {
		return fname + " " + lname;
	}
	
}
