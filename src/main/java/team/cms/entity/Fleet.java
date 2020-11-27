package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fleet {
    private int id;
    private String name;
    private String detail;
    private String telephone;
    private String diverAmount;
}
