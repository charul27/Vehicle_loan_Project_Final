class Person{
	int age;
	char gender;
	String name;
	String email;
	void printPerson()
	{
		System.out.println("gender is  :"+gender);
		System.out.println("name is  :"+ name);
		System.out.println("age is  :"+ age);
		System.out.println("Email is  :"+ email);
		System.out.println("-------------------------");
	}
}
class Tiger{
	void jump() {
		System.out.println("Tiger is jumping");
	}
}
public class PersonTest4 {
	public static void main(String[] args) {
			   Person2 p1= new Person2();
		        p1.setPerson('M',"MARTIN",23,"martin@gmail.com");
			   Person2 p2= new Person2();
		        p2.setPerson('u',"JUL[]IA",680,"julia@gmail.com");
			   Person2 p3= new Person2();
		        p3.setPerson('M',"JACK",25,"jack@gmail.com");
			   Person2 p4= new Person2();
		        p4.setPerson('F',"RITA",280,"rita@gmail.com");
			}
		}

