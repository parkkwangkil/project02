package programming07;

public class Graduate extends Student {
	private boolean assistant;
	private double scholarship;

	public Graduate(String name, int num, String major, int grade, double score, boolean assistant,
			double scholarship) {
		super(name, num, major, grade, score);
		this.assistant = assistant;
		this.scholarship = scholarship;
		if (scholarship <= 1 && 0 <= scholarship) {

		}
	}

	public String getAssistant() {
		if (assistant == true)
			return "��������";
		else
			return "��������";
	}

	public boolean isAssistant() {
		return assistant;
	}

	public void setAssistant(boolean assistant) {
		this.assistant = assistant;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
		if (0 <= scholarship && scholarship <= 1);
	}

	public String toString() {
		return super.toString() + "��������:" + getAssistant() + " ���бݺ���:" + scholarship;
	}
}
