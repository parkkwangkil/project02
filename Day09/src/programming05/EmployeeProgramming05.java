package programming05;

public class EmployeeProgramming05 {

	public static void main(String[] args) {
		Employee emp = new Employee();
			String n = "박광길";
			emp.setName(n);
			String t = "010-xxxx-yyyy";
			emp.setTel(t);
			int s = 900000000;
			emp.setSalary(s);
			System.out.println("이름: "+n+" "+"전화번호: "+t+" "+"연봉:"+s+" ");
			
		}

	}


