package com.Anudip.HotelManagementSystem.ServiceImpl;

import java.util.ArrayList;

import com.Anudip.HotelManagementSystem.Model.Room;
import com.Anudip.HotelManagementSystem.Service.CustomerService;

public class CheckIn {
	public static void main(String[] args) {
		int customer_id = 1;

		Room room = new Room();
		room.setRoom_id(1);

		Room room1 = new Room();
		room1.setRoom_id(2);

		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room);
		rooms.add(room1);
		
		CustomerService customerService = new CustomerService();
		
		System.out.println(customerService.checkIn(customer_id, rooms));
	}
}
