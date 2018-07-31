package day1;

import java.util.*;

public class Sumdivisor {
	//"완전수의 약수들 합 구하기"
	
	//어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다. 
	//예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
	//n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
	//n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
	//이 때, 약수들은 오름차순으로 나열해야 한다.
	//n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
	
	public static void main(String[] args) {
		//1. 입력받기(유효성 검사)
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		String input = scan.nextLine();
		System.out.println("입력한 숫자 : " + input);
		int num = 0;
		try{
			num = Integer.parseInt(input);
		}catch (NumberFormatException ne) {
			System.out.println("숫자만 입력하세요.");
		}
		
		//2. 약수 구하기(리스트에 저장)
		List list = new ArrayList();
		int sum = 0;
		for(int i=1;i<num;i++) {
			int mod = num%i;
			if(mod==0) {
				list.add(i);
				sum += i;
			}
		}
		int size = list.size();
		//3. 약수의 합 구하기(입력받은 수와 비교)
		
		//4. 완전수인지 아닌지 판별 + 출력
		if(num==sum) {
			System.out.print(num + "=");
			for(int i=0;i<size;i++) {
				if(i<size-1) {
				System.out.print(list.get(i) + "+");
				} else {
					System.out.print(list.get(i));
				}
			}
		}else {
			System.out.println(num + "is NOT perfect.");
		}
		
	}

}