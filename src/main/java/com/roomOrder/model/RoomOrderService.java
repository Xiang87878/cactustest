package com.roomOrder.model;

import com.room.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RoomOrderService {

    @Autowired
    RoomOrderRepository repository;

    public void addRoomOrder(RoomOrder roomOrder) {repository.save(roomOrder);}

    public void updateRoomOrder(RoomOrder roomOrder) {repository.save(roomOrder);}


    public List<RoomOrder> getAll() {return repository.findAll();}

    public RoomOrder findByPK(Integer roomOrderId) {
        Optional<RoomOrder> optional = repository.findById(roomOrderId);
        return optional.orElse(null);
    }



}
