package com.example;

public class Main {

	public static void main(String[] args) {
		Env env = new EnvStringImpl();

		method(env);
	}

	private static void method(Env env) {
		String type = env.getSomeType();
		System.out.println(type);
	}
}
