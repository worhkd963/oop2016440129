
public class Three {

	public static void main(String[] args) {
		// 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(while문 사용)
		int i=1 , sum=0;
		while(i<101) {
			if(i%3==0) // 3의 배수 판별
				sum+=i; // 3의 공배수 더하기
			i++; 
		}
		System.out.println(sum);
	}

}
