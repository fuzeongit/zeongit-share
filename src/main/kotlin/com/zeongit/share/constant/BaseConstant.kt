package com.zeongit.share.constant

import java.util.*

object BaseConstant {
    val JWT_SECRET = Base64.getEncoder().encodeToString("zeongit".toByteArray(charset("utf-8")))

    val NOT_UUID = "00000000000000000000000000000000"

    val NOT_ID = 0
}