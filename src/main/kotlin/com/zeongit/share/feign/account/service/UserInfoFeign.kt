package com.zeongit.share.feign.account.service

import com.zeongit.share.feign.account.vo.UserInfo
import com.zeongit.share.model.Result
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(value = "zeongit-account")
interface UserInfoFeign {
    @GetMapping("/userInfo/getByTargetId")
    fun getByTargetId(@RequestParam("targetId") targetId: Int): Result<UserInfo>

    @GetMapping("/userInfo/getByUserId")
    fun getByUserId(@RequestParam("userId") targetId: Int): Result<UserInfo>
}