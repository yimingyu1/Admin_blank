package cn.mingyu.blankAdmin.schema;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * ClassName: BaseDAO
 * Description:
 * date: 2021/9/21 下午2:52
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
@Data
public class BaseDO {
    private int id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
