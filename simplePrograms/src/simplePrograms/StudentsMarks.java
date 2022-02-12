package simplePrograms;

public class StudentsMarks {
	
	public void grade(int n) {
		if (n < 25) {
			System.out.println("Grade: F");
		}
		else if (n>=25 && n<=45) {
			System.out.println("Grade: E");
		}
		else if (n>45 && n<=50) {
			System.out.println("Grade: D");
		}
		else if (n>50 && n<=60) {
			System.out.println("Grade: C");
		}
		else if (n>60 && n<=80) {
			System.out.println("Grade: B");
		}
		else {
			System.out.println("Grande: A");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             StudentsMarks obj = new StudentsMarks();
          
              obj.grade(101);
	}

}
