// Part A
public class VirtualPet {
String name;
int energylvl;
int happylvl;
int weight;
int age;
int agemon;
    public VirtualPet(String name, int weight){
    this.name = name;
    this.weight = 5;
    }
    public String getName(){
        return name;
    }
    public String toString() {
        return (name + "'s " + "Information\n" + "Energy: " + energylvl + "\n" + "Weight: " + weight + " g\n" + "Age: " + agemon + " months\n" + age);
    }
    public void feed(){
        weight = weight + 1;
        if(weight >= 10){
            weight = 10;
        }
    }
    public int getEnergyLevel(){
        return energylvl;
    }
    public int getHappinessLevel(){
        return happylvl;
    }
    public void play(){
        happylvl = happylvl + 1;
        weight = weight - 1;
        if(happylvl <= 0){
            happylvl = 0;
        }
        if(happylvl >= 10){
            happylvl = 10;
        }
        if(weight < 5){
            weight = 5;
        }
    }
    public void updateStatus(){
        happylvl = happylvl -1;
        energylvl = energylvl - 1;
        agemon = agemon + 1;
        if(agemon > 12){
            agemon = agemon%12;
            age = age + 1;
        }
    }
}
