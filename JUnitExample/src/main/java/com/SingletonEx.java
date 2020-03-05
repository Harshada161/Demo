package com;


public class SingletonEx {
	static SingletonEx s= null;
private SingletonEx() {
	
}
public static synchronized SingletonEx createInstance() throws Exception {
	if(s==null) {
		s = new SingletonEx();
	}
	return s;
}
}