package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="member")
@AllArgsConstructor
@NoArgsConstructor  
public class Member {
	@Id
	private String id;
	
	private String pwd;
	private String name;
	private String birth;
	private String email;
	private String gender;  //'남성', '여성'
	private String role;    //'admin','user'
	
	@OneToMany(mappedBy = "member", cascade=CascadeType.REMOVE)
	private List<Message> messages = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade=CascadeType.REMOVE)
	private List<Comments> comments = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade=CascadeType.REMOVE)
	private List<ReviewBoard> reviewBoards = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade=CascadeType.REMOVE)
	private List<ReviewComment> reviewComments = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade=CascadeType.REMOVE)
	private List<WishList> wishLists = new ArrayList<>();
	
	@OneToMany(mappedBy = "member", cascade=CascadeType.REMOVE)
	private List<Opentalk> opentalks=new ArrayList<>();
	
	
}
