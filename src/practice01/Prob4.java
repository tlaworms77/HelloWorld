package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		System.out.println("[���� 4] ���ڿ��� �Է� �޾Ƽ� �Ʒ��� ���� �������� ��Ÿ������ Prob1 Ŭ������ main �޽�带 �ϼ� �ϼ���. �Է� ���� ���ڿ��� �� ���ھ� ������Ű�� ����ϴ� ���α׷��Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		String inputStr = new String();
		
		System.out.print("���ڿ��� �Է��ϼ���. : ");
		inputStr = sc.nextLine();
		for(int i=inputStr.length(); i>=0; i--) {
			for(int j=0; j<inputStr.length()-i; j++) {
				System.out.print(inputStr.charAt(j));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
