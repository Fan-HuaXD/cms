package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference {
    private int id;
    private int accountId;//根据账户id查找会议发起人的名字；
    private String hostContactInfo;//发起人的联系方式；
    private String name;
    private String introduction;
    private String address;
    private String startDate;
    private String endDate;
    private int conferenceId;
    private int maxiNumberOfParticipants;
    private String registrationDeadline;
    private boolean needInvitationCode;
}
