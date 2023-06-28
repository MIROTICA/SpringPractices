package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;
    @BeforeEach
    public void beforEach2(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){
        Long memberId = 2L;
        Member member = new Member(memberId,"memberB", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemB",20000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
