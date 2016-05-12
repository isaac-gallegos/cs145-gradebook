// GradebookApp.java v.20160502

class GradebookApp {
	
	public static void main(String[] args) {
		String name_1 = "Isaac";
		Student student_1 =  new Student(name_1);
		System.out.println("High: " + student_1.highest_grade());
		System.out.println("Low: " + student_1.lowest_grade());
		System.out.println("Average: " + student_1.average_grade());
		System.out.println("Letter Grade: " + Student.letter_grade(student_1.average_grade()));
	}

}