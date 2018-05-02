package com.cn.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class test1 {
	
	public static void main(String[] args) throws IOException {
		
		DatagramSocket datagramSocket=new DatagramSocket(12354);
		
		String src="Do not support Chinese!";
		DatagramPacket datagramPacket=new DatagramPacket(src.getBytes(), src.getBytes().length,new InetSocketAddress("192.168.20.59",8888));
		datagramSocket.send(datagramPacket);
		System.out.println("aa");
		datagramSocket.close();
		
		
	}

}
