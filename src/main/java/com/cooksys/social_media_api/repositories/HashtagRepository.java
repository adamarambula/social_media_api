package com.cooksys.social_media_api.repositories;

import com.cooksys.social_media_api.entities.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
    Optional<Hashtag> findByLabelIgnoreCase(String label);
}
