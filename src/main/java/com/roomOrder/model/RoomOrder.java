package com.roomOrder.model;

import com.member.model.Member;
import com.roomOrderList.model.RoomOrderList;
import com.roomPromotion.model.RoomPromotion;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "room_order")
public class RoomOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_order_id", nullable = false)
    private Integer roomOrderId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "promotion_id")
    private RoomPromotion promotion;

    @NotNull
    @Column(name = "room_order_date", nullable = false)
    private LocalDate roomOrderDate;

    @NotNull
    @Column(name = "room_order_status", nullable = false)
    private Boolean roomOrderStatus = false;

    @NotNull
    @Column(name = "room_amount", nullable = false)
    private Integer roomAmount;

    @NotNull
    @Column(name = "pay_amount", nullable = false)
    private Integer payAmount;

    @Column(name = "promotion_price")
    private Integer promotionPrice;

    @NotNull
    @Column(name = "check_in_date", nullable = false)
    private LocalDate checkInDate;

    @NotNull
    @Column(name = "check_out_date", nullable = false)
    private LocalDate checkOutDate;

    @Column(name = "id_confirm")
    private byte[] idConfirm;

    @Size(max = 1000)
    @Column(name = "room_order_id_req", length = 1000)
    private String roomOrderIdReq;

    @OneToOne (mappedBy = "roomOrder")
    private RoomOrderList roomOrderList;

    public RoomOrderList getRoomOrderList() {
        return roomOrderList;
    }

    public void setRoomOrderList(RoomOrderList roomOrderList) {
        this.roomOrderList = roomOrderList;
    }

    public Integer getRoomOrderId() {
        return roomOrderId;
    }

    public void setRoomOrderId(Integer roomOrderId) {
        this.roomOrderId = roomOrderId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public RoomPromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(RoomPromotion promotion) {
        this.promotion = promotion;
    }

    public LocalDate getRoomOrderDate() {
        return roomOrderDate;
    }

    public void setRoomOrderDate(LocalDate roomOrderDate) {
        this.roomOrderDate = roomOrderDate;
    }

    public Boolean getRoomOrderStatus() {
        return roomOrderStatus;
    }

    public void setRoomOrderStatus(Boolean roomOrderStatus) {
        this.roomOrderStatus = roomOrderStatus;
    }

    public Integer getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(Integer roomAmount) {
        this.roomAmount = roomAmount;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(Integer promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public byte[] getIdConfirm() {
        return idConfirm;
    }

    public void setIdConfirm(byte[] idConfirm) {
        this.idConfirm = idConfirm;
    }

    public String getRoomOrderIdReq() {
        return roomOrderIdReq;
    }

    public void setRoomOrderIdReq(String roomOrderIdReq) {
        this.roomOrderIdReq = roomOrderIdReq;
    }

}