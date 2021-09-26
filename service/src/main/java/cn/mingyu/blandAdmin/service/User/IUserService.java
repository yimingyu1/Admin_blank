package cn.mingyu.blandAdmin.service.User;

import cn.mingyu.blankAdmin.domain.modul.UserModel;

/**
 * ClassName: UserServer
 * Description:
 * date: 2021/9/26 上午8:54
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface IUserService {

    int insertUser(UserModel userModel);
}
