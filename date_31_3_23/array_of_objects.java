package date_31_3_23;

class student{
	
	int rollno;
	String name;
	int mark;
}

public class array_of_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1 = new student();
		s1.rollno=1;
		s1.name="dharun";
		s1.mark=88;
		
		student s2 = new student();
		s2.rollno=1;
		s2.name="ajith";
		s2.mark=68;
		
		student s3 = new student();
		s3.rollno=1;
		s3.name="arun";
		s3.mark=98;
		
		student students[] = new student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].rollno+" : "+students[i].name+" : "+students[i].mark);
		}

	}

}
