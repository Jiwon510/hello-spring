package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //    회원 정보 저장
    Member save(Member member);
    //    Id를 통한 회원 정보 조회
    Optional<Member> findById(Long id);
    //    Id를 통한 회원 정보 조회
    Optional<Member> findBMember(String name);
    //    모든 회원 정보 반환
    List<Member> findAll();

}
