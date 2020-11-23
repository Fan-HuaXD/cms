package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference {
    private int id;
    private int accountId;
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
