package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.Hotel;

@Mapper
@Repository
public interface HotelRepository {
    Hotel getHotelByName(String name);

    void add(int accountId,String name,String address,String decription);

    void add(Hotel hotel);

    void removeByName(String name);

    void updateHotel();
}
