package com.weix.api.dubbo.user.restapi;

import com.weix.api.dubbo.user.bo.UserBO;
import com.weix.api.model.ResponseModel;

/**
 * @author tanping
 * @date 2019/6/12 14:50
 */
public interface IUserDubbo {

    /**
     * 通过用户ID查用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    ResponseModel<UserBO> getUserInfo(String userId);
}
