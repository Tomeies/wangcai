package wc.zk;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 该类的功能描述
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-02 10:11:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-02      zk           v1.0.0               新建
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @ExcelProperty(value = "姓名")
    private String name;

    @ExcelProperty(value = "性别")
    private Integer sex;

    @ExcelProperty(value = "生日")
    private Date birthday;

    @ExcelProperty(value = "体重KG")
    private BigDecimal weight;

    private String memo;
}
