public class Main {
    public static void main(String[] args) {
Cow cow = new Cow("120 kl",12,"Female","kai");
Cow cow1 = new Cow("120 kl",12,"Female","ai");
Cow cow2 = new Cow("500 kl",10,"Male","bak");
Cow cow3 = new Cow("234 kl",10,"Female","kut");
Cow cow4 = new Cow("50 kl",10,"Male","bei");
Sheep sheep = new Sheep("80",6,"Male","jui");
Sheep sheep1 = new Sheep("80",6,"Male","xali");
Sheep sheep2 = new Sheep("80",6,"Male","bek");
Horse horse = new Horse("400",7,"Female","ala at","Bleak");
Horse horse2 = new Horse("400",7,"Female","ala at","Bleak");
Farm farm = new Farm("Балашиха","Байкал",new
        Cow[]{cow,cow1,cow2,cow3,cow4},new Horse[]{horse,horse2}
        ,new Sheep[]{sheep,sheep1,sheep2});
Farm farm1 =new Farm("Moscow","Билал",new Cow[]{cow},new Horse[]{horse}
                ,new Sheep[]{sheep});
        System.out.println(farm);
        System.out.println(farm1);
    }
}
