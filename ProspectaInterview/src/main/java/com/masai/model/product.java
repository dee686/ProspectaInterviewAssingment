package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class product {
	
	 private Long id;
	    private String title;
	    private Double price;
	    private String description;
	    private String category;
	    private String image;
	    private Rating rating; // Nested object for rating

	    @Data
	    @AllArgsConstructor
	    @NoArgsConstructor
	    public static class Rating {
	        private Double rate;
	        private Integer count;
	    }

}
