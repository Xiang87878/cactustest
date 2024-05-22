package com.roomOrder.controller;


import com.roomOrder.model.RoomOrder;
import com.roomOrder.model.RoomOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/roomOrder")
public class RoomOrderController {

    @Autowired
    RoomOrderService roomOrderService;

    @GetMapping("/searchRoomOrder")
    public String search(){ return "/roomOrder/roomOrderSearch"; }


    @GetMapping("/getAllRoomOrder")
    public String getAll(Model model){
        List<RoomOrder> roomOrders = roomOrderService.getAll();

        model.addAttribute("roomOrders", roomOrders);

        return "/roomOrder/showAllRoomOrders";

    }

    @GetMapping("/checkIn")
    public String checkIn(Model model) {
        List<RoomOrder> roomOrders = roomOrderService.getAll();

        model.addAttribute("roomOrders", roomOrders);
        return "/roomOrder/checkIn";
    }




}
