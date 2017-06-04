package com.mvn_ssm.api.service;

/**
 * 商户服务接口类
 * Created by Cong Qianhao on 2017/5/28.
 */
public interface DealerService {
    /**
     * 商户登陆功能
     * @param username：商户登陆名
     * @param password：商户登陆密码
     * @return：登陆是否成功
     */
    boolean login(String username, String password);
    String getPassword(String username);
}
