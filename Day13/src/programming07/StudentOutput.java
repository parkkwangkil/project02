package programming07;

public class StudentOutput {

	public static void main(String[] args) {
		Student student = new Student("�ڱ���", 0110000, "�İ�", 1, 4.5);
		UnderGraduate undergraduate = new UnderGraduate("�ڱ���", 0110110, "�İ�", 2, 4.5, "����ȸ");
		Graduate graduate = new Graduate("�ڱ���", 010000, "�İ�", 4, 4.4, true, 9.9);
		System.out.println(student);
		System.out.println(undergraduate);
		System.out.println(graduate);
	}
}