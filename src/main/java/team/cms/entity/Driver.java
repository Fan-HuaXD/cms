package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Gender;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {

    private Integer id;

    private Integer accountId;

    private Integer fleetId;

    private String name;

    private Gender gender;

    private String residentIdNumber;

    private String telephone;

}
