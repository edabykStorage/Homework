package com.example.womenmenwebsite.mapper;

import com.example.womenmenwebsite.dto.request.UserCreateRequestDto;
import com.example.womenmenwebsite.dto.response.UserCreateResponseDto;
import com.example.womenmenwebsite.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    UserCreateResponseDto toUserCreateResponseDto(final User user);

    User toUser(final UserCreateResponseDto userCreateResponseDto);


    UserCreateRequestDto toUserCreateRequestDto(final User user);

    User toUser(final UserCreateRequestDto userCreateRequestDto);

}
