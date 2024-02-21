package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Songs;
import com.example.demo.services.SongsService;


@Controller
public class SongsController {
	@Autowired
	SongsService songserv;

	@PostMapping("/addsongs")
	public String addSongs(@ModelAttribute Songs song){
		boolean status = songserv.songExists(song.getName());
		if(status==false)
		{
			songserv.addSongs(song);
			return "adminhome";
		}
		else
		{
			return "adminhome";
		}		
	}

	@GetMapping("/map-viewsongs")
	public String viewSongs(Model model) {
		List<Songs> songslist = songserv.fetchAllSongs();
		model.addAttribute("songslist", songslist);
		return "displaysongs";
	}

	@GetMapping("/viewsongs")
	public String viewCustomerSongs(Model model) {
		boolean primeCustomerStatus=true;
		if(primeCustomerStatus==true) {
			List<Songs> songslist = songserv.fetchAllSongs();
			model.addAttribute("songslist", songslist);
			return "displaysongs";
		}
		else {
			return "makepayment";
		}

	}

}

















