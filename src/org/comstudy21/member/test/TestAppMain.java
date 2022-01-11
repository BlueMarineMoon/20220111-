package org.comstudy21.member.test;

import org.comstudy21.member.resource.R;

public class TestAppMain extends R {
	public TestAppMain() {
		viewTest();
	}
	
	private void viewTest() {
		mainActivity.setContentView(input);
	}

	public static void main(String[] args) {
		new TestAppMain();
	}

}
