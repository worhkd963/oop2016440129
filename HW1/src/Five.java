import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		// choose one of the following.
		// apple
		// orange
		// banana
		// peach
		System.out.println("=====choose one of the following=====");
		System.out.println("apple");
		System.out.println("orange");
		System.out.println("banana");
		System.out.println("peach");
		
		String a;
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter your choice here : ");
		a = input.nextLine();
		
		System.out.println("-------------");
		
		if(a.equals("apple"))
			System.out.println("Your choice is “apple”");
		else if(a.equals("orange"))
			System.out.println("Your choice is “orange”");
		else if(a.equals("banana"))
			System.out.println("Your choice is “banana”");
		else if(a.equals("peach"))
			System.out.println("Your choice is “peach”");
		else
			System.out.println("잘못입력하셨습니다.");
				
		
		
	}

}
