public class School_Student extends Class{
    private int es;
    private int ms;
    private int sg;
    private int ch;

    @Override
    public void englishSubject() {
        int es = 59;
        System.out.println(es);
        }  
        @Override
        public void mathsSubject() {
            int ms = 49;
            System.out.println(ms);
            }
            @Override
            public void geographySubject() {
                int sg = 45;
                System.out.println(sg);
                }
                @Override
                public void historySubject() {
                    int ch = 46;
                    System.out.println(ch);
                    }
                    public void averageMarks(int ec1 , int mc1 , int gc1 , int ch1) {
                        this.es = ec1;
                        this.ms = mc1;
                        this.sg = gc1;
                        this.ch = ch1;
                        
                        int avgmarks = (ec1 + mc1 + gc1 + ch1) / 4;
                        System.out.println(avgmarks);
                }
}
