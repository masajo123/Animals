import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {


    private Animal animal;
    private Animal animal2;

    @org.junit.jupiter.api.BeforeEach
    @DisplayName("SetUp")
    void setUp() {
        animal = new Animal("Struppi",3,"Dog","Wuff");
        animal2 = new Animal("Susi",1,"Cat","Miau");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Give Animal Loud")
    void giveAnimalLoud() {
        String expected = "Wuff";
        assertEquals(expected,animal.giveAnimalLoud());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Get Name and Age")
    void getnameAndAge() {
        String expected = "Struppi 3";
        String actual = animal.getnameAndAge();
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Age Category")
    void testAgeCategory() {
        String expected = "young animal";
        assertEquals(expected,animal.ageCategory());

        animal.setAge(8);
        String expected2 = "old animal";
        assertEquals(expected2,animal.ageCategory());

        assertEquals("baby animal",animal2.ageCategory());
    }

    @Test
    void testAge0(){
        Animal mouse = new Animal("Micky",-2,"Mouse","Iiih");
        int expected = 0;
        assertEquals(expected,mouse.getAge());
    }

    @Test
    void isABabyAnimal(){
     Assertions.assertTrue(animal2.isABabyAnimal());
    }
}