package com.ezen.spg16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.spg16.dao.IMemberDao;
import com.ezen.spg16.dto.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	IMemberDao mdao;

	public MemberVO getMember(String id) {
		return mdao.getMember(id);
	}
}