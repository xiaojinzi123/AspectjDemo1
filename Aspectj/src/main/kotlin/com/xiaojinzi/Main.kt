package com.xiaojinzi

import org.aspectj.bridge.MessageHandler

fun main() {

    // 打印当前运行目录
    val currentProjectDir = System.getProperty("user.dir")
    println("currentProjectDir = $currentProjectDir")

    val messageHandler = MessageHandler(true)

    println("准备开始了")

    org.aspectj.tools.ajc.Main().run(
        arrayOf(
            "-showWeaveInfo",
            "-encoding", "UTF-8",
            // "-d", "$currentProjectDir/xxx",
            "-source", "1.5",
            "-target", "1.5",
            "-inpath", "$currentProjectDir/Jar-1.0.jar",
            "-aspectpath", "$currentProjectDir/Aspectj-1.0.jar",
            "-outjar", "$currentProjectDir/Jar-1.0-outputxxxxxxx.zip",
        ),
        messageHandler
    )

    println(messageHandler.errors.joinToString { it.message })

    println("结束了")

}