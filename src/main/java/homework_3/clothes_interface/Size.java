package homework_3.clothes_interface;

public enum Size {
    XXS(40){
        @Override
        public void getDescription() {
            System.out.println(Size.XXS + " is " + this.euroSize + " euroSize");
        }
    },
    XS(39){
        @Override
        public void getDescription() {
            System.out.println(Size.XS + " is " + this.euroSize + " euroSize");
        }
    },
    S(38){
        @Override
        public void getDescription() {
            System.out.println(Size.S + " is " + this.euroSize + " euroSize");
        }
    },
    M(37){
        @Override
        public void getDescription() {
            System.out.println(Size.M + " is " + this.euroSize + " euroSize");
        }
    },
    L(36){
        @Override
        public void getDescription() {
            System.out.println(Size.L + " is " + this.euroSize + " euroSize");
        }
    };


    public final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract void getDescription();
}
