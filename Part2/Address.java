public class Address{
	
	String street, postal;
	int number;

	public Address(String street, int number, String postal){
		this.street = street;
		this.number = number;
		this.postal = postal;
	}
	
	public String toString(){
		return "\tStreet: " + street + "\n\tNumber: " + number + "\n\tPostal: "+ postal;
	}
	
}