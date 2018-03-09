package com.guguangming.forwarder.dto;

/**
 * Created by FUFAN on 2018/2/28.
 */
public class AdministratorInfoDto {
    //管理者编号
    private Integer administratorId;

    //管理者姓名
    private String administratorName;

    //密码
    private String password;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
