
package com.hello;

public class HelloWorld {
	
		private Message message;
		
		public void setMessage(Message message) {
			this.message = message;
		}
		
		public void print() {
			System.out.println("message:" + message.message);
		}
}
