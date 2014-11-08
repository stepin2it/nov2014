package com.stepin2it.spaceship;

import java.util.HashMap;
import java.util.logging.Handler;

public class SpaceShip {
	
	private static HashMap<String, Channel> mChannelsHashMap = new HashMap<String, Channel>();
	
	public static void main(String[] args) {
		System.out.println("SpaceShip initialization" + "Overloading the plus operator to mean concatenation");
		System.out.println(2 + 4);
		// Creating an instance of LaunchVehicle
		LaunchVehicle lv = new LaunchVehicle();
		// Now, we have an object called lv
		// We can use it to do things
		// Calling doTestOps on lv
		int a = 5;
		
		lv.doTestOps(a);
		System.out.print("Value of a is" + a);
		System.out.print("Value of a is " + lv.doTestOps(a));
		RocketEngine re = new RocketEngine();
		System.out.println("What is the value of re" + re.toString());
		
		Channel cnn = new Channel("CNN", "Breaking News", "55Hz");
		mChannelsHashMap.put("CNN", cnn);
		
		
		Channel cnbc = new Channel("CNBC", "Wall Street News", "66Hz");
		mChannelsHashMap.put("CNBC", cnbc);
		
		Channel espn = new Channel("ESPN", "Breaking News", "77Hz");
		mChannelsHashMap.put("ESPN", espn);
		
		
		// Now let's find the channel which has the key CNBC
		System.out.println("The channel with key CNBC is " + mChannelsHashMap.get("CNBC").toString());
		
		
		
		
		
		
		
		
		
	}

}
