package com.bilgeadam.commentapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserFindAllResponseDto {

    private  String name;
    private  String surName;
    private  String email;
    private String telephone;
    List<Long> favProducts;
}
