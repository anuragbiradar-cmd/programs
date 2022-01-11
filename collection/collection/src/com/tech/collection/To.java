package com.tech.collection;

public class To {
	public static void main(String[] args) {
		String s="anurag";
		char[]ch=new char[s.length()];
		for(int i=0;i<ch.length;i++)
		{
			if(i==0)
			{
				ch[i]=char((int)(ch[i]-32));
			}
		}

	}
}
