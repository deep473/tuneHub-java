package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Songs;

public interface SongsService  {
	public String addSongs(Songs song);
	public boolean songExists(String name);
	
	public List<Songs> fetchAllSongs();
	
	
	public void updateSong(Songs song);
}














