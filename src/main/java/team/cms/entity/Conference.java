package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Progress;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference {

    private Integer id;

    private Integer usrId;

    private String name;

    private String inviteCode;

    private String detail;

    private String address;

    private String startTime;

    private String endTime;

    private String enrollTime;

    private String number;

    private Integer hotelId;

    private Integer fleetId;

    private Integer limit;

    private Progress progress ;
}

