package com.cooksys.social_media_api.mappers;

import com.cooksys.social_media_api.dtos.CredentialsDto;
import com.cooksys.social_media_api.entities.Credentials;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-01T21:50:21-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.1 (Oracle Corporation)"
)
@Component
public class CredentialsMapperImpl implements CredentialsMapper {

    @Override
    public Credentials dtoToEntity(CredentialsDto credentialsDto) {
        if ( credentialsDto == null ) {
            return null;
        }

        Credentials credentials = new Credentials();

        credentials.setUsername( credentialsDto.getUsername() );
        credentials.setPassword( credentialsDto.getPassword() );

        return credentials;
    }

    @Override
    public CredentialsDto entityToDto(Credentials credentials) {
        if ( credentials == null ) {
            return null;
        }

        CredentialsDto credentialsDto = new CredentialsDto();

        credentialsDto.setUsername( credentials.getUsername() );
        credentialsDto.setPassword( credentials.getPassword() );

        return credentialsDto;
    }
}
