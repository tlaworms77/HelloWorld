package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		System.out.println("[����1] java.util.Scanner Ŭ������ �̿��Ͽ� �Էµ� ���� 3�� ������� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		int val = sc.nextInt();
		if(val%3==0) {
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
	}
}
