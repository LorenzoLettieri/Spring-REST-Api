package com.lolloletti.simplerestapi.dao;

import com.lolloletti.simplerestapi.entities.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomMemberRepositoryImpl implements CustomMemberRepository {

    private EntityManager entityManager;

    public CustomMemberRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Member randomMember() {
        Query q = entityManager.createQuery("FROM Member");
        List<Member> list = q.getResultList();

        int randomNumber = (int)(Math.random() * list.size());

        return list.get(randomNumber);

    }
}
