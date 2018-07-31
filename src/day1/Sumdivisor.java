package day1;

import java.util.*;

public class Sumdivisor {
	
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