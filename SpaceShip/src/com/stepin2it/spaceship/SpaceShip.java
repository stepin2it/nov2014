package com.stepin2it.spaceship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Handler;

public class SpaceShip {
	
	private static LinkedHashMap<String, Channel> mChannelsHashMap = new LinkedHashMap<String, Channel>();
	private static List<Channel> mChannelsList = new ArrayList<Channel>();
	
	
	public static void main(String[] args) {
		// 1
		System.out.println(Constants.BASE_URL);
		// 2
		Constants constants = new Constants();
		System.out.println(constants.URL);
		
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
		mChannelsList.add(cnn);
		
		Channel cnbc = new Channel("CNBC", "Wall Street News", "66Hz");
		mChannelsHashMap.put("CNBC", cnbc);
		mChannelsList.add(cnbc);
		
		Channel espn = new Channel("ESPN", "Breaking News", "77Hz");
		mChannelsHashMap.put("ESPN", espn);
		mChannelsList.add(espn);
		

		
		// Now let's find the channel which has the key CNBC
		// cnn, cnbc, espn
		
		// Question we'll tackle later 
		
		System.out.println("I want the element at the second position in the list" + mChannelsList.get(1));

		
		// System.out.println("The channel with key CNBC is " + mChannelsHashMap.get("CNBC").toString());
		
		
	}
	
	public Channel getChannelAtPosition(int position) {
		Channel returnValue = null;
		int counter = 0;
		for (Channel c : mChannelsHashMap.values()) {
			if (counter == position) {
				returnValue = c;
			}
		}
		return returnValue;
	}

}
