package com.guoyue.test;

public class StringBufferTest {

	public static void main(String[] args) throws Exception {
		 //String 类可以直接赋值实例化，但是StringBuffer类不可以
		StringBuffer buf = new StringBuffer();
		buf.append("Hello").append("world").append("!");
		//引用传递
		change(buf);
         System.out.println(buf);
	}
	
	public static void change(StringBuffer temp){
		temp.append("\n").append("www.baidu.com");
	}

}
