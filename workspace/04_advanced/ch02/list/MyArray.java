package ch02.list;

public class MyArray {
    private Object[] data;
    private int count;

    public MyArray(){
        this(10);
    }

    public MyArray(int size){
        this.data = new Object[size];
    }

    public void append(Object elem){
        append(count, elem);
    }

    public void append(int index, Object elem){
        if(index < 0){
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        }else if(index > count){
            throw new ArrayIndexOutOfBoundsException(index + " > " + count);
        }

        if(count >= data.length) { // 내부 배열의 공간이 다 찼을 경우 배열의 크기를 늘린다.(1.5배)
            Object[] temp = new Object[data.length + data.length/2];
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            System.out.println(data.length + " -> " + temp.length);
            data = temp;
        }

        //data[index] = elem;

        System.arraycopy(data, index, data, index + 1, count - index);
        data[index] = elem;
        count++;
    }

    public void delete(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }else if(index < 0){
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        }

        System.arraycopy(data, index + 1, data, index, count - index - 1);
        count--;
        data[count] = null;
    }

    public Object getElem(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }else if(index < 0){
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        }

        return data[index];
    }

    public int size(){
        return this.count;
    }

    public String toString() {
        String str = "[" + data[0];
        for(int i = 1; i  < count; i++){
            str += ", " + data[i];
        }
        str += "]";
        return str;
    }
}