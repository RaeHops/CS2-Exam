public class Shelter {
    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter(int ShelterDefenseLevel, int ShelterNumberOfSupplies){

numberOfSupplies = ShelterNumberOfSupplies;
defenseLevel = ShelterDefenseLevel;

    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public int getNumberOfSupplies() {
        return numberOfSupplies;
    }

    public void setNumberOfSupplies(int numberOfSupplies) {
        this.numberOfSupplies = numberOfSupplies;
    }

    public static String printInfo(){
        System.out.println("hi");
        System.out.println("The defense level of the shelter is" + defenseLevel + "/10. The number of supplies left is" + ShelterNumberOfSupplies + "/500");
        return "";
    }
}
