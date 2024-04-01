package com.zest.commom.service;
import com.zest.commom.model.User;

/**
 * @author Zest7
 * @Email tanzhangshun@163.com
 * @github https://github.com/Zest7
 * @date 2024/4/1 16:38
 * @Description: TODO
 */
public interface UserService {
    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);

    /**
     * 用于测试 mock 接口返回值
     *
     * @return
     */
    default short getNumber() {
        return 1;
    }
}
