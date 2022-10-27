public class College_Student extends Class {
    private int ec;
    private int mc;
    private int gc;
    private int ch;

    @Override
    public void englishSubject() {
        int ec = 59;
        System.out.println(ec);
        }  
        @Override
        public void mathsSubject() {
            int mc = 50;
            System.out.println(mc);
            }
            @Override
            public void geographySubject() {
                int gc = 48;
                System.out.println(gc);
                }
                @Override
                public void historySubject() {
                    int ch = 46;
                    System.out.println(ch);
                    }
                    @Override
                    public void averageMarks(int ec1 , int mc1 , int gc1 , int ch1) {
                        this.ec = ec1;
                        this.mc = mc1;
                        this.gc = gc1;
                        this.ch = ch1;
                        
                        int avgmarks = (ec1 + mc1 + gc1 + ch1) / 4;
                        System.out.println(avgmarks);
                    }
}
