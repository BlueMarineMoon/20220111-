package org.comstudy21.member.view;

import org.comstudy21.member.resource.R;

public abstract class MemberView extends R {
	public void display() {
		onCreate();
	}
	public abstract void onCreate();
}
