package ch07;

public class PreformanceTest {
    public static void main(String[] args){
        ConnectionPoolTest.findAll();

        long start1 = System.currentTimeMillis();
        System.out.println("without connection pool test start");
        for(int i = 1; i < 11; i++){
            JdbcPostPreparedTest.insert(2, "without - " + i, "connection pool");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("without connection pool : " + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        System.out.println("with connection pool test start");
        for(int j = 1; j < 11; j++){
            ConnectionPoolTest.insert(2, "connection - " + j, "pool");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("with connection pool : " + (end2 - start2) + "ms");
    }
}
