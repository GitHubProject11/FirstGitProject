package com.nt.test;

public class Sample {
    public String wishMsg(String name){
    	return "good evening "+name;
    }
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.wishMsg("satya"));
        System.out.println(s.wishMsg("andey"));
	}

}
