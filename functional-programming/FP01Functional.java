import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> values = new java.util.ArrayList<>();
        List<String> courses = List.of(
                "Spring",
                "Spring Boot",
                "Api",
                "Microservices",
                "AWS",
                "PCF",
                "Azure",
                "Docker",
                "Kubernetes"
        );
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        readList(values);
        readEvenValues(values);
        readOddValues(values);
        readIndividualCourses(courses);
        printCoursesContainSpring(courses);
        printCourseSizeGT4(courses);
        printSquares(values);
        printCubeOfOddNum(values);
        printNumOfCharInEachCourseName(courses);
    }

    public static void readList(List<Integer>values)
    {
        // convert values into stream and for each element call print method
        values
                .forEach(System.out::print);
        System.out.println();
    }

    public static void readEvenValues(List<Integer>values)
    {
        // convert values into stream and for each element call print method
        values.stream()
                .filter(val -> val%2==0) // Lambda function
                .forEach(System.out::print);
        System.out.println();
    }
    public static  void readOddValues(List<Integer>values)
    {
        values.stream()
                .filter(val -> !(val%2 ==0))
                .forEach(System.out::print);
        System.out.println();
    }

    public static void readIndividualCourses  (List<String>courses)
    {
        courses
                .forEach((course)-> System.out.print(course+" "));
        System.out.println();
    }

    public static void printCoursesContainSpring (List<String>courses)
    {

        courses.stream()
                .filter((course)->course.contains("Spring"))
                .forEach((course)-> System.out.print(course+" "));
        System.out.println();
    }

    public static void printCourseSizeGT4 (List<String>courses)
    {

        courses.stream()
                .filter((course)->course.length()>=4)
                .forEach((course)->System.out.print(course+" "));
        System.out.println();
    }

    public static void printSquares(List<Integer> values)
    {
        values.stream()
                .map((value)->value*value) //
                .forEach(System.out::println);
    }
    public static void printCubeOfOddNum(List<Integer> values)
    {
        values.stream()
                .filter((number)->!(number%2==0))
                .map((number)->number*number*number)
                .forEach(System.out::println);
    }

    public static void printNumOfCharInEachCourseName(List<String> courses)
    {
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);
    }






}
