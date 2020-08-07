package test01.simple.threads;

/*
 * ��� ������ ��������� 2 ������ � ��������, �� ���� �������� ��� � ��������� �������. 
 * �������� �� ����, ��� ����������� JVM
 */

public class SimpleThreads {

	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
	}

}


class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("It's Thread1: " + i);
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("  It's Thread2: " + i);
		}
	}
}
