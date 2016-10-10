/*
  1번 문제  
 .1. 필드값 초기화
 .2. 메서드의 호출시 매개변수의 개수와 타입을 보고 자동적으로 구분 한다. 
 .3. this는 핑드 값이자 다른 생성자를 호출 한다. 
 .4. 정적 static 멤버 특정 객체에 소속되지 않고 객체를 생성하지 않아도 사용가능한 변수나 메서드 앞에 static 키워드를 붙인다.
 .5. 객체의 참조값 전달
 .6. 정적은 객체가 생성되지 않아도 호출되는 메서드라서 객체안에 존재하는 인스턴스 변수들을 사용 할 수 없다.
 
 2번 문제 
 2-1
  public class Point {
  private int x, y;
  public Point(int x , int y){ // void를 제거 해준다.
  x=x;
  y=y;}}
 
 2-2
  public class MyMath {
	public int getRandom(){
		return (int) Math.random();
	}
	public double getRandom1(){ // 중복메서드이므로 getRandom의 이름을 변경 
		return Math.random();}} // 중복메서드는 자료형이나 변환형으로 값을 알 수 있지만 변환형 값으로는 구분 불가

2-3
  
  public class MyClass {
	private static String getName(){ // statice 추가
		return "MyClass";
	}
	
	public static String getClassName(){
		return getName();}}
// 정적 메서드는 특정 개체에 소속 되지 않고 객체를 생성하지 않아도 사용가능한 변수나 
 * 메서드 앞에 static 키워드를 붙인다.

 */
