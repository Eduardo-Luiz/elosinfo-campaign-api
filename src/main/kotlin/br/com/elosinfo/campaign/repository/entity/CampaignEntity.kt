package br.com.elosinfo.campaign.repository.entity

import com.fasterxml.jackson.annotation.JsonInclude
import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class CampaignEntity(
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name="id")
    var id: Long,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name = "id_author")
    val idAuthor: Long,

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Column(name="title")
    val title: String,

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Column(name="description")
    val description: String,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="active")
    val active: Boolean,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="start_date")
    val startDate: LocalDateTime,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="end_date")
    val endDate: LocalDateTime,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now()
)
