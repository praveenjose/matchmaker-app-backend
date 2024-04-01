package com.heartbeats.matchmaker.repository;

import com.heartbeats.matchmaker.model.Profile;

import java.util.List;

public interface SearchRepository {
    List<Profile> findByText(String text);

}
