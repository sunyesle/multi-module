package com.sunyesle.multi_module.storage.db;

import com.sunyesle.multi_module.domain.Member;
import com.sunyesle.multi_module.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {
    private final MemberEntityRepository memberEntityRepository;

    public List<Member> getAll() {
        return memberEntityRepository.findAll().stream()
                .map(MemberEntity::to)
                .toList();
    }
}
