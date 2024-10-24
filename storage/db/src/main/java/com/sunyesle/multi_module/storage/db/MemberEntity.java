package com.sunyesle.multi_module.storage.db;

import com.sunyesle.multi_module.domain.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public MemberEntity() {
    }

    public MemberEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MemberEntity from(Member domain) {
        return new MemberEntity(domain.getId(), domain.getName());
    }

    public static Member to(MemberEntity entity) {
        return new Member(entity.getId(), entity.getName());
    }
}
