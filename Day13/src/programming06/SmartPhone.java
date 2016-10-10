package programming06;

public class SmartPhone extends Phone {
	String os;
	String version;
	String memory;
	boolean camera;
	boolean bluetooth;

	public SmartPhone(String maker, int price, String type, String os, String version, String memory, boolean camera,
			boolean bluetooth) {
		super(maker, price, type);
		this.os = os;
		this.version = version;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String toString() {
		return super.toString() + "운영체제 타입: " + os + "운영체제 버전: " + version + "내부 메모리 크기: " + memory + "카메라 장착 여부: "
				+ (camera ? "O" : "X") + "블루투스 지원 여부: " + (bluetooth ? "O" : "X");
	}
}