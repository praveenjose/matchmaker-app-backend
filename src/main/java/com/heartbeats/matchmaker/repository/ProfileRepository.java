package com.heartbeats.matchmaker.repository;

import com.heartbeats.matchmaker.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String>
{

}
