package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private int acountId;
    private String name;
    private String residentIdNumber;
    private String email;
    private String telephone;
    private String workPlace;
}
