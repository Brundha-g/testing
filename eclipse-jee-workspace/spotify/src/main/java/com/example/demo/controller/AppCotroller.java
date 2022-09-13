package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Artist;
import com.example.demo.model.Songs;
import com.example.demo.model.Users;
import com.example.demo.repo.ArtistRepo;
import com.example.demo.repo.SongsRepo;
import com.example.demo.repo.UserRepo;


@RestController
public class AppCotroller {
	@Autowired
    ArtistRepo artistRepo;
	@Autowired
    SongsRepo songsRepo;
    @Autowired
	UserRepo userRepo;
@GetMapping("/songslist")
public List<Songs> slist(){
	return songsRepo.findAll();
}
@GetMapping("/artistlist")
public List<Artist> alist(){
	return artistRepo.findAll();
}
@GetMapping("/userlist")
public List<Users> ulist(){
	return userRepo.findAll();
}
@PostMapping("/songsave")
public void savesong(@RequestBody Songs songs){
	songsRepo.save(songs);
}
@PostMapping("/artistsave")
public void saveartist(@RequestBody Artist artist) {
	artistRepo.save(artist);
}
@PostMapping("/usersave")
public void saveuser(@RequestBody Users users) {
	userRepo.save(users);
}
}
