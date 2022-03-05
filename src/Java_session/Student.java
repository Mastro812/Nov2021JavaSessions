package Java_session;

public class Student {

	// WAF(means write the function)
	// name - getStudentMarks
	// input parameter - name(String)
	// return - marks(integer)

//	public int getStudentMarks(String studentName) {
//		System.out.println("getting marks of student :" + studentName);
//		
//		if (studentName.equals("Sameer")) {
//			return 90;
//		}
//		else if (studentName.equals("Harshini")) {
//			return 95;
//		}
//		else if (studentName.equals("Parag")) {
//			return 10;
//		}
//		else if (studentName.equals("Naruto")) {
//			return 60;
//		}
//		else {
//			System.out.println("please pass the correct student name");
//			return -1;
//		}
//	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student st = new Student();
//		int m = st.getStudentMarks("Sameer");
//		System.out.println(m+5-3);
//		m = st.getStudentMarks("Diyva");
//		System.out.println(m);
//		if(m== -1) {
//			System.out.println("Dont generate the marksheet");
//		}
//
//		System.out.println("-----------------------------");
//	}
//	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks of student :" + studentName);
		int marks = -1;
		if (studentName.equals("Sameer")) {
			marks = 90;
		}
		else if (studentName.equals("Harshini")) {
			marks = 95;
		}
		else if (studentName.equals("Parag")) {
			marks = 10;
		}
		else if (studentName.equals("Naruto")) {
			marks = 60;
		}
		else {
			System.out.println("please pass the correct student name");
		}
		return marks;
	
   }

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		int m = st.getStudentMarks("Sameer");
		System.out.println(m+5-3);
		m = st.getStudentMarks("Diyva");
		System.out.println(m);
		
       }
}
