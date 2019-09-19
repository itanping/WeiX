package com.mwei.api.dubbo.user.restapi;

import com.mwei.api.model.ResponseModel;
import com.mwei.api.dubbo.user.bo.UserBO;

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
