package JAVA18;
class Television{
	private boolean isOn;
	private int volume, channel;
	
	public void setChannel(int c) {
		channel = c;
	}
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int v) {
		volume = v;
	}
	public int getVolume() {
		return volume;
	}
	
	public void turnon() {
		isOn = true;
	}
	public void turnoff() {
		isOn = false;
	}
	
	public String toString() {
		return "���� ���´� " + (isOn == true ? "����" : "����") + " ���� ä����  " + channel + "���� ������ " + volume;
	}
	
}
public class TelevisionTest {
	public static void main (String args[]) {
		Television tv = new Television();
		tv.turnon();
		tv.setChannel(25);
		tv.setVolume(10);
		System.out.println(tv.toString());
	}
}
