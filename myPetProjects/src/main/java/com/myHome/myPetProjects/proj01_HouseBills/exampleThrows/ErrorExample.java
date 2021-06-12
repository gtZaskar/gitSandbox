package main.java.com.myHome.myPetProjects.proj01_HouseBills.exampleThrows;

public class ErrorExample {
    private ABC abc;

    public void foo() {
        //System.out.println(1/0);
        //int[] arr = new int[]{1, 2, 3};
        //arr[5] = 3;
        try {
                    abc.show();
    }catch (Exception e){
            System.out.println("divider by zero");
        }
    }
}
