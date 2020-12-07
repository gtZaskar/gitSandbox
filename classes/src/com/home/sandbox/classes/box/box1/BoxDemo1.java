package com.home.sandbox.classes.box.box1;

class BoxDemo1 { //page 166
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.dept = 15;

        vol = mybox.width * mybox.height * mybox.dept;
        System.out.println("volume of mybox equal :" + vol);

    }

}
