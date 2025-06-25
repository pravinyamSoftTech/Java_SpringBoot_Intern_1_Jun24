package com.pravinyam.interface01;

public interface B extends A {
     //void m2();
	
	default void show2() {
        System.out.println("B's show");
    }
}
