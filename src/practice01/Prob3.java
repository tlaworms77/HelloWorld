package practice01;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		System.out.println("[���� 3] ���ڸ� �Է� �޾Ƽ� �Ʒ��� ���� �������� ��Ÿ������ Prob1 Ŭ������ main �޽�带 �ϼ��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		int result;
		
		int n=3;
		while(n>0) {
			n--;
			System.out.print("���ڸ� �Է��ϼ���: ");
			int val1 = sc.nextInt();
			
			result = 0;
			if(val1%2==0) {
				for(int i=0;i<=val1/2;i++)
					result += 2*i;
			}else {
				for(int i=0;i<=val1/2;i++)
					result += 2*i+1;
			}
			System.out.println("��� �� : " + result);
		}
		
		sc.close();
	}
}
