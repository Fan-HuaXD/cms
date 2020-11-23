package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.Conference;

@Mapper
@Repository
public interface ConferenceRepository {
    Conference getConferenceByName(String name);

}
