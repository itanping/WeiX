package com.weix.service.server.user;

import com.weix.api.model.ResponseModel;
import com.weix.model.dto.user.UserDTO;

/**
 * @author tanping
 * @date 2019/6/12 15:42
 */
public interface IUserService {

    /**
     * 通过用户ID查用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    UserDTO getUserInfo(String userId);

}
