public class SurvivorLeader {

    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";
    public Shelter Shelters[];


    public static void main(String[] args) {
        SurvivorLeader mycode = new SurvivorLeader();
    }

    public SurvivorLeader() {
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");

        //for (int i = 0; Shelters.length < 40; i++) {
        int i = 40;
            Shelters[i] = new Shelter((int)(Math.random()+1)*100,(int)(Math.random()+1)*1000);
       // }

        displayShelters();
        checkSupplies();
        decipher(transmission);
        newDefense();
    }
    public void displayShelters(){

        for (int i = 0; Shelters.length < 40; i++) {
            Shelters[i].printInfo();
        }

    }

    public boolean checkSupplies(){
      if (Shelters[i] = Shelters[k]) {
          System.out.println("hi");

      }
        return false;
    }
    public String decipher(String transmission){
        transmission.indexOf("5");
        System.out.println(transmission.indexOf(transmission));

       while(){
            System.out.println(transmission.indexOf(transmission));
       }
        return transmission;
    }

    public void newDefense(){

    }

}