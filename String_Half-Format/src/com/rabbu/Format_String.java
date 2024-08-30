package com.rabbu;

public class Format_String {
public static void main(String[] args) {
	String str="This is Apple My Name Is Rabbuni";
	int mid=str.length()/2;
	String lowerCase="";
	String upperCase="";
	for(int i=0;i<str.length();i++) {
		if(i<mid) {
			lowerCase= lowerCase+Character.toLowerCase(str.charAt(i));
		}else
			upperCase= upperCase+Character.toUpperCase(str.charAt(i));
	}
	System.out.println(lowerCase+upperCase);
}
}
