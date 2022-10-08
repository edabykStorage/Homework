package com.example.womenmenwebsite.dto.request;

import com.example.womenmenwebsite.repository.entity.EGender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserCreateRequestDto {
    private String name;
    private String email;
    private String username;
    private String password;
    private EGender gender;
}
