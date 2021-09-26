package cn.mingyu.blankAdmin.domain.modul;

import cn.mingyu.blankAdmin.domain.BaseObj;
import lombok.Data;

/**
 * ClassName: UserModul
 * Description:
 * date: 2021/9/26 上午8:59
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
@Data
public class UserModel extends BaseObj {
    private String userName;
    private String userPassword;
    private int deleted;
}
