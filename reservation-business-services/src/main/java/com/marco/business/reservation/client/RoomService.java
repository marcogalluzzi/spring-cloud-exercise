package com.marco.business.reservation.client;

import com.marco.business.reservation.domain.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@FeignClient(value = "ROOMSERVICES")
public interface RoomService {

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    List<Room> findAll(@RequestParam(name="roomNumber", required=false)String roomNumber);

    @RequestMapping(value="/rooms/{id}", method = RequestMethod.GET)
    Optional<Room> findById(@PathVariable("id")long id);
}
