package day1;

import java.util.*;

public class Sumdivisor {
	
	public static void main(String[] args) {
		//1. �Է¹ޱ�(��ȿ�� �˻�)
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		String input = scan.nextLine();
		System.out.println("�Է��� ���� : " + input);
		int num = 0;
		try{
			num = Integer.parseInt(input);
		}catch (NumberFormatException ne) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		
		//2. ��� ���ϱ�(����Ʈ�� ����)
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
		//3. ����� �� ���ϱ�(�Է¹��� ���� ��)
		
		//4. ���������� �ƴ��� �Ǻ� + ���
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