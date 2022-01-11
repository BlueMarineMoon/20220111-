package org.comstudy21.member.resource;

import java.util.Hashtable;
import java.util.Scanner;

import org.comstudy21.member.controller.Controller;
import org.comstudy21.member.controller.InputController;
import org.comstudy21.member.model.MemberDAO;
import org.comstudy21.member.view.Delete;
import org.comstudy21.member.view.End;
import org.comstudy21.member.view.Input;
import org.comstudy21.member.view.List;
import org.comstudy21.member.view.MainActivity;
import org.comstudy21.member.view.MemberView;
import org.comstudy21.member.view.Modify;
import org.comstudy21.member.view.Search;

public class R {
	// title of view pages
	public static final String titleInput = "::: 입력 기능 :::";
	public static final String titleList = "::: 회원 목록 :::";
	public static final String titleSearch = "::: 검색 기능 :::";
	public static final String titleModify = "::: 수정 기능 :::";
	public static final String titleDelete = "::: 삭제 기능 :::";
	public static final String titleEnd = "::: 프로그램 종료 :::";
	public static final String titleApp = "::: 회원관리 프로그램 :::";
	public static final String titleMenu = "::: 메뉴 :::";

	public static final Scanner scan = new Scanner(System.in);

	public static final MemberView input = new Input();
	public static final MemberView list = new List();
	public static final MemberView search = new Search();
	public static final MemberView modify = new Modify();
	public static final MemberView delete = new Delete();
	public static final MemberView end = new End();
	public static final MemberView menu = new End();

	public static final MainActivity mainActivity = new MainActivity();
	
	public static final MemberDAO memDao = new MemberDAO();
	
	public static final Hashtable<Integer, Controller> ctrlMapper = new Hashtable<Integer, Controller>();
	public static final int MENU=0, INPUT=1, LIST=2, SEARCH=3, MODIFY=4, DELETE=5, END=6;
	static {
		ctrlMapper.put(MENU, new InputController());
		ctrlMapper.put(INPUT, new InputController());
		ctrlMapper.put(LIST, new InputController());
		ctrlMapper.put(SEARCH, new InputController());
		ctrlMapper.put(MODIFY, new InputController());
		ctrlMapper.put(DELETE, new InputController());
		ctrlMapper.put(END, new InputController());
	}
}
