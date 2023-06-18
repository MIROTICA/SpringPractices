package hello.core.member;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void  join(){
    //given
        Member member = new Member(2L , "memberB" , Grade.VIP);
    //when
        memberService.join(member);
        Member findMember = memberService.findMember(2L);
    //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
