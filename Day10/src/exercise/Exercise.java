/*
  1�� ����  
 .1. �ʵ尪 �ʱ�ȭ
 .2. �޼����� ȣ��� �Ű������� ������ Ÿ���� ���� �ڵ������� ���� �Ѵ�. 
 .3. this�� �ε� ������ �ٸ� �����ڸ� ȣ�� �Ѵ�. 
 .4. ���� static ��� Ư�� ��ü�� �Ҽӵ��� �ʰ� ��ü�� �������� �ʾƵ� ��밡���� ������ �޼��� �տ� static Ű���带 ���δ�.
 .5. ��ü�� ������ ����
 .6. ������ ��ü�� �������� �ʾƵ� ȣ��Ǵ� �޼���� ��ü�ȿ� �����ϴ� �ν��Ͻ� �������� ��� �� �� ����.
 
 2�� ���� 
 2-1
  public class Point {
  private int x, y;
  public Point(int x , int y){ // void�� ���� ���ش�.
  x=x;
  y=y;}}
 
 2-2
  public class MyMath {
	public int getRandom(){
		return (int) Math.random();
	}
	public double getRandom1(){ // �ߺ��޼����̹Ƿ� getRandom�� �̸��� ���� 
		return Math.random();}} // �ߺ��޼���� �ڷ����̳� ��ȯ������ ���� �� �� ������ ��ȯ�� �����δ� ���� �Ұ�

2-3
  
  public class MyClass {
	private static String getName(){ // statice �߰�
		return "MyClass";
	}
	
	public static String getClassName(){
		return getName();}}
// ���� �޼���� Ư�� ��ü�� �Ҽ� ���� �ʰ� ��ü�� �������� �ʾƵ� ��밡���� ������ 
 * �޼��� �տ� static Ű���带 ���δ�.

 */
