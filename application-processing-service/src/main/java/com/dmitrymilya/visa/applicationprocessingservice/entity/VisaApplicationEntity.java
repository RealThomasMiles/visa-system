package com.dmitrymilya.visa.applicationprocessingservice.entity;

import com.dmitrymilya.visa.shared.entity.ApplicantInfoEntity;
import com.dmitrymilya.visa.shared.entity.VisaInfoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisaApplicationEntity {

    private Long id;

    private Long applicantInfoId;

    private ApplicantInfoEntity applicantInfo;

    private List<VisitAddressEntity> visitPoints;

    private Long visaInfoId;

    private VisaInfoEntity visaInfo;

    private byte[] attachedPhoto;

}
