package com.heartbeats.matchmaker.controller;

import com.heartbeats.matchmaker.model.Profile;
import com.heartbeats.matchmaker.repository.ProfileRepository;
import com.heartbeats.matchmaker.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProfileController {
    @Autowired
    ProfileRepository repo;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/allProfiles")
    @CrossOrigin
    public List<Profile> getAllProfiles()
    {
        return repo.findAll();
    }

    @PostMapping("/profile")
    @CrossOrigin
    public Profile addPost(@RequestBody Profile profile)
    {
        return repo.save(profile);
    }

}
