package com.dmitrymilya.visa.shared.dto.application;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class VisaApplicationDto {

    @NotNull
    private ApplicantInfoDto applicantInfo;

    @NotNull
    private VisaInfoDto visaInfo;

    @NotNull
    private List<AddressDto> visitPoints;

    @NotNull
    private byte[] attachedPhoto;

}
