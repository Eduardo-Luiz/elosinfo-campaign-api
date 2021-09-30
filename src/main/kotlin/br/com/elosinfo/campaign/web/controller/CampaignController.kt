package br.com.elosinfo.campaign.web.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/campaigns")
class CampaignController {
    @GetMapping("/")
    fun hello(): ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.OK).body("Olá mundo REST, começando os trabalhos!")
    }
}