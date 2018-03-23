package com.concretepage.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="battles")
public class Battles implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="name")
    private String name; 
	@Column(name="year")
    private String year;
	@Column(name="battle_number")	
	private String battle_number;
	@Column(name="attacker_king")	
	private String attacker_king;
	@Column(name="defender_king")	
	private String defender_king;
	@Column(name="attacker_1")	
	private String attacker_1;
	@Column(name="attacker_2")	
	private String attacker_2;
	@Column(name="attacker_3")	
	private String attacker_3;
	@Column(name="attacker_4")	
	private String attacker_4;
	@Column(name="defender_1")	
	private String defender_1;
	@Column(name="defender_2")	
	private String defender_2;
	@Column(name="defender_3")	
	private String defender_3;
	@Column(name="defender_4")	
	private String defender_4;
	@Column(name="attacker_outcome")	
	private String attacker_outcome;
	@Column(name="battle_type")	
	private String battle_type;
	@Column(name="major_death")	
	private String major_death;
	@Column(name="major_capture")	
	private String major_capture;
	@Column(name="attacker_size")	
	private String attacker_size;
	@Column(name="defender_size")	
	private String defender_size;
	@Column(name="attacker_commander")	
	private String attacker_commander;
	@Column(name="defender_commander")	
	private String defender_commander;
	@Column(name="summer")	
	private String summer;
	@Column(name="location")	
	private String location;
	@Column(name="region")	
	private String region;
	@Column(name="note")	
	private String note;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBattle_number() {
		return battle_number;
	}
	public void setBattle_number(String battle_number) {
		this.battle_number = battle_number;
	}
	public String getAttacker_king() {
		return attacker_king;
	}
	public void setAttacker_king(String attacker_king) {
		this.attacker_king = attacker_king;
	}
	public String getDefender_king() {
		return defender_king;
	}
	public void setDefender_king(String defender_king) {
		this.defender_king = defender_king;
	}
	public String getAttacker_1() {
		return attacker_1;
	}
	public void setAttacker_1(String attacker_1) {
		this.attacker_1 = attacker_1;
	}
	public String getAttacker_2() {
		return attacker_2;
	}
	public void setAttacker_2(String attacker_2) {
		this.attacker_2 = attacker_2;
	}
	public String getAttacker_3() {
		return attacker_3;
	}
	public void setAttacker_3(String attacker_3) {
		this.attacker_3 = attacker_3;
	}
	public String getAttacker_4() {
		return attacker_4;
	}
	public void setAttacker_4(String attacker_4) {
		this.attacker_4 = attacker_4;
	}
	public String getDefender_1() {
		return defender_1;
	}
	public void setDefender_1(String defender_1) {
		this.defender_1 = defender_1;
	}
	public String getDefender_2() {
		return defender_2;
	}
	public void setDefender_2(String defender_2) {
		this.defender_2 = defender_2;
	}
	public String getDefender_3() {
		return defender_3;
	}
	public void setDefender_3(String defender_3) {
		this.defender_3 = defender_3;
	}
	public String getDefender_4() {
		return defender_4;
	}
	public void setDefender_4(String defender_4) {
		this.defender_4 = defender_4;
	}
	public String getAttacker_outcome() {
		return attacker_outcome;
	}
	public void setAttacker_outcome(String attacker_outcome) {
		this.attacker_outcome = attacker_outcome;
	}
	public String getBattle_type() {
		return battle_type;
	}
	public void setBattle_type(String battle_type) {
		this.battle_type = battle_type;
	}
	public String getMajor_death() {
		return major_death;
	}
	public void setMajor_death(String major_death) {
		this.major_death = major_death;
	}
	public String getmajor_capture() {
		return major_capture;
	}
	public void setmajor_capture(String major_capture) {
		this.major_capture = major_capture;
	}
	public String getattacker_size() {
		return attacker_size;
	}
	public void setattacker_size(String attacker_size) {
		this.attacker_size = attacker_size;
	}
	public String getdefender_size() {
		return defender_size;
	}
	public void setdefender_size(String defender_size) {
		this.defender_size = defender_size;
	}
	public String getattacker_commander() {
		return attacker_commander;
	}
	public void setattacker_commander(String attacker_commander) {
		this.attacker_commander = attacker_commander;
	}
	public String getdefender_commander() {
		return defender_commander;
	}
	public void setdefender_commander(String defender_commander) {
		this.defender_commander = defender_commander;
	}
	public String getsummer() {
		return summer;
	}
	public void setsummer(String summer) {
		this.summer = summer;
	}
	public String getlocation() {
		return location;
	}
	public void setlocation(String location) {
		this.location = location;
	}
	public String getregion() {
		return region;
	}
	public void setregion(String region) {
		this.region = region;
	}
	public String getnote() {
		return note;
	}
	public void setnote(String note) {
		this.note = note;
	}
	
} 