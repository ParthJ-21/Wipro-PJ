package com.wipro.oop;

public class Resturant {
	 private String name;
	 private String location;
	 private int rating;
	
	        public Resturant(String name, String location, int rating) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
	}

			public String getName() {
	            return name;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }

	        public String getLocation() {
	            return location;
	        }

	        public void setLocation(String location) {
	            this.location = location;
	        }

	        public int getRating() {
	            return rating;
	        }

	        public void setRating(int rating) {
	            this.rating = rating;
	        }
	        
	 public String toString() {
	      return "Restaurant [Name=" + name + ", Location=" + location + ", Rating=" + rating +  "]";
	        
	    }

	 
}
