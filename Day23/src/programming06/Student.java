package programming06;

public class Student implements Comparable<Student> {
	String name;
	String address;
	String phone;

	public Student(String name, String address, String phone) {
		super();

		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return name + address + phone;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return name.compareTo(s.name);
	}

}
