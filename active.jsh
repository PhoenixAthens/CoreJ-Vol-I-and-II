public class Person{
	private String name;
	private int age;
	public Person(){
		this.name = null;
		this.age = 0;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public void setAge(int newAge){
		this.age = newAge;
	}
}
class Student extends Person{
	private String id;
	private int credits;
	public Student(){
		super();
		this.id="$$";
		this.credits = 0;
	}
	public Student(String name, int age, String id, int credits ){
		super(name,age);
		this.id = id;
		this.credits = credits;
	}
	public String getId(){
		return this.id;
	}
	public int getCredits(){
		return this.credits;
	}
	public void setID(String updatedID){
		this.id = updatedID;
	}
	public void setCredits(int newCredits){
		this.credits = newCredits;
	}
}
Person p1 = new Person("anthony",23);
Student s1 = new Student("Joe",12,"$1234",180);