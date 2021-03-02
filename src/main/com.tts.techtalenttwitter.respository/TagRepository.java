package com.tts.TechTalentTwitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.TechTalentTwitter.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
    public Tag findByPhrase(String phrase);
}
