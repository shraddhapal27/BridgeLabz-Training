package com.functionalinterface.problem14;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PrototypeModel original = new PrototypeModel("Model-A");
		PrototypeModel copy = (PrototypeModel) original.clone();


	}

}
