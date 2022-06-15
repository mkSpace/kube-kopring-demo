package com.funin.kubekopringdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubeKopringDemoApplication

fun main(args: Array<String>) {
	runApplication<KubeKopringDemoApplication>(*args)
}
