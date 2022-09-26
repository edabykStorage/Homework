package com.bilgeadam.commentapp.mapper;

import com.bilgeadam.commentapp.dto.response.ProductCreateResponseDto;
import com.bilgeadam.commentapp.dto.response.UserCreateResponseDto;
import com.bilgeadam.commentapp.dto.response.UserFindAllResponseDto;
import com.bilgeadam.commentapp.repository.entity.Product;
import com.bilgeadam.commentapp.repository.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-26T17:47:38+0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCreateResponseDto toUserCreateResponseDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserCreateResponseDto.UserCreateResponseDtoBuilder userCreateResponseDto = UserCreateResponseDto.builder();

        userCreateResponseDto.name( user.getName() );
        userCreateResponseDto.surName( user.getSurName() );
        userCreateResponseDto.email( user.getEmail() );
        userCreateResponseDto.telephone( user.getTelephone() );

        return userCreateResponseDto.build();
    }

    @Override
    public User toUser(UserCreateResponseDto userCreateResponseDto) {
        if ( userCreateResponseDto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.name( userCreateResponseDto.getName() );
        user.surName( userCreateResponseDto.getSurName() );
        user.email( userCreateResponseDto.getEmail() );
        user.telephone( userCreateResponseDto.getTelephone() );

        return user.build();
    }

    @Override
    public List<UserFindAllResponseDto> toUserFindAllResponseDto(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserFindAllResponseDto> list = new ArrayList<UserFindAllResponseDto>( userList.size() );
        for ( User user : userList ) {
            list.add( userToUserFindAllResponseDto( user ) );
        }

        return list;
    }

    @Override
    public ProductCreateResponseDto toProductCreateResponseDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductCreateResponseDto.ProductCreateResponseDtoBuilder productCreateResponseDto = ProductCreateResponseDto.builder();

        productCreateResponseDto.name( product.getName() );
        productCreateResponseDto.price( product.getPrice() );
        productCreateResponseDto.expirationDate( product.getExpirationDate() );

        return productCreateResponseDto.build();
    }

    protected UserFindAllResponseDto userToUserFindAllResponseDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserFindAllResponseDto.UserFindAllResponseDtoBuilder userFindAllResponseDto = UserFindAllResponseDto.builder();

        userFindAllResponseDto.name( user.getName() );
        userFindAllResponseDto.surName( user.getSurName() );
        userFindAllResponseDto.email( user.getEmail() );
        userFindAllResponseDto.telephone( user.getTelephone() );
        List<Long> list = user.getFavProducts();
        if ( list != null ) {
            userFindAllResponseDto.favProducts( new ArrayList<Long>( list ) );
        }

        return userFindAllResponseDto.build();
    }
}
