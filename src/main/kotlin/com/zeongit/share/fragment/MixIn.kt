package com.zeongit.share.fragment

import com.fasterxml.jackson.annotation.JsonIgnore


abstract class MixIn {
    @get:JsonIgnore
    abstract val keyAsNumber: Number
}