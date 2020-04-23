package com.bit.web.lotto;

import com.bit.web.util.Ranking;

public interface LottoService {
	
	public void add(Lotto lotto);
	public int count();
	public Ranking detail(String userid);
	public String[] win(Lotto lotto);
	public int cal(Lotto lotto);
}
