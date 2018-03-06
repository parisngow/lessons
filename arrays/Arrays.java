public class Arrays {
    public static void main(String[] args) {
//        String[] students = new String[3];
//        students[0] = "Jim";
//        students[1] = "Tom";
//        students[2] = "Kayla";

        String[] students = {"Jim", "Tom", "Kayla"};
        // change student at specific index:
        students[1]  = "Lucas";

        int[][] marks = {{50, 68, 87}, {97, 86, 56}, {90, 87, 99}};


        /* no access to index (what number each student is in the array)
           can't change original array bc no index (is a copy of the value)
           "for every ___ in the list of ___"
        for (int mark : marks) {
                System.out.println("mark = " + mark);
        } */

        // add student into array
        String[] tempArray = new String[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }


        tempArray[3] = "Donald";
        students = tempArray;

        printStudents(students);
        changeStudents(students);
        studentsMarks(marks, students);
    }

    private static void printStudents(String[] students) {
        // access to index of student in array, able to change array values
        for (int i = 0; i < students.length; i++) {
            System.out.println("students[" + i + "] = " + students[i]);
        }
    }

    private static void changeStudents(String[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i] += " Blah";
        }
    }

    private static void studentsMarks(int[][] marks, String[] students) {
        for (int i = 0; i < marks.length; i++) {
            int[] markList = marks[i];
            System.out.println(students[i] + "'s marks");
            for (int mark : markList) {
                System.out.println("mark = " + mark);
            }
        }
    }
}
