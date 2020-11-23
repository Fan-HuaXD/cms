package team.cms.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.cms.entity.Conference;

@Mapper
@Repository
public interface ConferenceRepository {
    Conference getConferenceByName(String name);

    void add(int accountId,String name,String hostContactInfo,String introduction,
             String address,String startDate,String endDate,int conferenceNumber,
             int maxiNumberOfParticipants,String registrationDeadline,
             boolean needInvitationCode);

    void add(Conference conference);

    void removeByName(String name);

    void updateConference();
}
