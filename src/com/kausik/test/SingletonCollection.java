package com.kausik.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonCollection {
	    public static void main(String[] args) {

	        String init[] = {"One", "Two", "Three", "One", "Two", "Three"};

	        List list1 = new ArrayList<String>(Arrays.asList(init));
	        List list2 = new ArrayList<String>(Arrays.asList(init));

	        list1.remove("One");
	        System.out.println("List1 after removing One"+list1);

	        list2.removeAll(Collections.singleton("One"));
	        System.out.println("List2 after removing all One"+list2);

	    }
	}

