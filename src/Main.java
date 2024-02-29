public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Course math = new Course(t1, "Matematik", "MAT101", "MAT");
        Course physics = new Course(t2,"Fizik", "FZK101", "FZK");
        Course chemistry = new Course(t3,"Kimya", "KMY101", "KMY");
        Course verbalMath = new Course(t1, "Matematik Sozlu","SMAT101","SMAT");
        Course verbalPhysics = new Course(t1, "Fizik Sozlu","SFZK101","SFZK");
        Course verbalChemistry= new Course(t1, "Kimya Sozlu","SKMY","SKMY");


        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "11111111", 4, math, physics, chemistry, verbalMath, verbalPhysics, verbalChemistry);
        s1.addBulkExamNote(50,20,40, 70, 70, 70);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2211133", 4, math, physics, chemistry, verbalMath, verbalPhysics, verbalChemistry);
        s2.addBulkExamNote(100,50,40,80,50,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "221121312", 4, math, physics, chemistry, verbalMath, verbalPhysics, verbalChemistry);
        s3.addBulkExamNote(50,20,40, 90,40,70);
        s3.isPass();
    }
}