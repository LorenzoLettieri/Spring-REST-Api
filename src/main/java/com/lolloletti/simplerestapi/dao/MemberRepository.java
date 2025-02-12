package com.lolloletti.simplerestapi.dao;

import com.lolloletti.simplerestapi.entities.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer>, CustomMemberRepository {

    Page<Member> findByName(String name, Pageable pageable);
    Page<Member> findBySurname(String surname, Pageable pageable);
    Page<Member> findByEmail(String email, Pageable pageable);
}
