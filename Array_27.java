public class Array_27 {
    public static void main(String[] args){
        int []marks={10,20,30,40};

        float []marks1={10.2f,30.4f,23.3f,56.6f,77.5f,9f,34.1f};

        String []student={"Rohan","Larry","Arun","Whee","Ekta"};

        System.out.println(marks.length);
        System.out.println(marks[3]);

        System.out.println(marks1.length);
        System.out.println(marks1[2]);

        System.out.println(student.length);
        System.out.println(student[0]);

        System.out.println("Using For loop ");
        for (int i=0;i<=marks1.length-1;i++){
            System.out.print(marks1[i]+" ");
        }

        System.out.println("\nPrint in reverse order");
        for (int i=marks1.length-1;i>=0;i--){
            System.out.print(marks1[i]+" ");
        }

        System.out.println();

        //Using For each loop
        for (String element:student){
            System.out.print(element+" ");
        }
    }
}
