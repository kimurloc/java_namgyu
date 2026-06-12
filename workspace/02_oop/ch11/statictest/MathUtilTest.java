package ch11.statictest;

public class MathUtilTest {
    public static void main(String[] args){
        //MathUtil m = new MathUtil();

        // static으로 인해 new 연산자 없이도 접근가능
        // MatuUtil의 클래스정보는 method영역에 로딩, stack 과 힙은 x
        double area = MathUtil.PI*5*5;
        System.out.println(area);

        System.out.println(MathUtil.add(3, 5));

        MathUtil.area();
    }
}
