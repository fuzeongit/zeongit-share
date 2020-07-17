package com.zeongit.share.component

import com.zeongit.share.database.account.dao.UserDao
import com.zeongit.share.database.account.dao.UserInfoDao
import com.zeongit.share.database.account.entity.User
import com.zeongit.share.database.account.entity.UserInfo
import com.zeongit.share.exception.NotFoundException
import org.springframework.stereotype.Component

@Component
class UserComponent(private val userDao: UserDao, private val userInfoDao: UserInfoDao) {
    //根据id获取
    fun get(id: Int): User {
        return userDao.findById(id).orElseThrow { NotFoundException("账号不存在") }
    }

    fun getByUserId(userId: Int): UserInfo {
        return userInfoDao.findOneByUserId(userId).orElseThrow { NotFoundException("用户信息不存在") }
    }
}