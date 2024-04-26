package com.asses.core.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="team_info")
public class Team implements Serializable
{
	    @Id
	    @GenericGenerator(name="auto_gen", strategy="increment")
	    @GeneratedValue(generator="auto_gen")
	    @Column(name="alt_key")
	    private long altkey;
	    
	    @Column(name="name")
	    private String name;
	    
	    @Column(name="team_size")
	    private String  team_size;
	    
	    @Column(name="email")
	    private String email;
	    
	    @Column(name="team_type")
	    private String team_type;
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="foreign_key")
	    private captain Captain;

		public long getAltkey() {
			return altkey;
		}

		public void setAltkey(long altkey) {
			this.altkey = altkey;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTeam_size() {
			return team_size;
		}

		public void setTeam_size(String team_size) {
			this.team_size = team_size;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTeam_type() {
			return team_type;
		}
		public void setTeam_type(String team_type) {
			this.team_type = team_type;
		}
		public captain getCaptain() {
			return Captain;
		}

		public void setCaptain(captain Captain1) {
			this.Captain = Captain1;
		}


}
