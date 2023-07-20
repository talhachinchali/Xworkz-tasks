class TeacherKiller
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in TeacherKiller");
		
		Teacher teacher1=new Teacher();
		System.out.println(teacher1.subject);
		System.out.println(teacher1.name);
		System.out.println(teacher1.noOfSubjects);
		System.out.println(teacher1.age);
		System.out.println(teacher1.section);
		
		
		teacher1.subject = "Kannada";
		teacher1.name = "Ravi";
		teacher1.noOfSubjects = 4;
		teacher1.age = 28;
		teacher1.section = "10th";
		System.out.println("================After Update===================");
		System.out.println(teacher1.subject);
		System.out.println(teacher1.name);
		System.out.println(teacher1.noOfSubjects);
		System.out.println(teacher1.age);
		System.out.println(teacher1.section);
		
		
		
		System.out.println("**************This is for Second Instance*****************");
		Teacher teacher2=new Teacher();
		System.out.println(teacher2.subject);
		System.out.println(teacher2.name);
		System.out.println(teacher2.noOfSubjects);
		System.out.println(teacher2.age);
		System.out.println(teacher2.section);
		
		teacher2.subject = "Maths";
		teacher2.name = "Shabhana";
		teacher2.noOfSubjects = 3;
		teacher2.age =32;
		teacher2.section = "12th";
		
		System.out.println("================After Update===================");
		System.out.println(teacher2.subject);
		System.out.println(teacher2.name);
		System.out.println(teacher2.noOfSubjects);
		System.out.println(teacher2.age);
		System.out.println(teacher2.section);
	}
}