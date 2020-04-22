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
		Random random = new Random();
		int num1 = random.nextInt(45)+1;
		int num2 = random.nextInt(45)+1;
		int num3 = random.nextInt(45)+1;
		int num4 = random.nextInt(45)+1;
		int num5 = random.nextInt(45)+1;
		int num6 = random.nextInt(45)+1;
		
		for(int i = 0; i<count; i++) {
			
//		if(num1 == lottos[i].getLotto()) {
//			
//		}else if(num2 == lottos[i].getLotto()) {
//			
//		}else if(num3 == lottos[i].getLotto()) {
//			
//		}else if(num4 == lottos[i].getLotto()) {
//			
//		}else if(num5 == lottos[i].getLotto()) {
//			
//		}else if(num6 == lottos[i].getLotto()){
//			
//		}
//			
		}
		return returnRank;
	}
	
	public String[] win(Lotto lotto) {
		String num = lotto.getLotto();
		String[] nums = num.split(",");
		System.out.println(nums);
		return nums;
		
		
	}


}
