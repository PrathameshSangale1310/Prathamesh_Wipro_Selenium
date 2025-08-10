package Assignment5;

public class Encapsulationq5 {
	private final String name;
    private final String code;
    private final double price;
    private final String category;

    private Encapsulationq5(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;

        public Builder withName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Invalid name");
            }
            this.name = name;
            return this;
        }

        public Builder withCode(String code) {
            if (code == null || code.trim().isEmpty()) {
                throw new IllegalArgumentException("Invalid code");
            }
            this.code = code;
            return this;
        }

        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }

        public Encapsulationq5 build() {
            if (name == null || code == null) {
                throw new IllegalStateException("Name and code are required");
            }
            return new Encapsulationq5(this);
        }
    }
	public static void main(String[] args) {
		Encapsulationq5 product = new Encapsulationq5.Builder()
                .withName("Laptop")
                .withCode("P123")
                .withPrice(89999.99)
                .withCategory("Electronics")
                .build();

        System.out.println(product.getName());
        System.out.println(product.getCode());
        System.out.println(product.getPrice());
        System.out.println(product.getCategory());

	}

}
