package programming07;

public class StudentOutput {

	public static void main(String[] args) {
		Student student = new Student("박광길", 0110000, "컴공", 1, 4.5);
		UnderGraduate undergraduate = new UnderGraduate("박광길", 0110110, "컴공", 2, 4.5, "연구회");
		Graduate graduate = new Graduate("박광길", 010000, "컴공", 4, 4.4, true, 9.9);
		System.out.println(student);
		System.out.println(undergraduate);
		System.out.println(graduate);
	}
}