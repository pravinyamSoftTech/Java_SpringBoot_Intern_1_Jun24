package com.pravinyam.interface01;

public interface A {
	//void m1() ;
	
	default void show1() {
        System.out.println("A's show");
    }
}
