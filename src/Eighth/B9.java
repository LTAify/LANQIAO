package Eighth;

//标题： 分巧克力
//
//        儿童节那天有K位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
//        小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。
//
//        为了公平起见，小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。切出的巧克力需要满足：
//
//        1. 形状是正方形，边长是整数
//        2. 大小相同
//
//        例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。
//
//        当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？
//
//        输入
//        第一行包含两个整数N和K。(1 <= N, K <= 100000)
//        以下N行每行包含两个整数Hi和Wi。(1 <= Hi, Wi <= 100000)
//        输入保证每位小朋友至少能获得一块1x1的巧克力。
//
//        输出
//        输出切出的正方形巧克力最大可能的边长。

/**
 * Created by TangChen on 17/12/6.
 */
public class B9 {
    public static int main() {
        int N = 2, K = 10;
        int[] H = new int[2];
        int[] W = new int[2];
        H[0] = W[1] = 6;
        H[1] = W[0] = 5;

        H[0] = W[0] = 100;

        int m = 0;
        for (int i = 1; i <= 10000; i++) {
            int max = 0;
            for (int j = 0; j < N; j++) {
                max += (H[j] / i) * (W[j] / i);

                if(max >= K)
                    m = i;
            }
        }

        return m;
    }
}