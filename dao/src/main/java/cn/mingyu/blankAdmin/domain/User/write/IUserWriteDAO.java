package cn.mingyu.blankAdmin.domain.User.write;

import cn.mingyu.blankAdmin.domain.schema.UserDO;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("insert into user_login(user_name, user_password, deleted, create_time, update_time) values" +
            " (#{userName}, #{userPassword}, #{deleted}, #{createTime}, #{updateTime})")
    int insertUser(UserDO userDO);
}
