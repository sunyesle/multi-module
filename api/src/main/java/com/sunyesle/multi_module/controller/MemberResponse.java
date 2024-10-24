package com.sunyesle.multi_module.controller;

import com.sunyesle.multi_module.domain.Member;
import lombok.Getter;

import java.util.List;

@Getter
public class MemberResponse {
    private final Long id;
    private final String name;

    public MemberResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<MemberResponse> from(List<Member> members) {
        return members.stream()
                .map(m -> new MemberResponse(m.getId(), m.getName()))
                .toList();
    }
}
