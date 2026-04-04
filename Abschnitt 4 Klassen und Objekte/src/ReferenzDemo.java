public class ReferenzDemo {

    public static class Box{
        int inhalt;

        public Box(int inhalt){
            this.inhalt = inhalt;
        }

        public int getInhalt() {
            return inhalt;
        }

        public void setInhalt(int inhalt) {
            this.inhalt = inhalt;
        }
    }

    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = box1;
        box2.setInhalt(20);

        System.out.println("box1: "+box1.getInhalt());
        System.out.println("box2: "+box2.getInhalt());

        Box box3 = new Box(20);
        System.out.println("box1 == box3: "+(box1==box3));
        System.out.println("box1.equals(box3): "+(box1.equals(box3))); // liefert false: equals nicht überschrieben

        if(box1 !=null){
            System.out.println("box1 lebt noch.");
        }
    }
}
