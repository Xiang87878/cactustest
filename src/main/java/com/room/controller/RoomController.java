package com.room.controller;


import com.room.model.Room;
import com.room.model.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("/searchRoom")
    public String searchPage() {
        return "/room/roomSearch";
    }


    @GetMapping("/getAllRoom")
    public String getAll(ModelMap model) {

        List<Room> rooms = roomService.getAll();

        model.addAttribute("rooms", rooms);

        return "/room/showAllRoom";
    }

    @GetMapping("/addRoom")
    public String addRoom(ModelMap model) {
        Room room = new Room();

        model.addAttribute("room", room);
        return "/room/addRoom";
    }

    @PostMapping("/insertRoom")
    public String insert(
            @Valid Room room,
            BindingResult result,
            ModelMap model){

        if (result.hasErrors()) {
            return "/room/addRoom";
        }

        roomService.addRoom(room);

        List<Room> rooms = roomService.getAll();
        model.addAttribute("rooms", rooms);
        return "/room/showAllRoom";

    }

    @PostMapping("/getOneRoomUpdate")
    public String getOneRoomUpdate(@RequestParam("roomId") String roomId, ModelMap model) {

        Room room = roomService.findByPK(Integer.valueOf(roomId));
        model.addAttribute("room", room);
        return "/room/updateRoom";
    }

    @PostMapping("/updateRoom")
    public String updateRoom(
            @Valid Room room,
            BindingResult result,
            ModelMap model) {

        if (result.hasErrors()) {
            return "/room/updateRoom";
        }
        roomService.updateRoom(room);

        room = roomService.findByPK(room.getRoomId());
        model.addAttribute("room", room);
        return "/room/roomIdSearch";

    }

}