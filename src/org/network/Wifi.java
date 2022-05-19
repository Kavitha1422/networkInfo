package org.network;

public class Wifi {
	private void wifiName() {
System.out.println("wifiName is Dreamer");
	}
	public static void main(String[] args) {
		Wifi wi = new Wifi();
		wi.wifiName();
		MobileData mob = new MobileData();
		mob.dataName();
		Lan l = new Lan();
		l.lanName();
		Wireless wr = new Wireless();
		wr.modamName();
	}
}
