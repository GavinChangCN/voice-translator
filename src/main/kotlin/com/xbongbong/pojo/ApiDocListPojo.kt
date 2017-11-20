package com.xbongbong.pojo

import java.io.Serializable

/**
 * @author 章华隽
 * E-mail: GavinChangCN@163.com
 * Desc:
 * Date: 2017-06-12
 * Time: 14:15
 */


class ApiDocListPojo : Serializable {

    var page = 1
    var pageSize = 20
    var version: String = ""
    var module: String = ""
    var apiNameLike: String = ""
    var urlLike: String = ""
    var authorNameLike: String = ""
    var updateTimeStart = 0
    var updateTimeEnd = 0
    var moduleSort = ""
    var versionSort = ""
    var authorSort = ""
    var updateTimeSort = ""

    companion object {

        private const val serialVersionUID = -1L
    }
}