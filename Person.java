class Person{
	
	
	String name;
	String gender;
	int age;
	//default constructor
	public Person(String pn, String gen, int ag){
		name = pn;
		gender = gen;
		age = ag;
		System.out.println("person constructor is invoked");
	}
	public  void character(){
		System.out.println("person");
	}
}