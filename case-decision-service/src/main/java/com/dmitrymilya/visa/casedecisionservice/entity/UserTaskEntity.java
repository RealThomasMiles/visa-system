package com.dmitrymilya.visa.casedecisionservice.entity;

import com.dmitrymilya.visa.shared.model.DecisionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTaskEntity {

    private Long id;

    private Long visaCaseId;

    private VisaCaseEntity visaCase;

    private OffsetDateTime createDttm;

    private DecisionEnum decision;

    private Boolean isReadyForDecision = Boolean.FALSE;

}
