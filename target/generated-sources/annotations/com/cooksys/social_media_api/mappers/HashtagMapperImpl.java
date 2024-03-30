package com.cooksys.social_media_api.mappers;

import com.cooksys.social_media_api.dtos.HashtagDto;
import com.cooksys.social_media_api.entities.Hashtag;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-01T21:50:21-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.1 (Oracle Corporation)"
)
@Component
public class HashtagMapperImpl implements HashtagMapper {

    @Override
    public Hashtag dtoToEntity(HashtagDto hashtagDto) {
        if ( hashtagDto == null ) {
            return null;
        }

        Hashtag hashtag = new Hashtag();

        hashtag.setLabel( hashtagDto.getLabel() );
        hashtag.setFirstUsed( hashtagDto.getFirstUsed() );
        hashtag.setLastUsed( hashtagDto.getLastUsed() );

        return hashtag;
    }

    @Override
    public HashtagDto entityToDto(Hashtag hashtag) {
        if ( hashtag == null ) {
            return null;
        }

        HashtagDto hashtagDto = new HashtagDto();

        hashtagDto.setLabel( hashtag.getLabel() );
        hashtagDto.setFirstUsed( hashtag.getFirstUsed() );
        hashtagDto.setLastUsed( hashtag.getLastUsed() );

        return hashtagDto;
    }

    @Override
    public List<HashtagDto> entitiesToDtos(List<Hashtag> hashtag) {
        if ( hashtag == null ) {
            return null;
        }

        List<HashtagDto> list = new ArrayList<HashtagDto>( hashtag.size() );
        for ( Hashtag hashtag1 : hashtag ) {
            list.add( entityToDto( hashtag1 ) );
        }

        return list;
    }
}
