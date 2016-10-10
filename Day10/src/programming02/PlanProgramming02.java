package programming02;

public class PlanProgramming02 {

	public static void main(String[] args) {
		Plane plan1 = new Plane("A","B",112);
		Plane plan2 = new Plane("A","A102",500);
		Plane plan3 = new Plane("B","B102",580);
		plan1.setProduct("에어버스");
		plan1.setModel("A380");
		plan1.setCustomer(500);
		plan1.setCustomer(100);
		plan2.setProduct("에어버스");
		plan2.setModel("A380");
		plan2.setCustomer(500);
		plan2.setCustomer(100);
		plan3.setProduct("에어버스");
		plan3.setModel("A380");
		plan3.setCustomer(500);
		plan3.setCustomer(100);
		System.out.println(plan1.toString());
		System.out.println(plan2.toString());
		System.out.println(plan3.toString());
		int n = Plane.getplaens();
		System.out.println("생성된 비행기 수 : " + n);
	}
}