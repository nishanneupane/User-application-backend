package com.hotel.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="micro_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	@Id
	@Column(name="ID")
	private String userId;
	
	@Column(name="NAME",length=20)
	@NotEmpty
	private String name;
	
	@Column(name="ABOUT")
	@NotEmpty
	private String about;
	
	@Column(name="EMAIL")
	@NotEmpty
	private String email;
	
	
	private String image;
	
	@Transient
	private List<Rating> ratings=new ArrayList<>();
	

}
