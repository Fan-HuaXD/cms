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

    private String number;

    private Integer userId;

    private String name;

    private String detail;

    private String address;

    private String startTime;

    private String endTime;

    private String enrollTime;

    private String inviteCode;

    private Integer hotelId;

    private Integer fleetId;

    private Progress progress;
}

