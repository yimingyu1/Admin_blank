package cn.mingyu.blankAdmin.schema;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: User
 * Description:
 * date: 2021/9/21 下午2:46
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
@Data
public class UserDO extends BaseDO implements Serializable{

    private static final long serialVersionUID = 6128280373285464001L;

    private String userName;
    private String userPassword;
    private Integer deleted;
}
