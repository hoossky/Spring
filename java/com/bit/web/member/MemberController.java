package com.bit.web.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.web.util.Messenger;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberService memberService; // new 역할
	
	@PostMapping("/join")
	public Messenger add(@RequestBody Member member) {
		int current = memberService.count();
		memberService.add(member);
		System.out.println(member);
		return(memberService.count() == (current + 1))? Messenger.SUCCESS : Messenger.FAIL;
	}
	@PostMapping("/login")
	public Messenger login(@RequestBody Member member) {
		System.out.println(member);
		return (memberService.login(member))? Messenger.SUCCESS : Messenger.FAIL;
	}
	@GetMapping("/list")
	public Member[] list(@RequestBody Member member) {
		Member[] returnList = new Member[5];
		return returnList;
	}
	@GetMapping("/count")
	public int count(@RequestBody Member member) {
		int returnCount = 0;
		return returnCount;
	}
	@GetMapping("/detail")
	public Member detail(@RequestBody Member member) {
		Member returnDetail = new Member();
		return returnDetail;
	}
	@PutMapping("/update")
	public Member update(@RequestBody Member member) {
		Member returnUpdate = new Member();
		memberService = new MemberServiceImpl();
		return returnUpdate;
	}
	@DeleteMapping("/delete")
	public Member delete(@RequestBody Member member) {
		Member returnDelete = new Member();
		memberService = new MemberServiceImpl();
		return returnDelete;
	}
}