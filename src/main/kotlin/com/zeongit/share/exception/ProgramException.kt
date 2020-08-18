package com.zeongit.share.exception

import com.zeongit.share.constant.ExceptionCodeConstant

class ProgramException(message: String, status: Int = ExceptionCodeConstant.PROGRAM, data: Any? = null)
    : BaseException(message, status, data)