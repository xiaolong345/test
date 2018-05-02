package com.cn.udp;

public class test2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread a=new Thread(new test3(),"a");
		a.setPriority(10);
		a.start();
	
		Thread b=new Thread(new test3(),"b");
		b.setPriority(1);
		b.start();
	}
	
	
}

class  test3 implements Runnable{

	@Override
	public  void run() {
		for (int i = 0; i <100; i++) {
			System.out.println(Thread.currentThread().getName()+"========="+i);
		}
		
	}
	
}
