package test07;

public class MyThread extends Thread {
	private boolean isRun = false;

	public void setRun(boolean isRun) {
		this.isRun = isRun;
	}

	@Override
	public void run() {
		isRun = true;
		int i = 0;
		while (isRun) {
			System.out.println("thread i:" + i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("thread run Á¾·á");
	}
}
