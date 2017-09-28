public class Employee{
	
	String name;
	int hours;
	double rate;
	Address[] address;

	public Employee(String name, int hours, double rate){
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		address = new Address[6];
	}
	
	public void addAddress(Address newAddress){
		for (int i = 0; i < address.length; i ++){
			if (address[i] == null){
				address[i] = newAddress;
				break;
			}
		}
	}
	
	public String toString(){
		String output = "Name: "+name +"\nHours: "+ hours +"\nRate: $"+ rate +"\nAddress(es):\n";
		for (int i = 0; i < address.length && address[i] != null; i ++){
			output += address[i] +"\n\n";
		}
		return output;
	}
}