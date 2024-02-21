package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PlayList;
import com.example.demo.repositories.PlayListRepository;

@Service
public class PlayListServiceImplementation 
						implements PlayListService
{
	@Autowired
	PlayListRepository prepo;

	@Override
	public void addPlaylist(PlayList playlist) {
		prepo.save(playlist);	
	}
	@Override
	public List<PlayList> fetchPlaylists() {
		return prepo.findAll();
	}
	
	
}
