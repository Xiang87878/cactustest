package com.member.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "member_id", nullable = false)
    private Integer memberId;

    @Size(max = 50)
    @NotNull
    @Column(name = "member_email", nullable = false, length = 50)
    private String memberEmail;

    @Size(max = 50)
    @NotNull
    @Column(name = "member_name", nullable = false, length = 50)
    private String memberName;

    @Size(max = 50)
    @NotNull
    @Column(name = "member_password", nullable = false, length = 50)
    private String memberPassword;

    @NotNull
    @Column(name = "member_birthday", nullable = false)
    private LocalDate memberBirthday;

    @NotNull
    @Column(name = "member_gender", nullable = false)
    private Integer memberGender;

    @Size(max = 10)
    @NotNull
    @Column(name = "member_phone", nullable = false, length = 10)
    private String memberPhone;

    @Size(max = 400)
    @NotNull
    @Column(name = "member_address", nullable = false, length = 400)
    private String memberAddress;

    @Column(name = "member_pic")
    private byte[] memberPic;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public LocalDate getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(LocalDate memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public Integer getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(Integer memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public byte[] getMemberPic() {
        return memberPic;
    }

    public void setMemberPic(byte[] memberPic) {
        this.memberPic = memberPic;
    }

}