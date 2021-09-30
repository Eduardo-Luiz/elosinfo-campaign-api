package br.com.elosinfo.campaign.repository

import br.com.elosinfo.campaign.repository.entity.CampaignEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CampaignRepository : JpaRepository<CampaignEntity, Long> {
}