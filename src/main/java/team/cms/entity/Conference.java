package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Progress;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference {
    private int id;
    private int usrId;
    private String name;
    private String inviteCode;//发起人的联系方式；
    private String detail;
    private String address;
    private String startTime;
    private String endTime;
    private String rollTime;
    private String number;
    private int hotelId;
    private int fleetId;
    private int limit;
    private Progress progress ;
}
