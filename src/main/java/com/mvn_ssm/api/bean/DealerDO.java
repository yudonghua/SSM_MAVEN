package com.mvn_ssm.api.bean;

import java.util.Date;

public class DealerDO {
    private Long dealerId;

    private String dealerUsername;

    private String dealerSalt;

    private String dealerPassword;

    private String dealerNickname;

    private String isMobile;

    private String isEmail;

    private String isFlag;

    private String loginIp;

    private Date loginDttm;

    private Date createDttm;

    private Date modifiedDttm;

    private String delFlag;

    private Date delDttm;

    private String customerImg;

    private String captcha;

    private Date aeadDttm;

    private String pwdCaptcha;

    private Date pwdAeadDttm;

    private Long thirdId;

    private String isSeller;

    private String isTempCust;

    private String loginKey;

    private String isSiteManager;

    private Long loginErrorCount;

    private Date loginLockDttm;

    private String userUniqueCode;

    private String userSaltVal;

    private Date pcLoginDttm;

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerUsername() {
        return dealerUsername;
    }

    public void setDealerUsername(String dealerUsername) {
        this.dealerUsername = dealerUsername == null ? null : dealerUsername.trim();
    }

    public String getDealerSalt() {
        return dealerSalt;
    }

    public void setDealerSalt(String dealerSalt) {
        this.dealerSalt = dealerSalt == null ? null : dealerSalt.trim();
    }

    public String getDealerPassword() {
        return dealerPassword;
    }

    public void setDealerPassword(String dealerPassword) {
        this.dealerPassword = dealerPassword == null ? null : dealerPassword.trim();
    }

    public String getDealerNickname() {
        return dealerNickname;
    }

    public void setDealerNickname(String dealerNickname) {
        this.dealerNickname = dealerNickname == null ? null : dealerNickname.trim();
    }

    public String getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(String isMobile) {
        this.isMobile = isMobile == null ? null : isMobile.trim();
    }

    public String getIsEmail() {
        return isEmail;
    }

    public void setIsEmail(String isEmail) {
        this.isEmail = isEmail == null ? null : isEmail.trim();
    }

    public String getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(String isFlag) {
        this.isFlag = isFlag == null ? null : isFlag.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Date getLoginDttm() {
        return loginDttm;
    }

    public void setLoginDttm(Date loginDttm) {
        this.loginDttm = loginDttm;
    }

    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }

    public Date getModifiedDttm() {
        return modifiedDttm;
    }

    public void setModifiedDttm(Date modifiedDttm) {
        this.modifiedDttm = modifiedDttm;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Date getDelDttm() {
        return delDttm;
    }

    public void setDelDttm(Date delDttm) {
        this.delDttm = delDttm;
    }

    public String getCustomerImg() {
        return customerImg;
    }

    public void setCustomerImg(String customerImg) {
        this.customerImg = customerImg == null ? null : customerImg.trim();
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha == null ? null : captcha.trim();
    }

    public Date getAeadDttm() {
        return aeadDttm;
    }

    public void setAeadDttm(Date aeadDttm) {
        this.aeadDttm = aeadDttm;
    }

    public String getPwdCaptcha() {
        return pwdCaptcha;
    }

    public void setPwdCaptcha(String pwdCaptcha) {
        this.pwdCaptcha = pwdCaptcha == null ? null : pwdCaptcha.trim();
    }

    public Date getPwdAeadDttm() {
        return pwdAeadDttm;
    }

    public void setPwdAeadDttm(Date pwdAeadDttm) {
        this.pwdAeadDttm = pwdAeadDttm;
    }

    public Long getThirdId() {
        return thirdId;
    }

    public void setThirdId(Long thirdId) {
        this.thirdId = thirdId;
    }

    public String getIsSeller() {
        return isSeller;
    }

    public void setIsSeller(String isSeller) {
        this.isSeller = isSeller == null ? null : isSeller.trim();
    }

    public String getIsTempCust() {
        return isTempCust;
    }

    public void setIsTempCust(String isTempCust) {
        this.isTempCust = isTempCust == null ? null : isTempCust.trim();
    }

    public String getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey == null ? null : loginKey.trim();
    }

    public String getIsSiteManager() {
        return isSiteManager;
    }

    public void setIsSiteManager(String isSiteManager) {
        this.isSiteManager = isSiteManager == null ? null : isSiteManager.trim();
    }

    public Long getLoginErrorCount() {
        return loginErrorCount;
    }

    public void setLoginErrorCount(Long loginErrorCount) {
        this.loginErrorCount = loginErrorCount;
    }

    public Date getLoginLockDttm() {
        return loginLockDttm;
    }

    public void setLoginLockDttm(Date loginLockDttm) {
        this.loginLockDttm = loginLockDttm;
    }

    public String getUserUniqueCode() {
        return userUniqueCode;
    }

    public void setUserUniqueCode(String userUniqueCode) {
        this.userUniqueCode = userUniqueCode == null ? null : userUniqueCode.trim();
    }

    public String getUserSaltVal() {
        return userSaltVal;
    }

    public void setUserSaltVal(String userSaltVal) {
        this.userSaltVal = userSaltVal == null ? null : userSaltVal.trim();
    }

    public Date getPcLoginDttm() {
        return pcLoginDttm;
    }

    public void setPcLoginDttm(Date pcLoginDttm) {
        this.pcLoginDttm = pcLoginDttm;
    }
}