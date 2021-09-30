package br.com.elosinfo.campaign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class CampaignApplication : SpringBootServletInitializer(){

	protected override fun configure(application: SpringApplicationBuilder) : SpringApplicationBuilder {
		return application.sources(CampaignApplication::class.java)
	}
}

fun main(args: Array<String>) {
	runApplication<CampaignApplication>(*args)
}
