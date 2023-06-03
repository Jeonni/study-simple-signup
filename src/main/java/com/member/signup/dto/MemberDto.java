package com.member.signup.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자를 자동으로 만들어줌
@AllArgsConstructor // 필드를 모두 매개변수로 하는 생성자를 만들어줌
@ToString
public class MemberDto { // 회원 정보에 필요한 내용들을 필드로 정의
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
