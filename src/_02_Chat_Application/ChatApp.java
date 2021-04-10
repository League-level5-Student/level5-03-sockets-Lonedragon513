package _02_Chat_Application;

import javax.swing.JButton;

import _00_Click_Chat.gui.ButtonClicker;
import _01_Intro_To_Sockets.client.ClientGreeter;
import _01_Intro_To_Sockets.server.ServerGreeter;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp {
	JButton button = new JButton("CLICK");
	
	ServerGreeter server;
	ClientGreeter client;
	public static void main(String[] args) {
		new ChatApp();
	}
	
}
