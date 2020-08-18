package com.zeongit.share.exception

import com.zeongit.share.constant.ExceptionCodeConstant

class PermissionException(message: String, status: Int = ExceptionCodeConstant.PERMISSION, data: Any? = null)
    : BaseException(message, status, data)
