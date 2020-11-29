package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Gender;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private int accountId;
    private String name;
    private String residentIdNumber;
    private String email;
    private String telephone;
    private String workPlace;
    private Gender gender;
}
