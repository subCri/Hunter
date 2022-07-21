package com.toy.everyboard.service;

import com.toy.everyboard.dao.MemberDAO;
import com.toy.everyboard.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberDAO dao;

    @Override
    public MemberDTO selectMember() {
        return null;
    }

    @Override
    public int join(MemberDTO dto) {
        Date user_birth = dto.getUser_Birth();
        return dao.join(dto);
    }

    @Override
    public String proc() {
        return dao.proc();
    }
}
