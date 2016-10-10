package programming07;

public class UnderGraduate extends Student {
	private String club;

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public UnderGraduate(String name, int num, String major, int grade, double score, String club) {
		super(name, num, major, grade, score);
		this.club = club;

	}

	public String toString() {

		return "µ¿¾Æ¸® :" + club;

	}
}
