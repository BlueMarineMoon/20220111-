package org.comstudy21.member.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class MemberDAO {
	private static final Vector<MemberDTO> memList = new Vector<MemberDTO>();
	
	public List<MemberDTO> selectAll(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Collections.copy(list, memList);
		return list;
	}
	public MemberDTO selectOne(MemberDTO dto) {
		MemberDTO member = null;
		int i = memList.indexOf(dto);
		if(i!=-1) {
			member = memList.get(i);
		}
		return member;
	}
	
	public List<MemberDTO> selectByName(String name) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		for(int i=0; i<memList.size(); i++) {
			MemberDTO mem = memList.get(i);
			if(name.equals(memList.get(i).getName())) {
				list.add((MemberDTO)mem.clone());
			}
		}
		return list;
	}
	
	public boolean delete(MemberDTO dto) {
		return memList.remove(dto);
	}
	
	public MemberDTO update(MemberDTO dto) {
		int i = memList.indexOf(dto);
		if(i!=-1) {
			return memList.set(0, dto);
		} else {
			return null;
		}
		
	}
	
	public List<MemberDTO> fileLoad() {
		return null;
	}
	
	public boolean filesave(List<MemberDTO> list) {
		return false;
	}
	
}
