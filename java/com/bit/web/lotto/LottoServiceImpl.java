package com.bit.web.lotto;

import org.springframework.stereotype.Service;
import java.util.Random;
import com.bit.web.util.Ranking;

@Service
public class LottoServiceImpl implements LottoService {
	private Lotto[] lottos;
	private int count;
	
	public LottoServiceImpl() {
		lottos = new Lotto[6];
		count = 0;
	}

	@Override
	public void add(Lotto lotto) {
		lottos[count] = lotto;
		count++;
	}

	@Override
	public int count() {
		return count;
	}
	
	public Ranking detail(String userid) {
		Ranking returnRank = null;
		
		return returnRank;
	}
	
	public String[] win(Lotto lotto) {
		
		
		String num = lotto.getLotto();
		String[] nums = num.split(",");
		System.out.println(nums);
		return nums;
		
		
	}
	
	public int cal(Lotto lotto) {
		Random random = new Random();
		int number = random.nextInt(45)+1;
 
		for(int i = 0; i<count; i++) {
//			lottos[i] = ;
			
		}
		return number;
	}


}
