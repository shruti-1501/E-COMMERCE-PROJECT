package com.example.ecommerce_project.entity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;

	@Entity
	public class Review {
		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer id;
		
		private int rating;
		private String comments;
		
		@ManyToOne
		@JoinColumn(name="user_id")
		private User user;
		
		@ManyToOne
		@JoinColumn(name="product_id")
		private Product product;
		
		public Review() {
			// Default constructor
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		@Override
		public String toString() {
			return "Review [id=" + id + ", rating=" + rating + ", comments=" + comments + ", user=" + user + ", product="
					+ product + "]";
		}

	}

