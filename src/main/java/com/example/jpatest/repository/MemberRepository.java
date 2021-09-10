package com.example.jpatest.repository;

import com.example.jpatest.vo.MemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public interface MemberRepository extends JpaRepository<MemberVo, Long> {

    //비워져 있어도 작동
    //long이 아니라 Long으로 작성

    //findBy 뒤에 컬럼명을 붙여주면 이를 이요한 검색이 가능하다
    public List<MemberVo> findById(String id);

    public List<MemberVo> findByName(String name);

    //Like 검색도 가능

    public List<MemberVo> findByNameLike(String Keyword);


}
