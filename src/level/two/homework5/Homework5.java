package level.two.homework5;

public class Homework5 {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {
        float[] arr1 = new float[SIZE];
        float[] arr2 = new float[SIZE];

        methodArr1(arr1);
        methodArr2(arr2);
    }

    private static void methodArr1(float[] arr) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = formula(arr[i], i);
        }

        System.out.println(System.currentTimeMillis() - a);
    }

    private static void methodArr2(float[] arr) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        float[] a1 = new float[H];
        float[] a2 = new float[H];

        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);

        Thread tr1  =   new Thread(() -> {
            for (int i = 0; i < H; i++) {
                a1[i] = formula(a1[i], i);
                //System.out.println("Поток №1 " + a1[i]);
            }
        });
        Thread tr2  =   new Thread(() -> {
            for (int i = 0; i < H; i++) {
                a2[i] = formula(a2[i], i);
                //System.out.println("Поток №2 " + a2[i]);
            }
        });

        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, H);
        System.arraycopy(a2, 0, arr, H, H);

        System.out.println(System.currentTimeMillis() - a);
    }

    private static float formula(float value, int index) {
        return (float) (value * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
    }
}
