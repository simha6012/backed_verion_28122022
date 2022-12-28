package com.smc2.employee.tickets.model;

import java.util.Map;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("weeklyTicket")
public class WeeklyTickets {
      
	String id;
	String userid;
	String adminid;
	String date;
	String sesion;
	Map<String,Map<String,String>> ticketDetails;
	String boxORAllPort;
	String masterKey;
	public WeeklyTickets(String id, String userid, String adminid, String date, String sesion,
			Map<String, Map<String, String>> ticketDetails, String boxORAllPort, String masterKey) {
		super();
		this.id = id;
		this.userid = userid;
		this.adminid = adminid;
		this.date = date;
		this.sesion = sesion;
		this.ticketDetails = ticketDetails;
		this.boxORAllPort = boxORAllPort;
		this.masterKey = masterKey;
	}
	@Override
	public String toString() {
		return "WeeklyTickets [id=" + id + ", userid=" + userid + ", adminid=" + adminid + ", date=" + date
				+ ", sesion=" + sesion + ", ticketDetails=" + ticketDetails + ", boxORAllPort=" + boxORAllPort
				+ ", masterKey=" + masterKey + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSesion() {
		return sesion;
	}
	public void setSesion(String sesion) {
		this.sesion = sesion;
	}
	public Map<String, Map<String, String>> getTicketDetails() {
		return ticketDetails;
	}
	public void setTicketDetails(Map<String, Map<String, String>> ticketDetails) {
		this.ticketDetails = ticketDetails;
	}
	public String getBoxORAllPort() {
		return boxORAllPort;
	}
	public void setBoxORAllPort(String boxORAllPort) {
		this.boxORAllPort = boxORAllPort;
	}
	public String getMasterKey() {
		return masterKey;
	}
	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}
	public WeeklyTickets() {
		
	}
	
}
