package com.bit.web.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.web.util.Messenger;
import com.bit.web.util.Ranking;

@RestController
@RequestMapping("/lotto")
public class LottoController {
	@Autowired LottoService lottoService;
	
	@PostMapping("/buy")
	public Messenger buy(@RequestBody Lotto lotto) {
		int current = lottoService.count();
		lottoService.add(lotto); //[0],[1],[2],[3],[4]
		System.out.println(lotto);
		return (lottoService.count() == current + 1)? Messenger.SUCCESS : Messenger.FAIL;		
		
	}
	
	@GetMapping("/win/{userid")
	public Ranking win(@PathVariable String userid) {
		return lottoService.detail(userid);
		
	}
	

}
