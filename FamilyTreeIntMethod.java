package Homework.JAVA_HW8_OOP;

/**
 * Метод - Генеалогическое древо.
 * 
 * setDataMan -  Ввод Ф.И.О.ДР изучаемого человека.
 * setDataChild1 - Ввод степени родства.Ф.И.О.ДР 1-го ребёнка
 * setDataChild2 - Ввод степени родства.Ф.И.О.ДР 2-го ребёнка
 * setDataFather - Ввод Ф.И.О.ДР отца
 * setDataMother - Ввод Ф.И.О.ДР матери
 * showFamily - Вывод данных всей семьи 
 * showChildren - Вывод данных детей
 * showParents - Вывод данных родителей.
 */

public class FamilyTreeIntMethod  implements FamilyTreeInt{


    String manNe;
    String manPa;
    String manSu;
    String manDaOB;

    Person personMan = new Person(manNe,manPa,manSu,manDaOB);
    
    String child1Ki;
    String child1Ne;
    String child1Pa;
    String child1Se;
    String child1DaOB;

    Person child1 = new Person(child1Ki,child1Ne,child1Pa,child1Se,child1DaOB);

    String child2Ki;
    String child2Ne;
    String child2Pa;
    String child2Se;
    String child2DaOB;

    Person child2 = new Person(child2Ki,child2Ne,child2Pa,child2Se,child2DaOB);

    String fatherKi;
    String fatherNe;
    String fatherPa;
    String fatherSe;
    String fatherDaOB;

    Person father = new Person(fatherKi,fatherNe,fatherPa,fatherSe,fatherDaOB);

    String motherKi;
    String motherNe;
    String motherPa;
    String motherSe;
    String motherDaOB;

    Person mother = new Person(motherKi,motherNe,motherPa,motherSe,motherDaOB);

    public void setDataMan( String name, String patronymic, String surname, String dateOfBirth) {
        
        personMan.setName(name);
        personMan.setPatronymic(patronymic);
        personMan.setSurname(surname);
        personMan.setDateOfBirth(dateOfBirth);
        
    }
    
    @Override
    public void setDataChild1(String kinship, String name, String patronymic, String surname, String dateOfBirth) {
        
        child1.setKinship(kinship);
        child1.setName(name);
        child1.setPatronymic(patronymic);
        child1.setSurname(surname);
        child1.setDateOfBirth(dateOfBirth);        
    }
    @Override
    public void setDataChild2(String kinship, String name, String patronymic, String surname, String dateOfBirth) {
        
        child2.setKinship(kinship);
        child2.setName(name);
        child2.setPatronymic(patronymic);
        child2.setSurname(surname);
        child2.setDateOfBirth(dateOfBirth); 

    }
    @Override
    public void setDataFather(String name, String patronymic, String surname, String dateOfBirth) {
        
        father.setKinship("Отец");
        father.setName(name);
        father.setPatronymic(patronymic);
        father.setSurname(surname);
        father.setDateOfBirth(dateOfBirth);
        
    }
    @Override
    public void setDataMother( String name, String patronymic, String surname, String dateOfBirth) {
        
        mother.setKinship("Мать");
        mother.setName(name);
        mother.setPatronymic(patronymic);
        mother.setSurname(surname);
        mother.setDateOfBirth(dateOfBirth);
        
    }

    void showFamily() {
        System.out.println();
        if(personMan.getName()!=null) personMan.showManData();
        else showPersonData();        
        System.out.println("---------Семья--------");
        if (child1.getKinship()!=null){child1.showManData();}
        if (child2.getKinship()!=null){child2.showManData();}
        if (father.getKinship()!=null){father.showManData();}
        if (mother.getKinship()!=null){mother.showManData();}
                      
    }

    void showChildren() {
        System.out.println();
        if(personMan.getName()!=null) personMan.showManData();
        else showPersonData();
        System.out.println("----------Дети----------");
        if (child1.getKinship()!=null){child1.showManData();}
        if (child2.getKinship()!=null){child2.showManData();}                     
    }

    void showParents() {
        System.out.println();
        if(personMan.getName()!=null) personMan.showManData();
        else showPersonData();
        System.out.println("------------Родители----------");
        if (father.getKinship()!=null){father.showManData();}
        if (mother.getKinship()!=null){mother.showManData();}                     
    }
   
     


 
    
}
