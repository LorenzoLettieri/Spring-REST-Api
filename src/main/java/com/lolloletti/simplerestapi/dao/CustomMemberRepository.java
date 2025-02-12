package com.lolloletti.simplerestapi.dao;

import com.lolloletti.simplerestapi.entities.Member;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

public interface CustomMemberRepository {

    Member randomMember();
}
