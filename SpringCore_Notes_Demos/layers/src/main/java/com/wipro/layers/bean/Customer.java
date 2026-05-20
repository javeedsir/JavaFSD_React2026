package com.wipro.layers.bean;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	
		private  int cid;
		private String cname;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		
		
		
		

}
