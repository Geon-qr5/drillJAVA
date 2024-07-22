package wonder;

public class Won1 {
    public static void main(String[] args) {
        // 오버로딩 연습??
        Won1 w = new Won1();
        w.overLoding();
        w.overLoding(1);
        w.overLoding("1");

        // 오버라이딩 연습??
        w.println();
    }

    public void overLoding() {
        System.out.println("오버로딩1");
    }

    public void overLoding(int num1) {
        System.out.println("오버로딩 num1");
    }

    public void overLoding(String str1) {
        System.out.println("오버로딩 Str1");
    }

    public void println() {
        System.out.println("오버라이딩");
    }
    
}

