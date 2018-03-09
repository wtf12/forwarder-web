package com.guguangming.forwarder.service;

import com.guguangming.forwarder.dao.AdministratorInfoDao;
import com.guguangming.forwarder.dto.AdministratorInfoDto;
import com.guguangming.forwarder.entity.AdministratorInfoEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by FUFAN on 2018/2/28.
 */
@Service
public class LoginService {

    @Autowired
    private AdministratorInfoDao administratorInfoDao;

    /**
     * PC端后台管理员登录
     * @param administratorInfoDto
     * @return
     */
    public boolean administratorLogin(AdministratorInfoDto administratorInfoDto){
        AdministratorInfoEntity administratorInfoEntity = new AdministratorInfoEntity();
        BeanUtils.copyProperties(administratorInfoDto,administratorInfoEntity);
        boolean success = administratorInfoDao.checkLoginInfo(administratorInfoEntity);
        if (!success){
            return false;
        }else {
            return true;
        }
    }
}
