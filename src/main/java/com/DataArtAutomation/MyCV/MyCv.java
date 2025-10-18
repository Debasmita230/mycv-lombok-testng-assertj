package com.DataArtAutomation.MyCV;


import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class MyCv {
	
	private String name;
	private int age;
	private String address;
	private String email;
	private String technicalSkills;
	private String phoneNumber;
	

}
