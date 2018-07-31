package day1;

import java.util.Scanner;

public class Sort {
	//"�ڿ��� �������� �����ϱ�"
	
	//���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
	//ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.
	//ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
	
	public static void main(String[] args) {
		//1.�Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		String input = scan.nextLine();
		int num = 0;
		try{
			num = Integer.parseInt(input);
		}catch (NumberFormatException ne) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		if (num==0) {
			System.out.println("�����մϴ�.");
			System.exit(0);
		} else if(num<=0 || num>1000000000) {
			System.out.println("1,000,000,000���� �۰ų� ���� �ڿ����� �Է��ϼ���.");
		} else {
			System.out.println("�Է��� ���� : " + num);
		}
		//2.�Է¹��� ���ڸ� �� �ڸ����� ����
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
			numlist[i] = temp%10; //�迭�� �� �ڿ�������, �Է¹��� ���� ���� ���� �ڸ�(1���ڸ���)�� ������������ ���� ����
			temp /= 10; //10���� ������ 10�� �ڸ����� 1���ڸ��� �ǵ��� ��
		}
		//�迭 ��� Ȯ���ϱ�
		//for(int i=0;i<numlist.length;i++) {
		//	System.out.println("numlist[" + i + "]=" + numlist[i]);
		//}
		//3.�迭 �������� ����
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
		//4.���
		System.out.print("�� �ڸ��� �������� ���� :");
		for(int i=0; i<size; i++) {
			System.out.print(numlist[i]);
		}

	}

}