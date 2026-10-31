package semana05_builder;

public class Pizza {
    private final String sabor;
    private final boolean temQueijo;
    private final String borda;

    private Pizza(Builder b) {
        this.sabor = b.sabor;
        this.temQueijo = b.temQueijo;
        this.borda = b.borda;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String sabor;
        private boolean temQueijo;
        private String borda;

        public Builder sabor(String sabor) {
            this.sabor = sabor;
            return this;
        }

        public Builder temQueijo(boolean temQueijo) {
            this.temQueijo = temQueijo;
            return this;
        }

        public Builder borda(String borda) {
            this.borda = borda;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{sabor=" + sabor + ", temQueijo=" + temQueijo + ", borda=" + borda + "}";
    }
}