package com.tnsif.sriindu.oops;

public class RuntimePolymorphism {
		public void printmsg() {
			System.out.println("Iam from Parent class");
		}
}

class Child extends RuntimePolymorphism{
	public void printmsg() {
		System.out.println("Iam overriding my parent msg method. Iam child");
	}
}
