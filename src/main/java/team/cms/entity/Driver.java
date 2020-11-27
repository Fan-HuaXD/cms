package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Gender;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    private int id;
    private int accountId;
    private int fleetId;
    private String name;
    private Gender gender;
    private String residentIdNumber;
    private String telephone;
}
