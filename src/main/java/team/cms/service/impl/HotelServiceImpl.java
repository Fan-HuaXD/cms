package team.cms.service.impl;

import org.springframework.stereotype.Service;
import team.cms.entity.Hotel;
import team.cms.repository.HotelRepository;
import team.cms.service.HotelService;

import javax.annotation.Resource;

@Service
public class HotelServiceImpl implements HotelService {

    @Resource
    HotelRepository hotelRepository;

    @Override
    public Hotel getHotelByAccountId(int accountId) {
        return hotelRepository.getHotelByAccountId(accountId);
    }
}
