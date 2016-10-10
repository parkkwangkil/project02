import java.util.Scanner;import org.omg.Messaging.SyncScopeHelper;

public class Test082904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("이름을 입력하세요 :");
		name = sc.nextLine();
		System.out.println("나이를 입력하세요 :");
		age = sc.nextInt();
		
		System.out.println("이름은 :"+name+"이고"+"나이는 :"+age+"입니다.");

	}

}
