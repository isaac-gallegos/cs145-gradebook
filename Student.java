// Student.java v.20160502
import java.util.Random;
class Student {
	String name;
	double[] grades = new double[10];

	public Student(String n) {
		name = n;
		for (int i = 0; i < 10; i++){
			grades[i] = (Math.random() * 100) + 1;
			System.out.println(grades[i]);
		}
	}

	public double highest_grade() {
		double maximum = grades[0];

        for(int i = 0; i < 10; i++) {
            if (grades[i] > maximum) {
                maximum = grades[i];
            }
        }
        return maximum;
	}

	public double lowest_grade() {
		double minimum = grades[0];

        for(int i = 0; i < 10; i++) {
            if (grades[i] < minimum) {
                minimum = grades[i];
            }
        }
		return minimum;
	}

	public double average_grade() {
		double sum = 0;        
        for(int i = 0; i < 10; i++) {
            sum = sum + grades[i];
        }
        double average = (sum / 10);
		return average;
	}

	static char letter_grade(double average_grade) {
		char let_grade = ' ';
		if (average_grade >= 90 && average_grade <= 100)
			let_grade = 'A';
		if (average_grade >= 80 && average_grade <= 89.99)
			let_grade = 'B';
		if (average_grade >= 70 && average_grade <= 79.99)
			let_grade = 'C';
		if (average_grade >= 60 && average_grade <= 69.99)
			let_grade = 'D';
		else
			let_grade = 'F';
		return let_grade;
	}
}