package day1;

import java.util.Scanner;

public class Sort {
	//"자연수 내림차순 정렬하기"
	
	//수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
	//첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
	//첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
	
	public static void main(String[] args) {
		//1.입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		String input = scan.nextLine();
		int num = 0;
		try{
			num = Integer.parseInt(input);
		}catch (NumberFormatException ne) {
			System.out.println("숫자만 입력하세요.");
		}
		if (num==0) {
			System.out.println("종료합니다.");
			System.exit(0);
		} else if(num<=0 || num>1000000000) {
			System.out.println("1,000,000,000보다 작거나 같은 자연수만 입력하세요.");
		} else {
			System.out.println("입력한 숫자 : " + num);
		}
		//2.입력받은 숫자를 각 자릿수로 분해
		int n, temp;
		n = 0;
		temp = num;
		while(temp!=0) {
			n++;
			temp /= 10;
		}
		int[] numlist = new int[n];
		temp = num;
		for(int i=numlist.length-1;i>=0;i--) {
			numlist[i] = temp%10; //배열의 맨 뒤에서부터, 입력받은 수의 제일 낮은 자리(1의자리수)를 나머지연산을 통해 저장
			temp /= 10; //10으로 나누어 10의 자리수가 1의자리가 되도록 함
		}
		//배열 출력 확인하기
		//for(int i=0;i<numlist.length;i++) {
		//	System.out.println("numlist[" + i + "]=" + numlist[i]);
		//}
		//3.배열 내림차순 정렬
		int size = numlist.length;
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if(numlist[i] >= numlist[j]) {
					int a = numlist[i];
					numlist[i] = numlist[j];
					numlist[j] = a;
				}
			}
		}
		//4.출력
		System.out.print("각 자리수 내림차순 정렬 :");
		for(int i=0; i<size; i++) {
			System.out.print(numlist[i]);
		}

	}

}