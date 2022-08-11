public class JavaClassses {

	public static void main(String[] args) {

		Pet myPet1 = new Pet();
		Pet myPet2 = new Pet("James", 5, "Bloomfield", "dog");
		
		System.out.printf("Name: %s\n", myPet1.getName());
		System.out.printf("Age: %s\n", myPet1.getAge());
		System.out.printf("Location: %s\n", myPet1.getLocation());
		System.out.printf("Type: %s\n\n", myPet1.getType());
		
		myPet1.setName("Seth");
		myPet1.setAge(11);
		myPet1.setLocation("Newark");
		myPet1.setType("cat");

		System.out.printf("Name: %s\n", myPet1.getName());
		System.out.printf("Age: %s\n", myPet1.getAge());
		System.out.printf("Location: %s\n", myPet1.getLocation());
		System.out.printf("Type: %s\n\n", myPet1.getType());

		System.out.printf("Name: %s\n", myPet2.getName());
		System.out.printf("Age: %s\n", myPet2.getAge());
		System.out.printf("Location: %s\n", myPet2.getLocation());
		System.out.printf("Type: %s\n", myPet2.getType());
		
		City myCity1 = new City();
	  City myCity2 = new City("Orange", "Clifton");
		City myCity3 = new City("Wayne", "1845", "Jersey City", "The Garden City");
		
		System.out.println(myCity1.getDetails());
		System.out.println(myCity2.getDetails());
		System.out.println(myCity3.getDetails());
		
		myCity1.setName("Trenton");
		myCity1.setFounded("1912");
		myCity1.setNickname("Trey");

		System.out.println(myCity1.getDetails());
		
		myCity2.setFounded("1867);
		myCity2.setNickname("The Cliff");
		
		System.out.println(myCity2.getDetails());
		
		System.out.println(City.foundedSameYear(myCity1, myCity2));
		System.out.println(City.foundedSameYear(myCity1, myCity3));

	}

}
Footer
