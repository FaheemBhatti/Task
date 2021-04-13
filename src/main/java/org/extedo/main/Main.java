package org.extedo.main;

import java.util.List;

import org.extedo.helper.StringHelper;


public class Main {

	public static void main(String[] args) throws Exception {
		
		StringHelper strHelper = new StringHelper(args[0]);
		
		strHelper.process();
		List<String> allComents = strHelper.getAllComents();
		List<String> allStrings = strHelper.getAllStrings();
		
		
		System.out.println(allComents);
		System.out.println(strHelper.getTotalCommentsCount());
		
		System.out.println(allStrings);
		System.out.println(strHelper.getTotalStringsCount());
		
	}
}
