package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.cms.entity.enums.Gender;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private Integer accountId;

    private String name;

    private Gender gender;

    private Date birthday;

    private String residentIdNumber;

    private String email;

    private String telephone;

    private String workplace;

}
