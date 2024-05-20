package com.roomType.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomTypeService {

    @Autowired
    RoomTypeRepository repository;

    public List<RoomType> getAll() {return repository.findAll();}
}
