package com.example.book_my_room.service;

import com.example.book_my_room.entity.Guest;
import com.example.book_my_room.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    public Guest addGuest(Guest guest) {
        return guestRepository.save(guest);
    }
}