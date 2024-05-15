package com.roomType.model;

import com.room.model.Room;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name = "room_type")
public class RoomType {
    @Id
    @Column(name = "room_type_id", nullable = false)
    private Integer roomTypeId;

    @Size(max = 50)
    @NotNull
    @Column(name = "room_type_name", nullable = false, length = 50)
    private String roomTypeName;

    @Size(max = 1000)
    @Column(name = "room_type_content", length = 1000)
    private String roomTypeContent;

    @NotNull
    @Column(name = "room_type_status", nullable = false)
    private Boolean roomTypeStatus = false;

    @Size(max = 50)
    @NotNull
    @Column(name = "room_type_price", nullable = false, length = 50)
    private String roomTypePrice;

    @OneToMany(mappedBy = "roomType" , cascade = CascadeType.ALL)
    private Set<Room> notificationVO;

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public String getRoomTypeContent() {
        return roomTypeContent;
    }

    public void setRoomTypeContent(String roomTypeContent) {
        this.roomTypeContent = roomTypeContent;
    }

    public Boolean getRoomTypeStatus() {
        return roomTypeStatus;
    }

    public void setRoomTypeStatus(Boolean roomTypeStatus) {
        this.roomTypeStatus = roomTypeStatus;
    }

    public String getRoomTypePrice() {
        return roomTypePrice;
    }

    public void setRoomTypePrice(String roomTypePrice) {
        this.roomTypePrice = roomTypePrice;
    }

}