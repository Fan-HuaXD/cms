package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private Integer id;

    private Integer accountId;

    private String name;

    private String telephone;

    private String email;

}
