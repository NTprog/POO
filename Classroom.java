public class Classroom{

	public static void main(String[] args) {
			
		Wilder tom = new Wilder("tom", true);
		System.out.println(tom.whoAmI());
 	
		tom.setAware(false);
		tom.setFirstName("jacky");
		System.out.println(tom.whoAmI());

		Wilder michel = new Wilder("michel");
		michel.setAware(true);
		System.out.println(michel.whoAmI());

	}
	
}
