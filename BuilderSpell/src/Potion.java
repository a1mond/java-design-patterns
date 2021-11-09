import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Potion {
    private final String name;
    private final String base;
    private final List<String> ingredients;

    private final boolean enhanced;
    private final boolean explosive;

    private Potion(PotionBuilder builder) {
        this.name = builder.name;
        this.base = builder.base;
        this.ingredients = builder.ingredients;
        this.enhanced = builder.enhanced;
        this.explosive = builder.explosive;
    }

    public static class PotionBuilder {
        private final String name;
        private final String base;
        private final List<String> ingredients;

        private boolean enhanced = false;
        private boolean explosive = false;

        public PotionBuilder(String name, String base) {
            this.name = name;
            this.base = base;
            this.ingredients = new ArrayList<>();
        }
        public PotionBuilder enhanced(boolean value) {
            this.enhanced = value;
            return this;
        }
        public PotionBuilder explosive(boolean value) {
            this.explosive = value;
            return this;
        }
        public PotionBuilder addIngredient(String value) {
            this.ingredients.add(value);
            return this;
        }
        public Potion build() {
            return new Potion(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Potion potion)) return false;
        return enhanced == potion.enhanced && explosive == potion.explosive && Objects.equals(base, potion.base) && Objects.equals(ingredients, potion.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, ingredients, enhanced, explosive);
    }

    public String getName() {
        return name;
    }

    public String getBase() {
        return base;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean isEnhanced() {
        return enhanced;
    }

    public boolean isExplosive() {
        return explosive;
    }
}
