public class Student {
    String name;
    String stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    Course verbalMath;
    Course verbalPhysics;
    Course verbalChemistry;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course math, Course physics, Course chemistry, Course verbalMath, Course verbalPhysics, Course verbalChemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.verbalMath = verbalMath;
        this.verbalPhysics = verbalPhysics;
        this.verbalChemistry = verbalChemistry;
        this.average = 0.0;
        this.isPass = false;
        calcAverage();
    }

    public void addBulkExamNote(int math, int physics, int chemistry, int verbalMath, int verbalPhysics, int verbalChemistry) {
        if (0 <= math && math <= 100) {
            this.math.writtenNote = math;
        }
        if (0 <= physics && physics <= 100) {
            this.physics.writtenNote = physics;
        }
        if (0 <= chemistry && chemistry <= 100) {
            this.chemistry.writtenNote = chemistry;
        }
        if (0 <= verbalMath && verbalMath <= 100) {
            this.math.verbalNote = verbalMath;
        }
        if (0 <= verbalPhysics && verbalPhysics <= 100) {
            this.physics.verbalNote = verbalPhysics;
        }
        if (0 <= verbalChemistry && verbalChemistry <= 100) {
            this.chemistry.verbalNote = verbalChemistry;
        }

    }

    public void isPass() {
        if (this.math.writtenNote == 0 || this.physics.writtenNote == 0 || this.chemistry.writtenNote == 0 || this.math.verbalNote == 0 || this.physics.verbalNote == 0 || this.chemistry.verbalNote == 0) {
            System.out.println("Notlar tam girilmemis.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.average = (((this.math.writtenNote * 0.9) + (this.math.verbalNote * 0.1)) + ((this.physics.writtenNote * 0.8) + (this.physics.verbalNote * 0.2)) + ((this.chemistry.writtenNote * 0.7) + (this.chemistry.verbalNote * 0.3))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");

        System.out.println("Öğrenci : " + this.name);

        System.out.println("Matematik Notu : " + this.math.writtenNote);
        System.out.println("Matematik Sozlu Notu : " + this.math.verbalNote);

        System.out.println("Fizik Notu : " + this.physics.writtenNote);
        System.out.println("Fizik Sozlu Notu : " + this.physics.verbalNote);

        System.out.println("Kimya Notu : " + this.chemistry.writtenNote);
        System.out.println("Kimya Sozlu Notu : " + this.chemistry.verbalNote);

    }
}
