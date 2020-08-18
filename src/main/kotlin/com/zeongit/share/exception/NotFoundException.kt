package com.zeongit.share.exception

import com.zeongit.share.constant.ExceptionCodeConstant

class NotFoundException(message: String, status: Int = ExceptionCodeConstant.NOT_FOUND, data: Any? = null) :
        BaseException(message, status, data)
