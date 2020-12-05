package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    private Integer id;

    private Integer accountId;//push测试

    private String name;

    private String address;

    private String detail;

    private String telephone;

}

