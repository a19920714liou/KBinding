package com.benny.library.neobinding.kotlin.adapter

/**
 * Created by benny on 11/19/15.
 */
interface AdapterPagingListener {
    fun onLoadPage(previous: Any?, position: Int);
}