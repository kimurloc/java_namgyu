package ch06.annotation;

import java.lang.reflect.Method;

public class TimeProcessor {
    public void process(Object target){
        Method[] methods = target.getClass().getDeclaredMethods();

        for(Method method : methods){
            if(method.isAnnotationPresent(MeasureTime.class)){
                try{
                    method.invoke(target);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

                String taskName = method.getName();
                long start = System.currentTimeMillis();

                try{
                    method.invoke(target);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

                long end = System.currentTimeMillis();
                System.out.println(taskName + " execution time : " + (end - start));
            }
        }
    }
}
