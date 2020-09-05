package com.zeongit.share.feign.account.vo

import com.zeongit.share.feign.account.constant.Gender
import com.zeongit.share.feign.account.constant.UserState
import java.util.*


class UserInfo {
    var id: Int? = null

    var createDate: Date? = null

    var lastModifiedDate: Date? = null

    //性别
    var userId: Int = 0

    //性别
    var gender: Gender = Gender.MALE

    //生日
    var birthday: Date = Date()

    //昵称
    lateinit var nickname: String

    //简介
    lateinit var introduction: String

    //国家
    var country: String? = null

    //省份
    var province: String? = null

    //城市
    var city: String? = null

    //头像
    var avatarUrl: String? = null

    //背景图
    var background: String? = null

    //用户状态（冗余字段）
    var state: UserState = UserState.PASS
}