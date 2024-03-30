package com.cooksys.social_media_api.mappers;

import com.cooksys.social_media_api.dtos.TweetRequestDto;
import com.cooksys.social_media_api.dtos.TweetResponseDto;
import com.cooksys.social_media_api.entities.Tweet;
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
public class TweetMapperImpl implements TweetMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Tweet requestDtoToEntity(TweetRequestDto tweetRequestDto) {
        if ( tweetRequestDto == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setContent( tweetRequestDto.getContent() );

        return tweet;
    }

    @Override
    public Tweet responseDtoToEntity(TweetResponseDto tweetResponseDto) {
        if ( tweetResponseDto == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setId( tweetResponseDto.getId() );
        tweet.setAuthor( userMapper.responseDtoToEntity( tweetResponseDto.getAuthor() ) );
        tweet.setPosted( tweetResponseDto.getPosted() );
        tweet.setContent( tweetResponseDto.getContent() );
        tweet.setInReplyTo( responseDtoToEntity( tweetResponseDto.getInReplyTo() ) );
        tweet.setRepostOf( responseDtoToEntity( tweetResponseDto.getRepostOf() ) );

        return tweet;
    }

    @Override
    public TweetRequestDto entityToRequestDto(Tweet tweet) {
        if ( tweet == null ) {
            return null;
        }

        TweetRequestDto tweetRequestDto = new TweetRequestDto();

        tweetRequestDto.setContent( tweet.getContent() );

        return tweetRequestDto;
    }

    @Override
    public TweetResponseDto entityToResponseDto(Tweet tweet) {
        if ( tweet == null ) {
            return null;
        }

        TweetResponseDto tweetResponseDto = new TweetResponseDto();

        tweetResponseDto.setId( tweet.getId() );
        tweetResponseDto.setAuthor( userMapper.entityToResponseDto( tweet.getAuthor() ) );
        tweetResponseDto.setPosted( tweet.getPosted() );
        tweetResponseDto.setContent( tweet.getContent() );
        tweetResponseDto.setInReplyTo( entityToResponseDto( tweet.getInReplyTo() ) );
        tweetResponseDto.setRepostOf( entityToResponseDto( tweet.getRepostOf() ) );

        return tweetResponseDto;
    }

    @Override
    public List<TweetResponseDto> entitiesToResponseDtos(List<Tweet> tweets) {
        if ( tweets == null ) {
            return null;
        }

        List<TweetResponseDto> list = new ArrayList<TweetResponseDto>( tweets.size() );
        for ( Tweet tweet : tweets ) {
            list.add( entityToResponseDto( tweet ) );
        }

        return list;
    }
}
