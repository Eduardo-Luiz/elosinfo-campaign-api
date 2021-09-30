package br.com.elosinfo.campaign.web.controller

import br.com.elosinfo.campaign.repository.CampaignRepository
import br.com.elosinfo.campaign.repository.entity.CampaignEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/campaigns")
class CampaignController(
    val campaignRepository: CampaignRepository
) {

    @GetMapping
    public fun getCampaigns(): ResponseEntity<List<CampaignEntity>> {
        return ResponseEntity.status(HttpStatus.OK).body(this.campaignRepository.findAll())
    }

    @GetMapping("/{id}")
    public fun getById(@PathVariable(name = "id") id: Long) : ResponseEntity<CampaignEntity> {
        return ResponseEntity.status(HttpStatus.OK).body(this.campaignRepository.findById(id).get())
    }

    @PostMapping
    public fun save(@RequestBody @Valid campaign: CampaignEntity): ResponseEntity<Boolean> {

        try {
            this.campaignRepository.save(campaign)
            return ResponseEntity.status(HttpStatus.CREATED).body(true)
        }
        catch (ex: Exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false)
        }
    }

    @PutMapping("/{id}")
    public fun update(@RequestBody @Valid campaign: CampaignEntity, @PathVariable(name = "id") id: Long): ResponseEntity<Boolean>{
        try {
            campaign.id = id;
            this.campaignRepository.save(campaign)
            return ResponseEntity.status(HttpStatus.CREATED).body(true)
        }
        catch (ex: Exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false)
        }
    }

    @DeleteMapping("/{id}")
    public fun delete(@PathVariable(name = "id") id: Long): ResponseEntity<Boolean>{
        try {
            this.campaignRepository.deleteById(id)
            return ResponseEntity.status(HttpStatus.CREATED).body(true)
        }
        catch (ex: Exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false)
        }
    }

}