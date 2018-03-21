package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bigmac {

    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {

        private String roll="";
        private int burgers=0;
        private String sauce="";
        private List<String> ingredients = new ArrayList<>();
        public static final String ROLL_WITHSESAME = "ROLL WITH SESAME";
        public static final String ROLL_WITHOUTSESAME = "ROLL WITHOUT SESAME";
        public static final String SAUCE_STANDARD = "STANDARD";
        public static final String SAUCE_1000_ISLANDS = "1000 ISLANDS";
        public static final String SAUCE_BARBECUE = "BARBECUE";
        public static final String INGREDIENT_LETTUCE = "LETTUCE";
        public static final String INGREDIENT_ONION = "ONION";;
        public static final String INGREDIENT_BACON = "BACON";;
        public static final String INGREDIENT_CUCUMBER = "CUCUMBER";;
        public static final String INGREDIENT_CHILLI = "CHILLI";;
        public static final String INGREDIENT_MUSHROOMS = "MUSHROOMS";;
        public static final String INGREDIENT_SHRIMPS = "SHRIMPS";;
        public static final String INGREDIENT_CHEESE = "CHEESE";;

        public BigmacBuilder roll(String roll) {
            if(roll.equals(ROLL_WITHSESAME) || roll.equals(ROLL_WITHOUTSESAME)) {
                this.roll = roll;
            } else {
                throw new IllegalStateException("Roll should be 'with sesame' or 'without sesame'");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals(SAUCE_1000_ISLANDS) || sauce.equals(SAUCE_BARBECUE) || sauce.equals(SAUCE_STANDARD)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Sauce should be 'standard', '1000 islands' or 'barbecue'");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(ingredient.equals(INGREDIENT_BACON) || ingredient.equals(INGREDIENT_CHEESE) ||
                    ingredient.equals(INGREDIENT_CHILLI) || ingredient.equals(INGREDIENT_CUCUMBER) ||
                    ingredient.equals(INGREDIENT_LETTUCE) || ingredient.equals(INGREDIENT_MUSHROOMS) ||
                    ingredient.equals(INGREDIENT_ONION) || ingredient.equals(INGREDIENT_SHRIMPS)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Ingredient should be 'bacon', 'cheese', 'chilli', 'cucumber', 'lettuce', 'mushrooms', 'onion', 'shrimps'");
            }
            return this;
        }

        public Bigmac build() {
            if (roll.length()==0) {
                throw new IllegalStateException("No roll given");
            }
            if (burgers==0) {
                throw new IllegalStateException("No burgers given");
            }
            if (sauce.length()==0) {
                throw new IllegalStateException("No sauce given");
            }
            if (ingredients.size()==0) {
                throw new IllegalStateException("No ingredients given");
            }

            return new Bigmac(roll,burgers,sauce,ingredients);
        }

    }

    private Bigmac(final String roll, final int burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac:\n" +
                "   " + roll + ",\n" +
                "   " + burgers + " burgers,\n" +
                "   with " + sauce + "\n" +
                "   with " + ingredients.stream().collect(Collectors.joining(", "));
    }
}
