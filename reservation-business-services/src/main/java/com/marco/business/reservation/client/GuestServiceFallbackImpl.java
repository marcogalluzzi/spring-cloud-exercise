package com.marco.business.reservation.client;

import com.marco.business.reservation.domain.Guest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class GuestServiceFallbackImpl implements GuestService {

    @Override
    public List<Guest> findAll(String emailAddress) {
        return Collections.emptyList();
    }

    @Override
    public Optional<Guest> findById(long id) {
        Guest guest = new Guest();
        guest.setFirstName("Guest");
        guest.setLastName("Occupied");
        return Optional.of(guest);
    }
}
