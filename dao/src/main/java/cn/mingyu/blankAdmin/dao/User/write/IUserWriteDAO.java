package cn.mingyu.blankAdmin.dao.User.write;

import cn.mingyu.blankAdmin.schema.UserDO;
import org.springframework.stereotype.Repository;

/**
 * ClassName: IUserWriteDAO
 * Description:
 * date: 2021/9/21 下午4:08
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
@Repository
public interface IUserWriteDAO {


    int insertUser(UserDO userDO);
}
