package com.dmitrymilya.visa.applicationprocessingservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfoEntity {

    private Long id;

    private String email;

    private String phoneNumber;

}
