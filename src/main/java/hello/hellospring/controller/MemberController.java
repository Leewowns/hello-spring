package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    /*
    * DI : setter 주입 // 누구나 어디서  memberService.serMemberRepository() 로 갈아끼울 수 있다.
    * */
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }


    /*
   * DI : 필드 주입 // 바꿀 수 있는 방법이 없다.
  * */
//    @Autowired private MemberService memberService;


    /*
    *  DI : 생성자 주입 // 권장하는 주입
    * */
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
