package org.comstudy21.member.controller;

import org.comstudy21.member.resource.R;
import org.comstudy21.member.view.MemberView;

public class DispatcherController extends R {
	static MemberView view = null;
	public static void run() {
		view = new InputController().hadlerMapping();
		
		mainActivity.setContentView(view);
	}
}
