package com.bilgeadam.commentapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserSaveResponseDto {
    private  String name;
    private  String surName;
    private  String email;

}
