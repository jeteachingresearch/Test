/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outerinner;


public class Outer {

    public a(){}
        public aa(){}
        public aaa(){}
        public aaaa(){}
        public aaaaa(){}
        public aaaaaa(){}
        public aaaaaaa(){}
        public aaaaaaaa(){}
    
    public String get(int a, int b, int c, int d, int e, int f, int g, int h) {
        return "Outer";
    }
    
    private  class Middle {

        public String get() {
            return "Middle";
        }

        public class Inner {

            public String get() {
                return "Inner";
            }

            public String exec() {
                return Outer.this.get();
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Outer outer = new Outer();
      
        System.out.println(outer.new Middle().new Inner().exec());
    }

}
