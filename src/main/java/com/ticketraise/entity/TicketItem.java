package com.ticketraise.entity;
import java.time.Duration;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TicketGenerateForQueries")
public class TicketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ticketNo = "";
    private Date date;
    private Date consideredDate;
    private String remarks;
    private String module;
    private String mode;
    private String reported;
    private String problem;
    private Date actualCloseDate;
    private String actualStatus;
    private String detailedStatus;
    private String resolvedForwardDate;
    private String resolutionProvidedByTCS;
    private String personResponsible;
    private String resolutionDate;
    private String resolutionProvidedByCedge;
    private String personResponsibleInCedge;
    private String category;
    private Date ticketCloseDateTime;

    // Aaj ki tareekh aur samay
    LocalDateTime now = LocalDateTime.now();

    // 2 din, 5 ghante, aur 30 minute
    Duration duration = Duration.ofDays(2).plusHours(5).plusMinutes(30);

    // Event ka samay nikaalna
    LocalDateTime eventTime = now.plus(duration);

}
