package com.imooc.pojo.bo;

import javax.validation.constraints.NotBlank;

/**
 * @author bo li
 * @date 2020-12-22 16:46
 */
public class RegistLoginBO {

    @NotBlank(message = "手机号不能为空")
    private String mobile;

    @NotBlank(message = "短信验证码不能为空")
    private String smsCode;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    @Override
    public String toString() {
        return "RejectLoginBO{" +
                "mobile='" + mobile + '\'' +
                ", cmsCode='" + smsCode + '\'' +
                '}';
    }
}
