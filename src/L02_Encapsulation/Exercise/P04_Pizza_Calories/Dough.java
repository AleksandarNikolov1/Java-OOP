package L02_Encapsulation.Exercise.P04_Pizza_Calories;

public class Dough {
    private String flourType;
    private String bankingTechnique;
    private double weight;

    public Dough(String flourType, String bankingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBankingTechnique(bankingTechnique);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if ((!this.flourType.equals("White") && !this.flourType.equals("Wholegrain"))) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    private void setBankingTechnique(String bankingTechnique) {
        if ((!this.bankingTechnique.equals("Crispy") && !this.bankingTechnique.equals("Chewy")
                && this.bankingTechnique.equals("Homemade"))){
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bankingTechnique = bankingTechnique;
    }

    public double calculateCalories() {
        return 2 * this.weight * getCaloriesByDoughModifier(this.flourType, this.bankingTechnique);
    }

    private double getCaloriesByDoughModifier(String flourType, String bankingTechnique) {
        if (flourType.equals("White")) {
            switch (bankingTechnique) {
                case "Crispy":
                    return 1.5 * 0.9;
                case "Chewy":
                    return 1.5 * 1.1;
                case "Homemade":
                    return 1.5;
            }
        } else if (flourType.equals("Wholegrain")) {
            switch (bankingTechnique) {
                case "Crispy":
                    return 0.9;
                case "Chewy":
                    return 1.1;
                case "Homemade":
                    return 1.0;
            }
        }

        return -1;
    }
}
