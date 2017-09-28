public class Main{

	public static void main(String[] args){
		
		Employee o1 = new Employee("Falcao", 40, 15.50);
		
		o1.addAddress(new Address("Queen", 48, "K1P1N2"));
		o1.addAddress(new Address("King Edward", 800, "K1N6N5"));
		System.out.println(o1);
	}

}