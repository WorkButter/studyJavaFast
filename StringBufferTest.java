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


StringBuffer对象的内容是可以修改的
StringBuffer类主要用于频繁修改字符串的操作上。但是在任何开发中，面对字符串的操作
大部分情况下优先考虑String类，只有在需要频繁修改时才会考虑使用StringBuffer或
StringBuilder类操作。
