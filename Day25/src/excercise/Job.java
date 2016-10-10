package excercise;
public class Job extends Thread { // 2¹ø 
// public class Job implements Runnable { 1¹ø
	private String name;
		public Job(String name){
			this.name = name;
		}
		public void run() {
			byte n = 0;
		while (true)
		//	System.out.println("" + n++);
			System.out.println(name + n++);
	}


	public static void main(String[] args) {
	//	Thread t = new Thread(new Job());
		Job j = new Job("thread1");
		Job j2 = new Job("thread2");
	//	j.start();
		j2.start();

	}

}
