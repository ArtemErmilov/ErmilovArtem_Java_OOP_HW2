package Homework.JAVA_HW8_OOP;

public class HW8_Program {
    public static void main(String[] args) {

        FamilyTreeIntMethod family = new FamilyTreeIntMethod();

        //family.setDataMan("Евгений", "Сергеевич", "Ермилов", "06.12.1985");

        family.setDataChild1("Дочь", "Юлиана", "Артёмовна", "Ермилова", "04.10.2007");
        family.setDataChild2("Сын", "Ярослав", null, "Ермилов", "08.07.2009");
        family.setDataMother("Марина", "Александровна", "Ермилова", "03.06.1963");
        family.setDataFather("Сергей", "Геннадьевич", "Ермилов", "18.03.1960");

        family.showFamily();
        family.showChildren();
        family.showParents();


    }
}
