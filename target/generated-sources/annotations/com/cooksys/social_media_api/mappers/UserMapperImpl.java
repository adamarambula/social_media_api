package com.cooksys.social_media_api.mappers;

import com.cooksys.social_media_api.dtos.UserRequestDto;
import com.cooksys.social_media_api.dtos.UserResponseDto;
import com.cooksys.social_media_api.entities.Credentials;
import com.cooksys.social_media_api.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-01T21:50:21-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private CredentialsMapper credentialsMapper;
    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public User responseDtoToEntity(UserResponseDto userResponseDto) {
        if ( userResponseDto == null ) {
            return null;
        }

        User user = new User();

        user.setJoined( userResponseDto.getJoined() );
        user.setProfile( profileMapper.dtoToEntity( userResponseDto.getProfile() ) );

        return user;
    }

    @Override
    public User requestDtoToEntity(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setCredentials( credentialsMapper.dtoToEntity( userRequestDto.getCredentials() ) );
        user.setProfile( profileMapper.dtoToEntity( userRequestDto.getProfile() ) );

        return user;
    }

    @Override
    public UserRequestDto entityToRequestDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserRequestDto userRequestDto = new UserRequestDto();

        userRequestDto.setCredentials( credentialsMapper.entityToDto( user.getCredentials() ) );
        userRequestDto.setProfile( profileMapper.entitiyToDto( user.getProfile() ) );

        return userRequestDto;
    }

    @Override
    public UserResponseDto entityToResponseDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setUsername( userCredentialsUsername( user ) );
        userResponseDto.setJoined( user.getJoined() );
        userResponseDto.setProfile( profileMapper.entitiyToDto( user.getProfile() ) );

        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> entitiesToResponseDtos(List<User> user) {
        if ( user == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( user.size() );
        for ( User user1 : user ) {
            list.add( entityToResponseDto( user1 ) );
        }

        return list;
    }

    private String userCredentialsUsername(User user) {
        if ( user == null ) {
            return null;
        }
        Credentials credentials = user.getCredentials();
        if ( credentials == null ) {
            return null;
        }
        String username = credentials.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
